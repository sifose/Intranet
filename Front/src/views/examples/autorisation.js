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
            initialState:{hiddenColumns:["id"]}
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
    const[data,setData]=useState([])

    
    
    

  

  useEffect(()=>{fetch("http://localhost:8080/api/autorisations",{  
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
 
    
    const columns = React.useMemo(
        () => [
            {
                Header: 'Demandes de modification des notes',
                columns: [

                    {
                        Header: 'Id',
                        accessor: 'id'
                    },
                    
                    {
                        Header: 'Enseignant',
                        accessor: 'idEns'
                    },
                    
                    {Header: 'Elève',
                    accessor: 'idEt'
                    },
                    {
                        Header: 'Date de saisie',
                        accessor: 'dateSaisie'
                    },
                    {
                        Header: 'Justificatif',
                        accessor: 'justification'
                    },
                    {
                        
                        id: 'autorisation',
                        
                        Cell: (tableProps) => ( 
                            <Button
                        color='success'
                        className='ni ni-check-bold' outline
                        onClick={() => {

                        // ES6 Syntax use the rvalue if your data is an array.
                        const dataCopy = [...data];
                        // It should not matter what you name tableProps. It made the most sense to me.
                        dataCopy.splice(tableProps.row.index, 1)
                        
                        setData(dataCopy)
                        console.log(tableProps.row.values.id)
                        fetch(`http://localhost:8080/api/ValiderAutorisation/${tableProps.row.values.id}`, 
                        { method: 'PUT' ,
                        
                        body: JSON.stringify({
                            dateSaisie: new Date(),
                            autorisation: false
                            
                        }),
                          headers: {
                          'Authorization': `Bearer ${localStorage.getItem('token')}`,
                          'Content-Type': 'application/json'}
                        })
                        }} >
                       
                      Autoriser</Button> 
                    ),
                  },
                  {
                        
                    id: 'annuler',
                    
                    Cell: (tableProps) => (
                        <Button className='ni ni-fat-remove'
                        color='danger' outline
                    onClick={() => {

                        // ES6 Syntax use the rvalue if your data is an array.
                        const dataCopy = [...data];
                        // It should not matter what you name tableProps. It made the most sense to me.
                        dataCopy.splice(tableProps.row.index, 1)
                        
                        setData(dataCopy)

                    fetch(`http://localhost:8080/api/annulerAutorisation/${tableProps.row.values.id}`, 
                    { method: 'PUT' ,
                    body: JSON.stringify({
                        autorisation: false
                        
                    }),
                      headers: {
                      'Authorization': `Bearer ${localStorage.getItem('token')}`,
                      'Content-Type': 'application/json'}
                    })
                    }} >
                   
                  Annuler</Button> 
                ),
              }
      
      
      
                    
                ],
            },
        ],
        []
    )

    

    return (
        <div>
        <Table columns={columns} data={data} />
            </div>

    )
}

export default FilterTableComponent;