
import Header from "components/Headers/Header.js";
import useToken from "components/useToken";
import Popup from "reactjs-popup";
import { useHistory } from 'react-router-dom';


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

import  "./popup.css"

const contentStyle = {
  maxWidth: "600px",
  width: "90%",
  backgroundColor: "Gray"
   
};


export default function Cahier()  {
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
  const history = useHistory();



  const handleClick=(e)=>{
    e.preventDefault()
    const cahier = {
    idEns: ens,
    codeCl: classe,
    codeModule: module,
    titre:titre,
    sujet:sujet,
    dateSaisie: datesaisie,
    anneeDeb: anneedeb
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
        /*body: JSON.stringify({
            username: '{userName}',
            password: '{password}'
        })*/
      }) /*end fetch */
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

<Popup
    trigger={<button className="button"> Remplir le cahier de textes </button>}
    modal
    contentStyle={contentStyle}
  > 
    {close => (
      <container>
      <form>
      <div  >
       <br></br>
        
        <div >
          {" "}
        </div>
        
<Container><Col><Row>
                    <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Enseignant
                  </label>

                  <Input
                    className="input"
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
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Classe
                  </label>

                  <Input
                    className="input"
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
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Module
                  </label>

                  <Input
                    className="input"
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
                  <label className="form-control-label"
                    htmlFor="input-username">
                    Titre
                  </label>
                  <Input className="input"
                    defaultValue=""
                    id="titre"
                    placeholder=""
                    type="text" 
                    onChange={(e)=>setTitre(e.target.value)}
                    >
                  </Input>
                  <label className="form-control-label"
                    htmlFor="input-username">
                    Sujet
                  </label>
                  <Input className="input"
                    defaultValue=""
                    id="sujet"
                    placeholder=""
                    type="textarea" 
                    onChange={(e)=>setSujet(e.target.value)}
                    >
                      
                  </Input>
                  
              <button className="button" onClick={(event) => { handleClick(event); close(); window.location.reload(false);}}>Enregistrer</button>
          <button
            className="button"
            onClick={() => {
              close();
              }}
          >
            Fermer 
          </button>
          
</Row></Col></Container>
          
        </div>
        </form>
        </container>
    ) }

  </Popup>
  
  
      
    </>
  );
 
}

