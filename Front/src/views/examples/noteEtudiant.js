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
        <div></div>
        
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
            initialState:{hiddenColumns:[]}
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
                Header: 'Résultats',
                columns: [

                    {
                        Header: 'Module',
                        accessor: 'codeModule'
                    },
                    {
                        Header: 'Orale',
                        accessor: 'orale'
                    },
                    {
                        Header: 'TP',
                        accessor: 'tp'
                    },
                    ,
                    {
                        Header: 'Devoir de controle 1',
                        accessor: 'dc1'
                    },
                    {
                        Header: 'Devoir de controle 2',
                        accessor: 'dc2'
                    },
                    {
                        Header: 'Devoir de synthèse',
                        accessor: 'ds'
                    }
      
      
      
                    
                ],
            },
        ],
        []
    )

    const[data,setData]=useState([])

    
  useEffect(()=>{fetch(`http://localhost:8080/api/noteEtudiant/${localStorage.getItem('username')}`,{  
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
  },[data])
 
  let list = []
        data.forEach((note) => {
      
        if(note.anneeDeb == localStorage.getItem('saison') & note.validation==true ) {
        
        list.push(note)
        console.log('notes eleve'+list)
        }})

    return (
        <div>
            {list.length!==0 ? (
        <Table columns={columns} data={list} />
            ):null}
            </div>

    )
}

export default FilterTableComponent;