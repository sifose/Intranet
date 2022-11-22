import React from "react";
import  {useEffect, useState } from 'react';
import { useTable, useFilters, useGlobalFilter, useAsyncDebounce , usePagination, useSortBy} from 'react-table'
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from "components/Headers/Header.js";
import {

    Card,
    CardBody,
    CardHeader,  
    Col,
    FormGroup,
    Container,
    Row,
    Input,
    Button,
    Form,
    InputGroup,
    InputGroupAddon,
    InputGroupText
    
  } from "reactstrap";
import  "./popup.css"
import { isLeapYear } from "date-fns";

function GlobalFilter({
    preGlobalFilteredRows,
    globalFilter,
    setGlobalFilter,
}) {
    const count = preGlobalFilteredRows.length
    const [value, setValue] = React.useState(globalFilter)
    const onChange = useAsyncDebounce(value => {
        setGlobalFilter(value || undefined)
    }, 200)

    return (
          
        <div class="p-4" style={{backgroundColor:'white', width:"30%"}} >
        <FormGroup>
        <InputGroup className="mb-4">
<InputGroupAddon addonType="prepend">
            <InputGroupText>
              <i className="ni ni-zoom-split-in" />
            </InputGroupText>
          </InputGroupAddon>
            <Input type="search" class="form-control form-control-alternative"
          
                value={value || ""}
                onChange={e => {
                    setValue(e.target.value);
                    onChange(e.target.value);
                    
                }}
                placeholder={`Search`}
            /> </InputGroup></FormGroup></div>

        
    )
}

function DefaultColumnFilter({
    column: { filterValue, preFilteredRows, setFilter },
}) {
    const count = preFilteredRows.length

    return (
        <div></div>
    )
}

function Table({ columns, data }) {

    const defaultColumn = React.useMemo(
        () => ({
            // Default Filter UI
            Filter: DefaultColumnFilter,
        }),
        []
    )

    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow,
        state,
        preGlobalFilteredRows,
        setGlobalFilter,
        page,
        nextPage,
        previousPage
        
    } = useTable(
        {
            columns,
            data,
            defaultColumn,
            initialState:{hiddenColumns:["fileDownloadUri"]}
        },
        useFilters,
        useGlobalFilter,
        useSortBy,
        usePagination,
        
    )

    return (
         <>
      <Header />

    
      
      <Container className="mt--7" fluid>
        {/* Table */}
        
        <br></br>
        <Row>
       
          <div className="col">
            <Card className="shadow">
            
              <CardHeader className="border-0">
         
              </CardHeader>
        <div>
            <GlobalFilter
                preGlobalFilteredRows={preGlobalFilteredRows}
                globalFilter={state.globalFilter}
                setGlobalFilter={setGlobalFilter}
            />
            <table className="table" responsive {...getTableProps()}>
                <thead className="thead-light">
                    {headerGroups.map(headerGroup => (
                        <tr {...headerGroup.getHeaderGroupProps()}>
                            {headerGroup.headers.map(column => (
                                <th scope="row" {...column.getHeaderProps(column.getSortByToggleProps())}
                                className={
                                    column.isSorted
                                      ? column.isSortedDesc
                                        ? "sort-desc"
                                        : "sort-asc"
                                      : ""
                                  }
                                >
                                    {column.render('Header')}
                                    {/* Render the columns filter UI */}
                                    <div>{column.canFilter ? column.render('Filter') : null}</div>
                                </th>
                            ))}
                        </tr>
                    ))}
                </thead>
                <tbody {...getTableBodyProps()}>
                    {page.map((row, i) => {
                        prepareRow(row)
                        return (
                            <tr {...row.getRowProps()}>
                                {row.cells.map(cell => {
                                    return <td {...cell.getCellProps()}>{cell.render('Cell')}</td>
                                })}
                            </tr>
                        )
                    })}
                </tbody>
            </table>
            <br />
            <button className="button" onClick={() => previousPage()}>Précédent</button>
            <button className="button" onClick={() => nextPage()}>Suivant</button>
            
        </div>
    
    </Card>
          </div>
        </Row>
      </Container>
    </>
  );
}


function FilterTableComponent() {
    const columns = React.useMemo(
        () => [
            {
                Header: 'cahier des textes',
                columns: [

                    {
                        Header: 'Module',
                        accessor: 'codeModule'
                    },
                    
                    {Header: 'date',
                    accessor: 'dateSaisie'
                    },
                    {
                        Header: 'Titre',
                        accessor: 'titre'
                    },
                    {
                        Header: 'sujet',
                        accessor: 'sujet'
                    },
                    
                    {
                        Header: 'fileDownloadUri',
                        accessor: 'fileDownloadUri'
                    },
                    {
                        
                        id: 'download',
                        
                        Cell: (tableProps) => ((tableProps.row.values.fileDownloadUri !== null) ?
                        <Button style={{cursor:'pointer'}}
                        onClick={() => {
 
                        
                        
                        console.log(tableProps.row.values.fileDownloadUri)
                       
                        fetch(`${tableProps.row.values.fileDownloadUri}`,{  
                            method: 'GET',
                            headers: {
                              'Authorization': `Bearer ${localStorage.getItem('token')}`,
                              'Accept':'*/*',
                              'Content-Type': 'application/json'}}
                          ) 
                          
                          .then((response) => {
                        
                            response.arrayBuffer().then(function (buffer) {
                        
                              const url = window.URL.createObjectURL(new Blob([buffer]));
                         
                              const link = document.createElement("a");
                              link.href = url;
                              link.download = `${tableProps.row.values.titre}.pdf`;
                              link.click();
                            });
                          })
                          .catch((err) => {
                            console.log(err);
                          });
                           
                        
                        }} color="primary" outline>
                       
                      Télécharger</Button> : null
                    ),
                  }
      
      
      
                    
                ],
            },
        ],
        []
    )

    const[data,setData]=useState([])

    const[classecourante,setClassecourante]=useState({})
    
    

    useEffect(()=>{fetch(`http://localhost:8080/api/etudiants/${localStorage.getItem('username')}`,{  
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-Type': 'application/json'}}
    ) 
      .then(res=>res.json())
      .then((result)=>{
        console.log(result)
      
      let classecourante = result.classeCouranteEt;
      
    console.log('classe '+classecourante)
    localStorage.setItem('classe',classecourante)
       
      }
    )
    },[])

  useEffect(()=>{fetch(`http://localhost:8080/api/cahierEtudiant/${localStorage.getItem('classe')}`,{  
    method: 'GET',
    headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Content-Type': 'application/json',
      
      }}
  ) 

    .then(res=>res.json())
    .then((result)=>{
     setData(result);
      
    }
  )
  },[])
 
  let list = []
        data.forEach((cah) => {
      
        if(cah.anneeDeb == localStorage.getItem('saison') & cah.confirm==1 ) {
        
        list.push(cah)
        console.log('cahiers etudiant'+list)
        }})

    return (
        <div>
        <Table columns={columns} data={list} />
            </div>

    )
}

export default FilterTableComponent;