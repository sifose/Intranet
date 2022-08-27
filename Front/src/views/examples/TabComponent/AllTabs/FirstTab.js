
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
    if(token.token && token.userdetails.authorities[0].authority == 'admin' ){
    history.push("/admin/tables");
    localStorage.setItem('token',token.token);
    localStorage.setItem('role',token.userdetails.authorities[0].authority);
  }

   else { 
    alert('Identifiant et/ou mot de passe incorrectes')}
   
   }
   
  return (
    <div className="FirstTab">
      <p>Bienvenue à l'espace étudiant</p>
      <form onSubmit={handleSubmit}>
      <label>
        <p>Username</p>
        <input type="text" onChange={e => setUserName(e.target.value)} />
      </label>
      <br></br>
      <label>
        <p>Password</p>
        <input type="password" onChange={e => setPassword(e.target.value)} />
      </label>
      <div>
        <button type="submit"  >Submit</button>
      </div>
    </form>
    </div>
  )
  }
  
     Login.propTypes = {
      setToken: PropTypes.func.isRequired
};
