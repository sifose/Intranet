import {

  Card,
  CardHeader,  
  Table,
  Container,
  Row,
} from "reactstrap";
import  {useEffect, useState } from 'react';
import Header from "components/Headers/Header.js";
import useToken from "components/useToken";



export default function Cahier()  {

  const[cahiers,setCahiers]=useState([])
  const { token, setToken } = useToken();

  var options = {  
    method: 'GET',
    headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
      'Content-Type': 'application/json'
    }
  }
    
  useEffect(()=>{
     fetch("http://localhost:8080/api/cahiers",options)
    .then(res=>res.json())
    .then((result)=>{
    setCahiers(result);
    }
  )
  },[])
  console.log(`Bearer ${localStorage.getItem('token')}`);
  
  
  
  return (
    <>
      <Header />
      
      <Container className="mt--7" fluid>
        {/* Table */}
        <Row>
          <div className="col">
            <Card className="shadow">
              <CardHeader className="border-0">
                <h3 className="mb-0">Contenu des cahiers de texte</h3>
              </CardHeader>
              <Table className="align-items-center table-flush" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">Classe</th>
                    <th scope="col">Date de saisie</th>
                    <th scope="col">Titre</th>
                    <th scope="col">Sujet</th>
                  </tr>
                </thead>
                <tbody>
                {cahiers.map(cahier=> 
                <tr key={cahier.idEns}>
                  <td>{cahier.codeCl}</td>
                  <td>{cahier.dateSaisie}</td>
                  <td>{cahier.titre}</td>
                  <td>{cahier.sujet}</td>
                  </tr>
               
               )}
                </tbody>
              </Table>
              </Card>
          </div>
        </Row>
      </Container>
    </>
  );
};

