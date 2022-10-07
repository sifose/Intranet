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
    
  } from "reactstrap";
import  "./popup.css"
  import useToken from "components/useToken";
import Cahierss from "./cahierEns.js";
import { isLeapYear } from "date-fns";
// Define a default UI for filtering
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
                className="inputsearch"
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
            defaultColumn,
            initialState:{hiddenColumns:["id","idEns","dateSaisie","idEns","sujet","confirm"]}
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
              <Cahierss />
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
                        accessor: 'titre'
                    },
                    {Header: 'date',
                    accessor: 'dateSaisie'
                    },
                    {
                        Header: 'sujet',
                        accessor: 'sujet'
                    },,
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

                            <span style={{cursor:'pointer',color:'orange'}} 
                            onClick={(e) => {
                                handleClickDetails(e)
                                const id1=tableProps.row.values.id
                                
                                fetchWord(id1)
                       
                        } }
                        className="ni ni-zoom-split-in" >
                          Détails
                        
                        </span>  
                         )
    
      },,
      {
            
        id: 'confirmed',
        
        Cell: (tableProps) => ( (tableProps.row.values.confirm == 0) ?
        <span style={{cursor:'pointer',color:'green'}}
        onClick={() => {
          const id1=tableProps.row.values.id
          
          fetchWord(id1)
          confirm(tableProps.row.values.id)
          fetch(`http://localhost:8080/api/etudiants/classe/${tableProps.row.values.codeCl}`, {
         method: 'GET',
         headers: {
         'Authorization': `Bearer ${localStorage.getItem('token')}`,
         'Accept': 'application/json',
         'Content-type': 'application/json',
          },
          })
        .then(async results => {
        
         let students = await results.json()
         
           let mailStudents = [];
           students.forEach((student) => {
          mailStudents.push(student.adresseMailEsp);})
          console.log('mail list'+ mailStudents[0])

          mailStudents.forEach((mailstudent) => {
          const mailform = {
            from: localStorage.getItem('mail'),
            to: mailstudent,
            subject: tableProps.row.values.titre,
            message : tableProps.row.values.sujet
            
            
          }
          console.log('mail list'+ mailStudents)
          fetch("http://localhost:8080/api/email",{
            method:"POST",
            headers:{"Content-Type":"application/json",
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
          }
          ,
            body:JSON.stringify(mailform)
        }).then(()=>{
          console.log("mail sent")
          console.log(mailform)
              })})
              window.location.reload(false)
        })
        
        }} className="ni ni-check-bold">
       
      Valider</span> : null
      ),
  },
      
      
      {
                        id: 'update',
                            
                            Cell: (tableProps) => ((tableProps.row.values.confirm == 0) ?
                            <span style={{cursor:'pointer',color:'blue'}} 
                            onClick={(e) => {handleClickEdit(e)
                                const id1=tableProps.row.values.id
                                fetchWord(id1)
                                
                        } }
                        className="ni ni-ruler-pencil" >Modifier</span>   :null 
                      ) 
    
                      },
                    {
                        
                        id: 'delete',
                        
                        Cell: (tableProps) => ((tableProps.row.values.confirm == 0) ?
                        <span style={{cursor:'pointer',color:'red'}}
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
                        }} className="ni ni-fat-remove">
                       
                      Supprimer</span> : null
                    ),
                  }
                    
                    
                    
                ],
            },
        ],
        []
    )
   
    const[data,setData]=useState([])
    
    const [dataenseigant, setDataenseignant] = useState([])
    const [dataclasse, setDataclasse] = useState([])
    const [datamodule, setDatamodule] = useState([])
    const [dataSeance, setDataSeance] = useState([])
    const[popup,setPopup]=useState(false)
    const[popup2,setPopup2]=useState(false)
    
    
  const [enseignant, setEnseignant] = useState({});
    useEffect(() => {
      fetch(`http://localhost:8080/api/enseignant/${localStorage.getItem('username')}`,{
                    method:"GET",
                    headers:{"Content-Type":"application/json",
                    'Authorization': `Bearer ${localStorage.getItem('token')}`,
                  }
                 
                }).then(results => results.json())
                .then(enseignant => setEnseignant(enseignant))     
      }, [])
    localStorage.setItem('mail',enseignant.mailEns)

    const handleClickEdit=()=>{
        console.log('hello')
        setPopup(!popup)

    }
    const closePopup=()=>{
        setPopup(false)
    }
    const handleClickDetails=()=>{
        console.log('hello')
        setPopup2(!popup2)

    }
    const closePopup2=()=>{
        setPopup2(false)
    }
    
   

    useEffect(()=>{fetch(`http://localhost:8080/api/cahierEnseignant/${localStorage.getItem('username')}`,{  
        method: 'GET',
        headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
          'Content-Type': 'application/json',}}
      ) 
    
        .then(res=>res.json())
        .then((result)=>{
         setData(result);
         
          console.log(result)
        }
      )
      },[])





      let list = []
  data.forEach((cahier) => {

  if(cahier.anneeDeb == localStorage.getItem('saison')){
  
  list.push(cahier)
 }})

 const[updatedcahier0,setUpdatedcahier0]=useState({})
 async function fetchWord(id) {
    
  const res = await fetch(`http://localhost:8080/api/cahier/${id}`, 
  { method: 'GET' ,
    headers: {
    'Authorization': `Bearer ${localStorage.getItem('token')}`,
    'Content-Type': 'application/json'}
    });
  let data1 = await res.json();
  setUpdatedcahier0(data1)
}  
useEffect(() => {
  
  console.log(updatedcahier0)

}, [updatedcahier0])






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

            const [classe, setClasse] = useState('');
            const [ens, setEns] = useState('');
            const [module, setModule] = useState('');
            const [titre, setTitre] = useState('');
            const [sujet, setSujet] = useState('');
            const [seance, setSeance] = useState('');

        const update=(e)=>{
            e.preventDefault()
            
            const updatedcahier1 = {
            idEns: ens,
            codeCl: classe,
            codeModule: module,
            titre:titre,
            sujet:sujet,
            dateSaisie: new Date(),
            anneeDeb: updatedcahier0.anneeDeb,
            numSeance: seance ,
            trace: 'modifié le '+ new Date()+ ' par ' +localStorage.getItem('username'),
            confirm: false
            } 
            {if(classe==''){setClasse(updatedcahier0.codeCl);}
            if(ens==''){setEns(updatedcahier0.idEns);}
            if(module==''){setModule(updatedcahier0.codeModule);}
            if(seance==''){setSeance(updatedcahier0.numSeance);}
            if(titre==''){setTitre(updatedcahier0.titre);}
            if(sujet==''){setSeance(updatedcahier0.sujet);}}
            fetch(`http://localhost:8080/api/cahier/${updatedcahier0.id}`,{
                method:"PUT",
                headers:{"Content-Type":"application/json",
                'Authorization': `Bearer ${localStorage.getItem('token')}`,
              }
              ,
                body:JSON.stringify(updatedcahier1)
            }).then(()=>{
              console.log("cahier updated")
              console.log(updatedcahier1)
             
              
            })
            
           
          }
          function confirm(id1){

            
            
            fetch(`http://localhost:8080/api/cahierconfirm/${id1}`,{
                method:"PUT",
                headers:{"Content-Type":"application/json",
                'Authorization': `Bearer ${localStorage.getItem('token')}`,
              }
              
                
            })
              
            
           
          }
         
  useEffect(() => {
    

  }, [confirm])
          
  

    return (
        <div>
        <Table columns={columns} data={list} />
        <div>
                {
                    popup?
                    <div className="main">
                        <div className="popup">
                            <div className="popup-header">
                                <h3>Modifier cahier</h3>
                                <h6 onClick={closePopup}>X</h6>    
                            </div>
                            <div>
                            
                            <Form >
              <Row>
              <Col lg="6">
                <FormGroup>
                            <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Enseignant
                  </label>

                  <Input
                    className="input"
                    defaultValue={updatedcahier0.idEns}
                    id="idEns"
                    placeholder="Choisir enseignant"
                    type="select"
                   onChange={(e)=>setEns(e.target.value)}
                    

                  >
                    {dataenseigant.map((option) => (
                      <option value={option.idEns}>{option.nomEns} </option>
                    ))}
                  </Input>
                  </FormGroup></Col></Row>
                  <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Classe
                  </label>

                  <Input
                    className="input"
                    defaultValue={updatedcahier0.codeCl}
                    id="codeCl"
                    placeholder="Code de la classe"
                    type="select"
                   onChange={(e)=>setClasse(e.target.value)}
                    
                  >
                       {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl} </option>
                    ))}
                  </Input>
                  </FormGroup></Col></Row>
                 
                  <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Séance
                  </label>

                  <Input
                    className="input"
                    defaultValue={updatedcahier0.numSeance}
                    id="numSeance"
                    placeholder="numSeance"
                    type="select"
                   onChange={(e)=>setSeance(e.target.value)}
                    
                  >
                       {dataSeance.map((option) => (
                      <option value={option.id}>{option.libelle} </option>
                    ))}
                  </Input>
                  </FormGroup></Col></Row>
                 
                 
                  <Row>
              <Col lg="6">
                <FormGroup>

                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Module
                  </label>

                  <Input
                    className="input"
                    defaultValue={updatedcahier0.codeModule}
                    id="codeModule"
                    placeholder="Choisir module"
                    type="select"
                   onChange={(e)=>setModule(e.target.value)}
                    

                  >
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation} </option>
                    ))}
                  </Input></FormGroup></Col></Row>
                  
                  <Row>
              <Col lg="6">
                <FormGroup>
                  <label className="form-control-label"
                    htmlFor="input-username">
                    Titre
                  </label>
                  <Input className="input"
                    defaultValue={updatedcahier0.titre}
                    id="titre"
                    placeholder=""
                    type="text" 
                    onChange={(e)=>setTitre(e.target.value)}
                    >
                  </Input>
                  </FormGroup></Col></Row>

                  <Row>
              <Col lg="6">
                <FormGroup>
                  <label className="form-control-label"
                    htmlFor="input-username">
                    Sujet
                  </label>
                  <Input className="input"
                   
                
                    id="sujet"
                    defaultValue={updatedcahier0.sujet}
                    type="textarea" 
                    onChange={(e)=>setSujet(e.target.value)}
                    >
                      
                  </Input>
                  </FormGroup></Col></Row>
              <button className="button" 
              onClick={(event) => { update(event); 
            }}>Enregistrer</button>
         
         </Form>
                            </div>
                        </div>
                    </div>:""
                }
            </div>
            <div>
                {
                    popup2?
                    <div className="main">
                        <div className="popup2">
                            <div className="popup-header" style={{backgroundColor:'#C0C0C0'}}>
                                <h5>Détails</h5>
                                <h3 onClick={closePopup2}>x</h3>
                            </div>
                            <div>
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
                    </div>
                  </div>
                </Row>
                <div className="text-center">
                  <h5>
                    Date:   
                    <span className="font-weight-light">   Séance {updatedcahier0.numSeance}</span>
                  </h5>
                  <div className="h5 font-weight-300">
                    <i className="ni location_pin mr-2" />
                    {updatedcahier0.trace}
                  </div>
                  <div className="h5 mt-4">
                    <i className="ni business_briefcase-24 mr-2" />
                    Titre:
                  </div>
                  <div>
                    <i className="ni education_hat mr-2" />
                    {updatedcahier0.titre}
                  </div>
                  <hr className="my-4" />
                  <p>
                    {updatedcahier0.sujet}
                  </p>
                  
                </div>
              </CardBody>
           </Container>
                            </div>
                        </div>
                    </div>:""
                }
            </div>
            </div>

    )
}

export default FilterTableComponent;