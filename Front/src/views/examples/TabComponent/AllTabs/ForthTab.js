
import PropTypes from 'prop-types';
import React, { useState } from 'react';
import Tables from 'views/examples/Tables';
import { useHistory } from 'react-router-dom';



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
    if(token.token && token.userdetails.authorities[0].authority == 'etudiant' ){
    history.push("/admin/index");
    localStorage.setItem('token',token.token);
    localStorage.setItem('role','parent');
    localStorage.setItem('username',username);
    
  }

   else { 
    alert('Identifiant et/ou mot de passe incorrectes')}
   
   }
   
  return (
    <div className="FirstTab">
      
      <form onSubmit={handleSubmit}>
      <input className='input' type="text" placeholder='Identifiant' onChange={e => setUserName(e.target.value)} />
   
      <br></br>
      <br></br>
        <input className='input' type="password" placeholder='Mot de passe' onChange={e => setPassword(e.target.value)} />
      
      <div>
        <br></br>
        <button type="submit" className='button' >se Connecter</button>
      </div>
    </form>
    </div>
  )
  }
  
     Login.propTypes = {
      setToken: PropTypes.func.isRequired
};
