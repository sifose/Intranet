import React from "react";
import  {useEffect, useState } from 'react';
import { useTable, useFilters, useGlobalFilter, useAsyncDebounce , usePagination, useSortBy} from 'react-table'
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from "components/Headers/Header.js";
import {
    Card,
    CardHeader, 
    Container,
    Row,
  } from "reactstrap";
import  "./popup.css"
  import useToken from "components/useToken";
import Message from "./MessageAdmin.js";
// Define a default UI for filter




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
          
            <input
                className="input"
                value={value || ""}
                onChange={e => {
                    setValue(e.target.value);
                    onChange(e.target.value);
                    
                }}
                placeholder={`Search`}
            />

        
    )
}

function DefaultColumnFilter({
    column: { filterValue, preFilteredRows, setFilter },
}) {
    const count = preFilteredRows.length

    return (
        <input
            className="form-control"
            value={filterValue || ''}
            onChange={e => {
                setFilter(e.target.value || undefined)
            }}
            placeholder={`...`}
        />
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
            defaultColumn
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
              <Message />
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
    const[classecourante,setClassecourante]=useState('')
    
    

  useEffect(()=>{fetch(`http://localhost:8080/api/etudiants/${localStorage.getItem('username')}`,{  
    method: 'GET',
    headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Accept': 'application/json',
      'Content-Type': 'application/json',}}
  ) 

    .then(res=>res.json())
    .then((result)=>{
    setClassecourante(result.classeCouranteEt);
     
    }
  )
  },[])
  console.log('classe '+classecourante);
  localStorage.setItem('classe',classecourante)
  const[data,setData]=useState([]);
  const[datas,setDatas]=useState([]);  

    
    useEffect(()=>{fetch(`http://localhost:8080/api/message/${localStorage.getItem('classe')}`,{  
        method: 'GET',
        headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
          'Content-Type': 'application/json',
          'mode': 'no-cors'}}
      ) 
    
        .then(res=>res.json())
        .then((result)=>{
         setData(result);
          
        }
      )
      },[])
      console.log('data' +data)

        let list = []
        data.forEach((message) => {
      
        if(message.typeMsg == 'Vers élèves' & message.destMsg == classecourante){
        
        list.push(message)
        console.log('liste1'+list)}})
       
         let liste = []
         data.forEach((message2) => {
         if(message2.typeMsg == 'Vers élèves' & message2.destMsg == localStorage.getItem('username')){
        
        liste.push(message2)
        console.log('liste2'+liste)}})


       
       
    
    const columns = React.useMemo(
        () => [
            {
                Header: 'Messagerie',
                columns: [
                    {
                        Header: 'Destination',
                        accessor: 'destMsg'
                    },
                    {
                        Header: 'Type',
                        accessor: 'typeMsg'
                    },
                
                
                    {
                        Header: 'Date',
                        accessor: 'dateMessage'
                    },
                    {
                        Header: 'Sujet',
                        accessor: 'subjetMsg'
                    },
                    {Header: 'Contenu',
                    accessor: 'contenuMsg'
                    },
                   
                    
                    
                ],
            },
        ],
        
    )

   
    

      



    

    return (
        <Table columns={columns} data={liste.concat(list)} />
    )
}

export default FilterTableComponent;