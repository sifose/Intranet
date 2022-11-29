import React from 'react';
// reactstrap components

import useToken from "components/useToken";
import Header from "components/Headers/Header.js";
import { useHistory } from 'react-router-dom';
import Popup from "reactjs-popup";
import {

  Card,
  CardHeader,  
  Table,
  Col,
  FormGroup,
  Container,
  Row,
  Input,
  Button,
  Form,
  Modal,
  
} from "reactstrap";
import  {  useState, useEffect } from 'react';


export default function Messagerie() {
   
  
const contentStyle = {
  maxWidth: "600px",
  width: "90%",
  backgroundColor: "gray"
   
};

const [dataclasse, setDataclasse] = useState([]);
    const [datastudent, setDataStudent] = useState([]);
    const [etudiant, setEtudiant] = useState('');
    const [classe, setClasse] = useState('');
    const [objet, setObjet] = useState(''); 
    const [contenu, setContenu] = useState(''); 
    const [annee, setAnnee] = useState(localStorage.getItem('saison'));  
    const [sender, setSender] = useState(localStorage.getItem('username')); 
    const [destination, setDestination] = useState(''); //idet ou classe
    const [type, setType] = useState(''); //vers parents / vers etudiants
    const [etat, setEtat] = useState('N');
    const [exampleModal,setExampleModal]= useState(false);
    const [datesaisie, setDatesaisie] = useState(new Date());
    
   
    const handleClick=(e)=>{
      e.preventDefault()
      const message = {
        anneeDeb: annee,
        dateMessage: datesaisie,
        senderMsg: sender,
        destMsg: destination,
    contenuMsg: contenu,
    subjetMsg: objet,
    typeMsg: type,
    etat: etat,
    reponse : false
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
      window.location.reload(false)
      
      
    })
  }
  const toggleModal = () => {
    setExampleModal(!exampleModal);
   };


    function RenderStudentDataTable({datastudent}){
      
      if(datastudent.length !== 0) return <div>
        
        <Row>
              <Col>
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Choisir élève
                  </label>

                  <Input
                    id=""
                    placeholder="Choisir élève"
                    type="select"
                    value={etudiant}
                    onChange={codeClValueChanged2}

                  >
                    {datastudent.map((option) => (
                      <option value={option.idEt}>{option.nomEt}</option>
                    ))}
                  </Input>
                </FormGroup>
              </Col>
            </Row>
  
      </div>
      else return <div></div>
    }
  

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

      function codeClValueChanged(ev) {
        setClasse(ev.target.value);
        console.log('in code cl changed')
        console.log(ev.target.value)
        fetch(`http://localhost:8080/api/etudiants/classe/${ev.target.value}`, {
          method: 'GET',
          headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
        })
          .then(async results => {
            let jsonResults = await results.json()
            setDataStudent(jsonResults)
          })
         
      }
      function codeClValueChanged2(ev) {
        setEtudiant(ev.target.value);
      }

    

    
    return (
      
      <>
      
      <Button
          color="primary"
          outline
          type="button"
          onClick={toggleModal}
        >
          Envoyer
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
          <Form>
          <Row>
              <Col>
                <FormGroup>
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
                    onChange={codeClValueChanged}
                    
                    
                  >
                    {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl}</option>
                    ))}
                  </Input>
                </FormGroup>
              </Col>
            </Row>

          <Row>
              <Col >
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    L'objet du mail
                  </label>

                  
                  <Input
                   
                    defaultValue=""
                    id=""
                    placeholder=""
                    type="text"
                    value={objet}
                    onChange={(e)=>setObjet(e.target.value)}
                  >
                   
                  </Input>
                </FormGroup>
              </Col>
            </Row>
            <RenderStudentDataTable datastudent={datastudent}></RenderStudentDataTable>
            <div className="pl-lg-4">
          <Row>
              <Col>
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Type de destinataires
                  </label>

                  
                  <div class="radiobuttons">
    <label><input type="radio" id="customRadio5"   name="custom-radio-2" value={destination} onChange={((e) => setDestination(etudiant))} ></input> <span>Un élève</span> </label>
    <label><input  type="radio" id="customRadio6"   name="custom-radio-2" value={destination} onChange={((e) => setDestination(classe))} ></input> <span>Une classe</span> </label>
  </div>
                  
                </FormGroup>
              </Col>
            </Row>
            
            
            
            
            

            <Row>
              <Col >
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                   Envoyer le message à
                  </label>

                  
                  <div class="checkboxes">
    <label><input type="radio" id="customRadio7"   name="custom-radio-3"  value={type} onChange={((e) => setType("Vers élèves"))} ></input> <span>Elève(s)</span> </label>
    <label><input  type="radio" id="customRadio8"   name="custom-radio-3" value={type} onChange={((e) => setType("Vers parents"))}  ></input> <span>Parent(s)</span> </label>
  </div>
                  
  
                </FormGroup>
              </Col>
            </Row>
            

            <Row>
              <Col >
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Contenu du message
                  </label>

                  
                  <Input
                   
                    defaultValue=""
                    id=""
                    placeholder=""
                    type="textarea"
                    value={contenu}
                    onChange={(e)=>setContenu(e.target.value)}
                  >
                   
                  </Input>
                </FormGroup>
              </Col>
            </Row>
            
          
            

            </div>
</Form>
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
            <Button color="primary" type="submit" onClick={(event) => { handleClick(event);}}>
              Envoyer
            </Button>
            
          </div>
          
        </Modal>
     
      
  


  
      
    </>
    )}