
import React, { Component, useState, useEffect } from 'react';
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  FormGroup,
  Form,
  Input,
  Table,
  Container,
  Row,
  Col,
} from "reactstrap";


import Header from "components/Headers/Header.js";
import { event } from 'jquery';
import Absencelist from  "./AbsencelistAdmin.js";




export default function Absence()  {

  const [datastudent, setDataStudent] = useState([]);
  const [datamodule, setDatamodule] = useState([]);
  const [dataclasse, setDataclasse] = useState([]);
  const [dataenseignant, setDataenseignant] = useState([]);
  const [markallstudentspresent, setMarkallstudentspresent]= useState(true);
  const [markallstudentsabsent, setMarkallstudentsabsent]= useState(false);
  const [classe, setClasse] = useState('4 M 2');
  const [module, setModule] = useState('FKR-ITAL');
  const [idEns, setIdEns] = useState('V-80-15');
  const [semestre, setSemestre] = useState(1);
  const [seance, setSeance] = useState(1);
  const [dataSeance, setDataSeance] = useState([]);
  const [dateSeance, setDateSeance] = useState(new Date);
 
 
  function togglemarkstudentspresent(ev){
    let value = ev.target.checked;
    setMarkallstudentspresent(value)
    setMarkallstudentsabsent(!value)
    console.log(ev.target.value)
    console.log(markallstudentspresent)
  }
  function togglemarkstudentsabsent(ev){
    let value = ev.target.checked;
    setMarkallstudentsabsent(value)
    setMarkallstudentspresent(!value)
  }

  const [decid, setDecid] = useState({});
  useEffect(() => {
    fetch(`http://localhost:8080/api/decid/${localStorage.getItem('username')}`,{
                  method:"GET",
                  headers:{"Content-Type":"application/json",
                  'Authorization': `Bearer ${localStorage.getItem('token')}`,
                }
               
              }).then(results => results.json())
              .then(decid => setDecid(decid))     
    }, [])
  localStorage.setItem('mail',decid.mailDecid)



  function submitAbsence(e){
    e.preventDefault()
    
    let absentStudents = [];
    datastudent.forEach((student) => {
      console.log(student)
      console.log(e.target[student.idEt].value)
      if(e.target[student.idEt].value == 'true'){
        console.log('HERE')
        absentStudents.push(student)
        console.log('liste' + absentStudents)
   absentStudents.forEach((absentstudent) => {
    const absences = {
      idEt: absentstudent.idEt,
      codeModule: module,
      codeCl: classe,
      anneeDeb : localStorage.getItem('saison'),
      dateSeance : new Date(dateSeance),
      numSeance : seance,
      idEns: idEns,
      semestre: semestre
    
      
    }
    fetch("http://localhost:8080/api/absences",{
      method:"POST",
      headers:{"Content-Type":"application/json",
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
    }
    ,
      body:JSON.stringify(absences)
  }).then(()=>{
    console.log("New absence added")
    console.log(absences)
  })

  const mailform = {
    from: localStorage.getItem('mail'),
    to: absentstudent.emailParent,
    subject: "Absence",
    message : "Votre enfant était absent pendant la scéance de " +module+ " le "+ new Date(dateSeance) +"\n"+
          " Cordialement."
    
    
  }
  
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
      })
   })
   
      }
    })
    window.location.reload(false);
  }

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
    
  function codeClValueChanged(ev) {
    console.log('in code cl changed')
    console.log(ev.target.value)
    setClasse(ev.target.value);
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
      /*.then(datastudent => setDataStudent(datastudent)
      .then(()=> {console.log(datastudent)})
      )*/
  }

  function RenderStudentDataTable({datastudent}){
    if(datastudent.length !== 0) 
  return <div>
    <br></br>
      <Container>
   
        <div className="center-div">
        
        
      <span> Etablir Par défault</span>

     
     <Col>
    <label><Input type="radio" defaultChecked={markallstudentspresent} onChange={togglemarkstudentspresent} ></Input> <span>Présence</span> </label>
    <label><input type="radio" defaultChecked={markallstudentsabsent} onChange={togglemarkstudentsabsent } ></input> <span>Absence</span> </label>
    </Col>
  
  </div>

<Table className="table" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nom</th>
                    
                    <th scope="col">Présence</th>
                    <th scope="col">Absence</th>
                    <th scope="col">Justification</th>


                    
                  </tr>
                </thead>
                <tbody>
                {datastudent.map(cahier=> 
                <tr key={cahier.idEt}>
                  <td>{cahier.idEt}</td>
                  <td>{cahier.nomEt}</td>
                  
                  <td><Input type={'radio'} value={false} name={cahier.idEt} defaultChecked ={markallstudentspresent}></Input></td>
                  <td><Input type={'radio'} value={true} name={cahier.idEt} defaultChecked ={markallstudentsabsent}></Input></td>
                  <td><Input type={'text'}></Input></td>
                  </tr>
               
               )}
                </tbody>
              </Table>


              </Container>
    </div>
    else return <div></div>
  }

  useEffect(()=>{
    fetch('http://localhost:8080/api/modules', {
      method: 'GET',
      headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      
    }) /*end fetch */
      .then(results => results.json())
      .then(datamodule => setDatamodule(datamodule)

      )

      fetch('http://localhost:8080/api/enseignants', {
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      /*body: JSON.stringify({
          username: '{userName}',
          password: '{password}'
      })*/
    }) /*end fetch */
      .then(results => results.json())
      .then(dataenseignant => setDataenseignant(dataenseignant)

      )

    fetch('http://localhost:8080/api/classes', {
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      /*body: JSON.stringify({
          username: '{userName}',
          password: '{password}'
      })*/
    }) /*end fetch */
      .then(results => results.json())
      .then(dataclasse => setDataclasse(dataclasse))
  },[])


 
  function Render(){
  }
    return (

      <>
        
      <br></br><br></br><br></br><br></br>
        <Container>
          <Card>
            <CardBody>
        <Form onSubmit={submitAbsence}>
          <div className="pl-lg-4">
          
            <Row>
            <Col md="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Enseignant
                  </label>

                  <Input
                    className="form-control-alternative"
                    defaultValue="lucky.jesse"
                    id="codeCl"
                    placeholder="Code de la classe"
                    type="select"
                    onChange={(e)=>setIdEns(e.target.value)}

                  >
                    {dataenseignant.map((option) => (
                      <option value={option.idEns}>{option.nomEns}</option>
                    ))}
                  </Input>
                </FormGroup>
              </Col>
              <Col md="6">
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
                    onChange={codeClValueChanged}

                  >
                    {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl}</option>
                    ))}
                  </Input>
                </FormGroup>
              </Col><Col md="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Module
                  </label>

                  <Input
                    className="form-control-alternative"
                    defaultValue="lucky.jesse"
                    id="codeModule"
                    placeholder="Username"
                    type="select"
                    onChange={(e)=>setModule(e.target.value)}

                  >
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation}</option>
                    ))}

                  </Input>
                </FormGroup>
             </Col>
                  <Col md="6">
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Date
                  </label>

                  <Input
                    id="date"
                    placeholder="date"
                    type="date"
                   onChange={(e)=>setDateSeance(e.target.value)}
                    
                  >
                  </Input>
                  </Col>
               
                  <Col md="6">
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
                  </Col>
                  <Col md="6">
              <FormGroup>
              <label className="form-control-label" for="semestre">Semestre</label>
                <Input  
                id="semestre"
                 type="select" 
                 onChange={(e)=>setSemestre(e.target.value)}>
                    <option>1</option>
                    <option>2</option>
                    </Input>
              </FormGroup>
            </Col>

                  <Col md="6">
                    <br></br>
            <Button color='success' type='submit'>Enregistrer</Button>
            </Col>
            </Row>

          </div>
          <FormGroup>
              <Col md="6">
            <Row>
        <RenderStudentDataTable datastudent={datastudent}></RenderStudentDataTable>
        </Row></Col></FormGroup>
        </Form>
        </CardBody>
        </Card>
        </Container>
          
      </>
    );
}










