import React from "react";
import  {useEffect, useState } from 'react';
import { useTable, useFilters, useGlobalFilter, useAsyncDebounce , usePagination, useSortBy} from 'react-table'
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from "components/Headers/Header.js";
import moment from 'moment';
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

(function(){
  if (typeof Object.defineProperty === 'function'){
    try{Object.defineProperty(Array.prototype,'sortBy',{value:sb}); }catch(e){}
  }
  if (!Array.prototype.sortBy) Array.prototype.sortBy = sb;

  function sb(f){
    for (var i=this.length;i;){
      var o = this[--i];
      this[i] = [].concat(f.call(o,o,i),o);
    }
    this.sort(function(a,b){
      for (var i=0,len=a.length;i<len;++i){
        if (a[i]!=b[i]) return a[i]>b[i]?-1:1;
      }
      return 0;
    });
    for (var i=this.length;i;){
      this[--i]=this[i][this[i].length-1];
    }
    return this;
  }
})();

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
          <nav aria-label="...">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link"  tabindex="-1" onClick={() => previousPage()}>
        <i class="fa fa-angle-left"></i>
        <span class="sr-only">Previous</span>
      </a>
    </li>
    
    <li class="page-item">
      <a class="page-link"  onClick={() => nextPage()}>
        <i class="fa fa-angle-right"></i>
        <span class="sr-only">Next</span>
      </a>
    </li>
  </ul>
</nav>
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
                    accessor: d => {
                      return moment(d.dateSaisie). add(-1, 'months')
                        .format("YYYY-MM-DD")
                    }
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

        list.sortBy(function(o){ return ( o.dateSaisie ) });

    return (
        <div>
          {list.length!==0 ? (
          <Table columns={columns} data={list} />
          ):null}
            </div>

    )
}

export default FilterTableComponent;