
import Header from 'components/Headers/Header';
import React, { Component, useState, useEffect } from 'react';
import { useHistory } from 'react-router-dom';
// reactstrap components
import {
  Container,
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
  Col
} from "reactstrap";

function Modals() {
 
    const [exampleModal,setExampleModal]= useState(false);
    const [dataenseigant, setDataenseignant] = useState([]);
    const [dataclasse, setDataclasse] = useState([]);
    const [datamodule, setDatamodule] = useState([]);
    const [classe, setClasse] = useState('');
    const [ens, setEns] = useState('');
    const [module, setModule] = useState('');
    const [titre, setTitre] = useState('');
    const [sujet, setSujet] = useState('');
    const [anneedeb, setAnneeDab] = useState(localStorage.getItem('saison'));
    const [datesaisie, setDatesaisie] = useState(new Date());
    const [dataSeance, setDataSeance] = useState([]);
    const [seance, setSeance] = useState('');
    const history = useHistory();

  
  const toggleModal = () => {
   setExampleModal(!exampleModal);
  };

  const handleClick=(e)=>{
    e.preventDefault()
    const cahier = {
    idEns: ens,
    codeCl: classe,
    codeModule: module,
    titre:titre,
    sujet:sujet,
    dateSaisie: datesaisie,
    anneeDeb: anneedeb,
    numSeance: seance,
    trace: 'modifié le '+ new Date()+ ' par ' +localStorage.getItem('username'),
    confirm: false

    }

    fetch("http://localhost:8080/api/cahiers",{
        method:"POST",
        headers:{"Content-Type":"application/json",
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
      }
      ,
        body:JSON.stringify(cahier)
    }).then(()=>{
      console.log("New cahier added")
      console.log(cahier)
      
    })
    alert('Cahier rempli')
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
    useEffect(()=>{
      fetch('http://localhost:8080/api/classes', {
          method: 'GET',
          headers: {
            'Accept': 'application/json',
            'Content-type': 'application/json',
            "Authorization": `Bearer ${localStorage.getItem('token')}`
          },
          /*body: JSON.stringify({
              username: '{userName}',
              password: '{password}'
          })*/
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
            /*body: JSON.stringify({
                username: '{userName}',
                password: '{password}'
            })*/
          }) /*end fetch */
            .then(results => results.json())
            .then(datamodule => setDatamodule(datamodule))
            
        },[])

  
    return (
      <>
        {/* Button trigger modal */}
        <Button
          color="primary"
          outline
          type="button"
          onClick={toggleModal}
        >
          Ajouter un texte
        </Button>
        {/* Modal */}
        <Modal
          className="modal-dialog-centered"
          isOpen={exampleModal}
          toggle={toggleModal}
        >
          <div className="modal-header">
            <h5 className="modal-title" id="exampleModalLabel">
              Veuillez remplir le formulaire
            </h5>
            <button
              aria-label="Close"
              className="close"
              data-dismiss="modal"
              type="button"
              onClick={toggleModal}
            >
              <span aria-hidden={true}>×</span>
            </button>
          </div>
          <div className="modal-body">

          <Container><Col><Row>
                    <label
                    className="form-control-label"
                    for="idEns"
                  >
                    Enseignant
                  </label>

                  <Input
                    
                    defaultValue=""
                    id="idEns"
                    placeholder="Choisir enseignant"
                    type="select"
                    onChange={(e)=>setEns(e.target.value)}
                    

                  >
                    {dataenseigant.map((option) => (
                      <option value={option.idEns}>{option.nomEns} </option>
                    ))}
                  </Input>
                  </Row></Col>
                  <Col><Row>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Classe
                  </label>

                  <Input
                    defaultValue="lucky.jesse"
                    id="codeCl"
                    placeholder="Code de la classe"
                    type="select"
                    value={classe}
                    onChange={(e)=>setClasse(e.target.value)}
                    
                  >
                       {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl} </option>
                    ))}
                  </Input>
                  </Row></Col>
                  <Col><Row>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Séance
                  </label>

                  <Input
                    id="numSeance"
                    placeholder="numSeance"
                    type="select"
                   onChange={(e)=>setSeance(e.target.value)}
                    
                  >
                       {dataSeance.map((option) => (
                      <option value={option.id}>{option.libelle} </option>
                    ))}
                  </Input>
                  </Row></Col>
                  <Col><Row>
                  
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Module
                  </label>

                  <Input
                    
                    defaultValue=""
                    id="codeModule"
                    placeholder="Choisir module"
                    type="select"
                    onChange={(e)=>setModule(e.target.value)}
                    

                  >
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation} </option>
                    ))}
                  </Input>
                  </Row></Col>
                  <Col><Row>
                  <label className="form-control-label"
                    htmlFor="input-username">
                    Titre
                  </label>
                  <Input 
                    defaultValue=""
                    id="titre"
                    placeholder=""
                    type="text" 
                    onChange={(e)=>setTitre(e.target.value)}
                    >
                  </Input>
                  </Row></Col>
                  <Col><Row>
                  <label className="form-control-label"
                    htmlFor="input-username">
                    Sujet
                  </label>
                  <Input 
                    defaultValue=""
                    id="sujet"
                    placeholder=""
                    type="textarea" 
                    onChange={(e)=>setSujet(e.target.value)}
                    >
                      
                  </Input>
                  
</Row></Col></Container>

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
            <Button color="primary" type="button" onClick={(event) => { handleClick(event);  window.location.reload(false);}}>
              Enregistrer
            </Button>
          </div>
        </Modal>
      </>
    );
  }


export default Modals;