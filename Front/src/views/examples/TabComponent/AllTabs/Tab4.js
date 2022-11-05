
import { PieChart, Pie, Cell,Bar,ResponsiveContainer,
    BarChart,
    XAxis,
    YAxis,
    CartesianGrid,
    Tooltip,
    Legend } from "recharts";

import React, {useCallback,useEffect, useState} from 'react';
import { textAlign } from "@mui/system";
import Header from "components/Headers/Header";
import {
    Table,
    Container,
    Card, 
     Form,
     Input,
     InputGroupAddon,
     FormGroup,
     InputGroup,
     Row,
     Col,
     Button,
     Modal
   } from "reactstrap";





const COLORS = ["#0088FE", "#00C49F", "#FFBB28", "#FF8042"];

export default function App() {
   
const [dataenseignant, setDataenseignant] = useState([]);
  const [data2, setData2] = useState([]);
  const [ens, setEns] = useState('');

  useEffect(()=>{
    fetch('http://localhost:8080/api/enseignants', {
          method: 'GET',
          headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
        }) 
          .then(results => results.json())
          .then(dataenseignant => setDataenseignant(dataenseignant)
    
          )
  },[])

  const fetchInventory2 = () => {
    fetch("http://localhost:8080/api/absences",{  
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Content-Type': 'application/json',}}
    ) 
  
      .then(res=>res.json())
      .then((result)=>{
       setData2(result);
        console.log(data2)
      }
    )
  }

  useEffect(() => {
    fetchInventory2();
   
}, [data2]);

let list1 = []
let list2 = []

data2.forEach((item) => {

if(item.anneeDeb == localStorage.getItem('saison') && item.idEns == ens && item.semestre==1){

list1.push(item)
}
if(item.anneeDeb == localStorage.getItem('saison') && item.idEns == ens && item.semestre==2){

list2.push(item)
    }
    


})
console.log(list1)
const dataBar = [
    { name: "semestre 1", absences: list1.length },
    { name: "semestre 2", absences: list2.length }
   

  ];

 
  return (
  <>

<div className="FirstTab">

<Form >
          <Row>
            
            <Col md="3">
              <FormGroup>
              <label className="form-control-label" for="codeCl">Enseignant</label>
                <Input  
                id="codeCl"
                 type="select" 
                 onChange={(e)=>setEns(e.target.value)}>
                    {dataenseignant.map((option) => (
                      <option value={option.idEns}>{option.nomEns}</option>
                    ))}
                    </Input>
              </FormGroup>
            </Col>
            
            </Row></Form>

    <BarChart
      width={600}
      height={300}
      data={dataBar}
      margin={{
        top: 5,
        right: 30,
        left: 20,
        bottom: 5
      }}
      barSize={20}
    >
      <XAxis dataKey="name" scale="point" padding={{ left: 10, right: 10 }} />
      <YAxis />
      <Tooltip />
      <Legend />
      <CartesianGrid strokeDasharray="3 3" />
      <Bar dataKey="absences" fill="#8884d8" background={{ fill: "#eee" }} />
    </BarChart>
    </div>
    </>
   
    
    
    
  );
}
