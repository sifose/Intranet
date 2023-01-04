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
    CardBody,
    CardTitle,Col
  } from "reactstrap";
import  "./popup.css"
import moment from 'moment';

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

function Table({ columns, data }) {

    const defaultColumn = React.useMemo(
        () => ({
            // Default Filter UI
           
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
        
        page,
        nextPage,
        previousPage
        
    } = useTable(
        {
            columns,
            data,
            defaultColumn
        },
        
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
                                    <div></div>
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
    const [datas, setDatas] = useState([]);
    const columns = React.useMemo(
        () => [
            {
                Header: 'Messagerie',
                columns: [
                    
                
                    {
                        Header: 'Module',
                        accessor: 'codeModule'
                    },
                    
                    {Header: 'Semestre',
                    accessor: 'semestre'
                    },
                    
                    {
                        Header: 'Date',
                        accessor: 'dateSeance'
                        
                        
                    }
                   
                    
                    
                ],
            },
        ],
        
    )

   
    const[data,setData]=useState([])
    

  useEffect(()=>{fetch(`http://localhost:8080/api/absence/${localStorage.getItem('username')}`,{  
    method: 'GET',
    headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Content-Type': 'application/json',}}
  ) 

    .then(res=>res.json())
    .then((result)=>{
     setData(result);
      console.log(data)
    }
  )
  },[])

  let list = []
  data.forEach((absence) => {

  if(absence.anneeDeb == localStorage.getItem('saison')){
  
  list.push(absence)
 }})




 list.sortBy(function(o){ return ( o.dateSeance ) });


    return (
        <div>
        
          <div>
          
            <Table columns={columns} data={list} />
            <br></br>
            <Container>
             <div style={{ width: "18rem" }}>
            <Card  >
           <CardBody>
             <Row>
               <div className="col">
                 <CardTitle className="text-uppercase text-muted mb-0">
                   Nombre d'absences
                 </CardTitle>
                 <span className="h2 font-weight-bold mb-0">{list.length}</span>
               </div>
               <Col className="col-auto">
                 <div >
                   <i   />
                 </div>
               </Col>
             </Row>
           </CardBody>
         </Card>
         </div></Container>
            </div>
            
            </div>
          
    )
}

export default FilterTableComponent;