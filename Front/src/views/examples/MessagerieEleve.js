import React from "react";
import  {useEffect, useState } from 'react';
import { useTable, useFilters, useGlobalFilter, useAsyncDebounce , usePagination, useSortBy} from 'react-table'
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from "components/Headers/Header.js";
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  FormGroup,
  Form,
  Input,
  InputGroupAddon,
  InputGroupText,
  InputGroup,
  Modal,
  Row,
  Col,
  Container
} from "reactstrap";
import  "./popup.css"
  import useToken from "components/useToken";
import Message from "./MessageAdmin.js";
import moment from 'moment';
// Define a default UI for filter

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
            initialState:{hiddenColumns:["id","reponse"]}
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
      
        if(message.typeMsg == 'Vers élèves' & message.destMsg == classecourante
         & message.anneeDeb == localStorage.getItem('saison')){
        
        list.push(message)
        console.log('liste1'+list)}})
       
         let liste = []
         data.forEach((message2) => {
         if(message2.typeMsg == 'Vers élèves' & message2.destMsg == localStorage.getItem('username') ){
        
        liste.push(message2)
        console.log('liste2'+liste)}})

        const[data2,setData2]=useState([])

        useEffect(()=>{fetch(`http://localhost:8080/api/messageEtudEnvoye/${localStorage.getItem('username')}`,{  
          method: 'GET',
          headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Content-Type': 'application/json',}}
        ) 
      
          .then(res=>res.json())
          .then((result)=>{
           setData2(result);
            console.log(data2)
          }
        )
        },[])
      
        let list2 = []
 data2.forEach((message) => {

 if(message.anneeDeb == localStorage.getItem('saison')){
 
 list2.push(message)
}})

const [exampleModal,setExampleModal]= useState(false);

const toggleModal = () => {
setExampleModal(!exampleModal);}

const handleClick=()=>{
 setExampleModal(!exampleModal);
}

const [messageRecu,setMessageRecu]= useState({});
const [contenu,setContenu]= useState('');
const [destination,setDestination]= useState('');


async function fetchWord(id1) {

const res = await fetch(`http://localhost:8080/api/messages/${id1}`, 
{ method: 'GET' ,
 headers: {
 'Authorization': `Bearer ${localStorage.getItem('token')}`,
 'Content-Type': 'application/json'}
 });
let data1 = await res.json();
console.log(data1)
setMessageRecu(data1)
setDestination(data1.senderMsg)
}  

function submit(e){
e.preventDefault()
const message = {
 anneeDeb: localStorage.getItem('saison'),
 dateMessage: new Date,
 senderMsg: localStorage.getItem('username'),
 destMsg: destination,
contenuMsg: contenu,
subjetMsg: messageRecu.subjetMsg,
typeMsg: messageRecu.typeMsg,
etat: messageRecu.etat,
reponse: false
}

//  console.log(message);
//console.log(etudiant)
// console.log(classe)
// console.log(annee)



fetch("http://localhost:8080/api/message",{
 method:"POST",
 headers:{"Content-Type":"application/json",
 'Authorization': `Bearer ${localStorage.getItem('token')}`,
}
,
 body:JSON.stringify(message)
}).then(()=>{
console.log("New message added")
console.log(message)
alert("Message envoyé")



})

fetch(`http://localhost:8080/api/repondreMessage/${messageRecu.id}`, 
{ method: 'PUT' ,

body: JSON.stringify({
 
 reponse: true
 
}),
headers: {
'Authorization': `Bearer ${localStorage.getItem('token')}`,
'Content-Type': 'application/json'}
})
window.location.reload(false)
}


       
       
    
    const columns = React.useMemo(
        () => [
            {
                Header: 'Messagerie',
                columns: [

                  {
                    Header: 'ID',
                    accessor: 'id',
                    
                    
                },
                  {
                    Header: 'Sender',
                    accessor: 'senderMsg'
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
                    
                    {Header: 'reponse',
                    accessor: 'reponse'
                    },
                    
                  
                    {Header: 'état',

                        id: 'Répondre',
                            
                            Cell: (tableProps) => ((tableProps.row.values.senderMsg !== localStorage.getItem('username')
                            && (tableProps.row.values.reponse == false) )?


                            <Button style={{cursor:'pointer'}} 
                            onClick={(e) => {
                                handleClick(e)
                                const id1=tableProps.row.values.id
                                
                                fetchWord(id1)
                       
                        } }
                        color="info" outline >
                          Répondre
                        
                        </Button>  :(tableProps.row.values.senderMsg !== localStorage.getItem('username')
                            && (tableProps.row.values.reponse == true) )?<div>Message répondu</div>: <div>Message envoyé</div>
                         ) 
    
      }
                   
                   
                    
                    
                ],
            },
        ],
        
    )

   let liste3 = list.concat(liste).concat(list2)
   liste3.sortBy(function(o){ return o.dateMessage });

      



    

    return (
      <div>
      <Table columns={columns} data={liste3} />
      <div>{
               exampleModal?
                  <Modal
        className="modal-dialog-centered"
        isOpen={exampleModal}
        toggle={toggleModal}
      >
        <div className="modal-header">
          <h5 className="modal-title" id="exampleModalLabel">
          Sujet : {messageRecu.subjetMsg}
          </h5>
          
        </div>
        <div className="modal-body">
        
      
       <Input type="textarea"
       onChange={(e)=>setContenu(e.target.value)}></Input>
       

        </div>
        <div className="modal-footer">
          <Button
            color="secondary"
            data-dismiss="modal"
            type="button"
            onClick={toggleModal}
          >
            Fermer
          </Button>
          <Button
            color="primary"
            data-dismiss="modal"
            type="button"
            onClick={submit}
          >
            Envoyer
          </Button>
          
        </div>
      </Modal>
                 
                        :""
              }
        
      </div>
  </div>
    )
}

export default FilterTableComponent;