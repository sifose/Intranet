
import PropTypes from 'prop-types';
import React, { useState } from 'react';
import Tables from 'views/examples/Tables';
import { useHistory } from 'react-router-dom';
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



async function loginUser(credentials) {
  return fetch('http://localhost:8080/login', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(credentials)
  })
    .then(data => data.json())
 }
 
 export default function Login() {
  const history = useHistory();

   const [username, setUserName] = useState();
   const [password, setPassword] = useState();
   
   const handleSubmit = async e => {
     e.preventDefault();

     const token = await loginUser({
       username,
       password
     });
    
    //console.log(token.token);
    //console.log(token.userdetails.authorities[0].authority);
    if(token.token && token.userdetails.authorities[0].authority == 'enseignant' ){
    history.push("/admin/index");
    localStorage.setItem('token',token.token);
    localStorage.setItem('role',token.userdetails.authorities[0].authority);
    localStorage.setItem('username',username);
    window.location.reload(false);
  }

   else { 
    alert('Identifiant et/ou mot de passe incorrectes')}
   
   }
   
  return (
    <div className="FirstTab">
      
<Row>
            <Col md="6">
            <img src={require("assets/img/ens.jpg").default}height="280px" width="400px"/>
                                                   
                                                        </Col>
                                                        <Col md="5">
                                                        <h3>Espace Enseignant</h3>
                                                        <h6>
Protégez vos données personnelles.
 Si vous utilisez un ordinateur public ou partagé,
  assurez-vous de quitter le navigateur à la fin de votre session de travail.</h6>
  <br></br>

      
      <form onSubmit={handleSubmit}>
      <Input  type="text" placeholder='Identifiant' required onChange={e => setUserName(e.target.value)} />
   
      <br></br>
      <br></br>
        <Input  type="password" placeholder='Mot de passe' required onChange={e => setPassword(e.target.value)} />
      
      <div>
        <br></br>
        <Button type="submit"  >Connexion</Button>
      </div>
    </form>
    </Col></Row>
    </div>
  )
  }
  
     Login.propTypes = {
      setToken: PropTypes.func.isRequired
};
