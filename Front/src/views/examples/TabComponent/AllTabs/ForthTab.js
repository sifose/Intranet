
import PropTypes from 'prop-types';
import React, { useState,useEffect } from 'react';
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


 
 export default function Login() {
  const history = useHistory();

   const [username, setUserName] = useState();
   const [password, setPassword] = useState();
   const [token, setToken] = useState();
   const [message, setMessage] = useState('');

   useEffect(()=>{
    console.log(token)
    if (token!=null){
      if(token.token && token.userdetails.authorities[0].authority == 'parent' ){
      history.push("/admin/index");
      localStorage.setItem('token',token.token);
      localStorage.setItem('username',username);
      localStorage.setItem('role',token.userdetails.authorities[0].authority);
      setMessage("")
      
      
      
      window.location.reload(false);
      }
  
    }
  
    },[token])
   
   const handleSubmit = async e => {
     e.preventDefault();

     fetch('http://localhost:8080/login', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
      username,
      password
    })
  })
    .then(data => data.json())
    .then(token => setToken(token))
    .then((responseData) => {
      this.setState({ message: responseData.message });
    }
  )
  .catch((error) => {
    console.error(error);
    // TODO: manage not found error
  });


if (token==null) { 
  setMessage("Identifiant ou mot de passe incorrecte")}
   
   }
   
  return (
    <div className="FirstTab">
      <Row>
            <Col md="6">
            <img src={require("assets/img/parent.jpg").default}height="280px" width="400px"/>
                                                   
                                                        </Col>
                                                        <Col md="5">
                                                        <h3>Espace Parent</h3>
                                                        <h6>
Protégez vos données personnelles.
 Si vous utilisez un ordinateur public ou partagé,
  assurez-vous de quitter le navigateur à la fin de votre session de travail.</h6>
  <br></br>
      <form onSubmit={handleSubmit}>
      <Input type="text" placeholder='Identifiant' required  onChange={e => setUserName(e.target.value)} />
   
      <br></br>
      <br></br>
        <Input   type="password" placeholder='Mot de passe' required onChange={e => setPassword(e.target.value)} />
      
      <div>
      <span style={{color:'red'}}>{message}</span>
        <br></br>
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
