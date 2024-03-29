import React from "react";
import  {useEffect, useState } from 'react';
import { useTable, useFilters, useGlobalFilter, useAsyncDebounce , usePagination, useSortBy} from 'react-table'
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from "components/Headers/Header.js";
import moment from 'moment';

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
import Cahier from "./CahierAdmin";
import Popup from "reactjs-popup";
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
          
      <div class="p-4" style={{backgroundColor:'white', width:"30%"}} >
        <FormGroup>
                <InputGroup className="mb-4">
        <InputGroupAddon addonType="prepend">
                    <InputGroupText>
                      <i className="ni ni-zoom-split-in" />
                    </InputGroupText>
                  </InputGroupAddon>
    <Input type="search" class="form-control form-control-alternative" 
     onChange={e => {
      setValue(e.target.value);
      onChange(e.target.value);
      
  }}
  placeholder={`  Search`}
  ></Input></InputGroup></FormGroup>
</div>
           
        
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
            initialState:{hiddenColumns:["id","dateSaisie","idEns","sujet","confirm"]}
            
            
            
        },
        useFilters,
        useGlobalFilter,
        useSortBy,
        usePagination,
        
    )

    return (
         <>
      <Header />


      
      <Container className="mt--7" fluid >
        {/* Table */}
        
        <br></br>
        <Row>
       
          <div className="col">
            <Card className="shadow">
            
              <CardHeader className="border-0">
              <Cahier />
              </CardHeader>
        <div>
            <GlobalFilter
                preGlobalFilteredRows={preGlobalFilteredRows}
                globalFilter={state.globalFilter}
                setGlobalFilter={setGlobalFilter}
            />
            <table className="table" responsive {...getTableProps()} >
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
                        Header: 'ID',
                        accessor: 'id',
                        
                        
                    },
                    {
                        Header: 'Enseignant',
                        accessor: 'idEns'
                    },
                    {
                        Header: 'Classe',
                        accessor: 'codeCl'
                    },
                
                
                    {
                        Header: 'Module',
                        accessor: 'codeModule'
                    },
                    {
                        Header: 'Titre',
                        accessor: 'titre',
                    },
                    {Header: 'date',
                    accessor: 'dateSaisie'
                    },
                    {
                        Header: 'sujet',
                        accessor: 'sujet'
                    },
                    {
                        Header: 'Trace',
                        accessor: 'trace'
                    },
                    {
                      Header: 'Confirm',
                      accessor: 'confirm'
                  },
                  
                    {

                        id: 'details',
                            
                            Cell: (tableProps) => (

                            <Button style={{cursor:'pointer'}} 
                            onClick={(e) => {
                                handleClickDetails(e)
                                const id1=tableProps.row.values.id
                                
                                fetchWord(id1)
                       
                        } }
                        color="info" outline >
                          Voir
                        
                        </Button>  
                         )
    
      },{
                        id: 'update',
                            
                            Cell: (tableProps) => ((tableProps.row.values.confirm == 0) ?
                            <Button style={{cursor:'pointer'}} 
                            onClick={(e) => {handleClickEdit(e)
                            
                                const id1=tableProps.row.values.id
                                console.log(id1)
                                fetchWord2(id1)
                                
                        } }
                        color="success" outline>Modifier</Button>   :null 
                      ) 
    
                      },
                    {
                        
                        id: 'delete',
                        
                        Cell: (tableProps) => ((tableProps.row.values.confirm == 0) ?
                        <Button style={{cursor:'pointer'}}
                        onClick={() => {

                        // ES6 Syntax use the rvalue if your data is an array.
                        const dataCopy = [...data];
                        // It should not matter what you name tableProps. It made the most sense to me.
                        dataCopy.splice(tableProps.row.index, 1)
                        
                        setData(dataCopy)
                        console.log(tableProps.row.values.id)
                        fetch(`http://localhost:8080/api/cahier/${tableProps.row.values.id}`, 
                        { method: 'DELETE' ,
                          headers: {
                          'Authorization': `Bearer ${localStorage.getItem('token')}`,
                          'Content-Type': 'application/json'}
                        })
                        window.location.reload(false);
                        }} color="danger" outline>
                       
                      Supprimer</Button> : null
                    ),
                  }
                    
                    
                ],
            },
        ],
        
    )

    const[updatedcahier2,setUpdatedcahier2]=useState({})
    const[updatedcahier0,setUpdatedcahier0]=useState({})
    const [dataenseigant, setDataenseignant] = useState([]);
    const [dataclasse, setDataclasse] = useState([]);
    const [datamodule, setDatamodule] = useState([]);
    const [dataSeance, setDataSeance] = useState([]);
    const[data,setData]=useState([])
    const[popup,setPopup]=useState(false)
    const[popup2,setPopup2]=useState(false)

    const [exampleModal,setExampleModal]= useState(false);
    const [exampleModal2,setExampleModal2]= useState(false);
   
    const handleClickEdit=()=>{
        console.log('hello')
        setPopup(!popup);
        setExampleModal2(!exampleModal2);
      

    }

    
    const download=()=>{
      fetch(`${updatedcahier0.fileDownloadUri}`,{  
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
      link.download = `${updatedcahier0.titre}.pdf`;
      link.click();
    });
  })
  .catch((err) => {
    console.log(err);
  });
   
  
  }

     
  const toggleModal = () => {
    setExampleModal(!exampleModal);
   };
   const toggleModal2 = () => {
    setExampleModal2(!exampleModal2);
   
   };

  
    const closePopup=()=>{
        setPopup(false)
    }
    const handleClickDetails=()=>{
        setExampleModal(!exampleModal);
    }

    
     
  useEffect(()=>{fetch("http://localhost:8080/api/cahiers",{  
    method: 'GET',
    headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Content-Type': 'application/json',}}
  ) 

    .then(res=>res.json())
    .then((result)=>{
     setData(result);
      console.log(data);
    }
  )
  },[])


  let list = []
  data.forEach((cahier) => {

  if(cahier.anneeDeb == localStorage.getItem('saison')){
  
  list.push(cahier)
 }})


 async function fetchWord(id1) {
    
    const res = await fetch(`http://localhost:8080/api/cahier/${id1}`, 
    { method: 'GET' ,
      headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Content-Type': 'application/json'}
      });
    let data1 = await res.json();
    setUpdatedcahier0(data1)
  }  

  async function fetchWord2(id1) {
    
    const res = await fetch(`http://localhost:8080/api/cahier/${id1}`, 
    { method: 'GET' ,
      headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Content-Type': 'application/json'}
      });
    let data1 = await res.json();
    setUpdatedcahier2(data1)
    setClasse(data1.codeCl)
      setEns(data1.idEns)
      setModule(data1.codeModule)
        setSeance(data1.numSeance)
      setTitre(data1.titre)
        setSujet(data1.sujet)
  }  
 
  
  


  useEffect(()=>{
    fetch('http://localhost:8080/api/enseignants', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-type': 'application/json',
          "Authorization": `Bearer ${localStorage.getItem('token')}`
        },
        
      }) 
        .then(results => results.json())
        .then(dataenseignants => setDataenseignant(dataenseignants))
        
    },[])
    useEffect(()=>{
      fetch('http://localhost:8080/api/classes', {
          method: 'GET',
          headers: {
            'Accept': 'application/json',
            'Content-type': 'application/json',
            "Authorization": `Bearer ${localStorage.getItem('token')}`
          },
          
        }) /*end fetch */
          .then(results => results.json())
          .then(dataclasse => setDataclasse(dataclasse))
      },[])
      useEffect(()=>{
        fetch('http://localhost:8080/api/modules', {
            method: 'GET',
            headers: {
              'Accept': 'application/json',
              'Content-type': 'application/json',
              "Authorization": `Bearer ${localStorage.getItem('token')}`
            },
          }) /*end fetch */
            .then(results => results.json())
            .then(datamodule => setDatamodule(datamodule))
            
        },[])

        useEffect(()=>{
            fetch('http://localhost:8080/api/seance', {
                method: 'GET',
                headers: {
                  'Accept': 'application/json',
                  'Content-type': 'application/json',
                  "Authorization": `Bearer ${localStorage.getItem('token')}`
                },
              }) /*end fetch */
                .then(results => results.json())
                .then(dataSeance => setDataSeance(dataSeance))
                
            },[])

            
            const [classe, setClasse] = useState('')
            const [ens, setEns] = useState('')
            const [module, setModule] = useState('')
            const [titre, setTitre] = useState('')
            const [sujet, setSujet] = useState('')
            const [seance, setSeance] = useState('')
           
      
             
            
           function update(id){
           
            let updatedcahier1 = {
            idEns: ens,
            codeCl: classe,
            codeModule: module,
            titre:titre,
            sujet:sujet,
            dateSaisie: new Date(),
            anneeDeb: localStorage.getItem('saison'),
            numSeance: seance ,
            trace: 'modifié le '+ new Date()+ ' par ' +localStorage.getItem('username'),
            confirm: false,
            dateCt: new Date()
            } 
            
            
            fetch(`http://localhost:8080/api/cahier/${id}`,{
                method:"PUT",
                headers:{"Content-Type":"application/json",
                'Authorization': `Bearer ${localStorage.getItem('token')}`,
              }
              ,
                body:JSON.stringify(updatedcahier1)
            })
              alert("votre texte est modifié")
              console.log(updatedcahier1)
              window.location.reload(false)
              
        }
        
      
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
        
        list.sortBy(function(o){ return ( o.dateSaisie ) });


  
    return (
      
        <div>

        <Table columns={columns} data={list} />
        
        <div>
                {
                    exampleModal2?

                    <Modal
                    className="modal-dialog-centered"
                    isOpen={exampleModal2}
                    toggle={toggleModal2}
                  >
                    <div className="modal-header">
                      <h5 className="modal-title" id="exampleModalLabel">
                        Veuillez modifier les informations
                      </h5>
                      <button
                        aria-label="Close"
                        className="close"
                        data-dismiss="modal"
                        type="button"
                        onClick={toggleModal2}
                      >
                        <span aria-hidden={true}>×</span>
                      </button>
                    </div>
                    <div className="modal-body"><label
                            for="exampleFormControlInput1"
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Enseignant
                  </label>

                  <Input
                    class="form-control"
                    defaultValue={updatedcahier2.idEns}
                    key={updatedcahier2.idEns}
                    id="exampleFormControlInput1"
                    placeholder="Choisir enseignant"
                    type="select"
                   onChange={(e)=>setEns(e.target.value)}
                    

                  >
                    {dataenseigant.map((option) => (
                      <option value={option.idEns}>{option.nomEns} </option>
                    ))}
                  </Input>
                  </div>
                 
                  <div class="p-4" style={{backgroundColor:'white'}} >
                  <label
                  for="codeCl"
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Classe
                  </label>

                  <Input
                    class="form-control"
                    defaultValue={updatedcahier2.codeCl}
                    key={updatedcahier2.codeCl}
                    id="codeCl"
                    placeholder="Code de la classe"
                    type="select"
                   onChange={(e)=>setClasse(e.target.value)}
                    
                  >
                       {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl} </option>
                    ))}
                  </Input></div>
                
                
                <div class="p-4" style={{backgroundColor:'white'}} >
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                    for="numSeance"
                  >
                    Séance
                  </label>

                  <Input
                    class="form-control"
                    defaultValue={updatedcahier2.numSeance}
                    key={updatedcahier2.numSeance}
                    id="numSeance"
                    placeholder="numSeance"
                    type="select"
                   onChange={(e)=>setSeance(e.target.value)}
                    
                  >
                       {dataSeance.map((option) => (
                      <option value={option.id}>{option.libelle} </option>
                    ))}
                  </Input></div>
                 
                 
                <div class="p-4" style={{backgroundColor:'white'}} >

                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                    for="codeModule"
                  >
                    Module
                  </label>

                  <Input
                    class="form-control"
                    defaultValue={updatedcahier2.codeModule}
                    key={updatedcahier2.codeModule}
                    id="codeModule"
                    placeholder="Choisir module"
                    type="select"
                   onChange={(e)=>setModule(e.target.value)}
                    

                  >
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation} </option>
                    ))}
                  </Input>
                  </div>
                 
                <div class="p-4" style={{backgroundColor:'white'}} >
                  <label className="form-control-label"
                    htmlFor="input-username"
                    for="titre">
                    Titre
                  </label>
                  <Input class="form-control"
                    defaultValue={updatedcahier2.titre}
                    key={updatedcahier2.titre}
                    id="titre"
                    placeholder=""
                    type="text" 
                    onChange={(e)=>setTitre(e.target.value)}
                    >
                  </Input> </div>
                  
                <div class="p-4" style={{backgroundColor:'white'}} >
                  <label className="form-control-label"
                    for="sujet">
                    Sujet
                  </label>
                  <Input 
                  class="form-control"
                    id="sujet"
                    defaultValue={updatedcahier2.sujet}
                    key={updatedcahier2.sujet}
                    type="textarea" 
                    onChange={(e)=>setSujet(e.target.value)}
                    >
                      
                  </Input></div>
                    <div className="modal-footer">
                      <Button
                        color="secondary"
                        data-dismiss="modal"
                        type="button"
                        onClick={toggleModal2}
                      >
                        Fermer
                      </Button>
                      <Button color="primary" type="button" onClick={() => { update(updatedcahier2.id)}}>
                        Enregistrer
                      </Button>
                    </div>
                  </Modal>:""
                }
            </div>
            <div>
                { exampleModal?
                    <Modal
          className="modal-dialog-centered"
          isOpen={exampleModal}
          toggle={toggleModal}
        >
          <div className="modal-header">
            <h5 className="modal-title" id="exampleModalLabel">
            Détails du texte
            </h5>
            
          </div>
          <div className="modal-body">
          <Container className="mt--7" fluid>
        
              
        <CardBody className="pt-0 pt-md-4">
          <Row>
            <div className="col">
              <div className="card-profile-stats d-flex justify-content-center mt-md-5">
                <div>
                  <span className="heading">{updatedcahier0.codeCl}</span>
                  <span className="description">Classe</span>
                </div>
                <div>
                  <span className="heading">{updatedcahier0.codeModule}</span>
                  <span className="description">Module</span>
                </div>
                <div>
                  <span className="heading">{moment(updatedcahier0.dataSeance)
                            .format("YYYY-MM-DD")}</span>
                  <span className="description">Date</span>
                </div>
              </div>
            </div>
          </Row>
          <div className="text-center">
            <h5>
              Titre:   
              <span className="font-weight-light"> {updatedcahier0.titre} </span>
            </h5>
            <div className="h5 font-weight-300">
              <i className="ni location_pin mr-2" />
              
            </div>
            
            
            <p>
              {updatedcahier0.sujet}
            </p>
            
          </div>
        </CardBody>
     </Container>
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
            {updatedcahier0.fileDownloadUri ?
            <Button color="primary" type="button"
            onClick={download}>
              Télécharger
            </Button> :null}
            
          </div>
        </Modal>
                   
                          :""
                }
            </div>

            </div>




    )
}

export default FilterTableComponent;

