import React from "react";
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
    
  } from "reactstrap";
  import  {  useState, useEffect } from 'react';
  
  // core components
  import Header from "components/Headers/Header.js";



  
  
  
  export default function Message()  {

    const [dataclasse, setDataclasse] = useState([]);
    const [datastudent, setDataStudent] = useState([]);
    const [etudiant, setEtudiant] = useState('');
    const [classe, setClasse] = useState('');
    const [objet, setObjet] = useState(''); 
    const [contenu, setContenu] = useState(''); 
    const [annee, setAnnee] = useState(new Date().getFullYear());  
    const [dateenvoie, setDateenvoie] = useState(new Date()); 
    const [sender, setSender] = useState('A'); 
    const [destination, setDestination] = useState(''); //idet ou classe
    const [type, setType] = useState(''); //vers parents / vers etudiants
    const [etat, setEtat] = useState('N');  

    const handleClick=(e)=>{
      e.preventDefault()
      const message = {
        anneeDeb: annee,
        dateMessage: dateenvoie,
        senderMsg: sender,
        destMsg: destination,
  
    contenuMsg: contenu,
    subjetMsg: objet,
    typeMsg: type,
    etat: etat
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
    })
  }







    function RenderStudentDataTable({datastudent}){
      if(datastudent.length !== 0) return <div>
        
        <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Choisir élève
                  </label>

                  <Input
                    className="form-control-alternative"
                    defaultValue="lucky.jesse"
                    id=""
                    placeholder="Choisir élève"
                    type="select"
                    value={etudiant}
                    onChange={codeClValueChanged2}

                  >
                    {datastudent.map((option) => (
                      <option value={option.idEt}>{option.nomEt} {option.pnomEt}</option>
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


          <Header />
          {/* Page content */}
          <Container className="mt--7" fluid>
          

          
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
                    className="form-control-alternative"
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
<Form >
          <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    L'objet du mail
                  </label>

                  
                  <Input
                    className="form-control-alternative"
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
            <div className="pl-lg-4">
          <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Type de destinataires
                  </label>

                  
                  <div class="radiobuttons">
    <label><Input type="checkbox" value={destination} onChange={((e) => setDestination(etudiant))} ></Input> <span>Un élève</span> </label>
    <label><Input type="checkbox" value={destination} onChange={((e) => setDestination(classe))} ></Input> <span>Une classe</span> </label>
  </div>
                  
                </FormGroup>
              </Col>
            </Row>
            
            
            
            
            <RenderStudentDataTable datastudent={datastudent}></RenderStudentDataTable>

            <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                   Envoyer le message à
                  </label>

                  
                  <div class="checkboxes">
    <label><Input type="checkbox" value={type} onChange={((e) => setType("vers Etudiant"))} ></Input> <span>Elève(s)</span> </label>
    <label><Input type="checkbox" value={type} onChange={((e) => setType("Vers parents"))}  ></Input> <span>Parent(s)</span> </label>
  </div>
                  
                </FormGroup>
              </Col>
            </Row>
            <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Contenu du message
                  </label>

                  
                  <Input
                    className="form-control-alternative"
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
            
                  

            <Button  onClick={handleClick}>Envoyer</Button>
            

            </div>
            </Form>
          


          </Container>
    </>
    
  );
    
  };  

    