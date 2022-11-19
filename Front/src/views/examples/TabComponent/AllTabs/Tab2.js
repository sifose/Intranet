import { PieChart, Pie, Cell,Bar,ResponsiveContainer,
    BarChart,
    XAxis,
    YAxis,
    CartesianGrid,
    Tooltip,
    Legend } from "recharts";
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
       

import React, {useCallback,useEffect, useState} from 'react';
import { textAlign } from "@mui/system";
import Header from "components/Headers/Header";





const COLORS = ["#0088FE", "#00C49F", "#FFBB28", "#FF8042"];

const RADIAN = Math.PI / 180;
const renderCustomizedLabel = ({
  cx,
  cy,
  midAngle,
  innerRadius,
  outerRadius,
  percent,
  index
}) => {
  const radius = innerRadius + (outerRadius - innerRadius) * 0.5;
  const x = cx + radius * Math.cos(-midAngle * RADIAN);
  const y = cy + radius * Math.sin(-midAngle * RADIAN);

  return (
    <text
      x={x}
      y={y}
      fill="white"
      textAnchor={x > cx ? "start" : "end"}
      dominantBaseline="central"
    >
      {`${(percent * 100).toFixed(0)}%`}
    </text>
  );
};
export default function App() {
    const [classe, setClasse] = useState('4 M 2');
    const [module, setModule] = useState('FKR-ITAL');
    const [datamodule, setDatamodule] = useState([]);
    const [dataclasse, setDataclasse] = useState([]);

    useEffect(()=>{
        fetch('http://localhost:8080/api/modules', {
          method: 'GET',
          headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
          
        }) 
          .then(results => results.json())
          .then(datamodule => setDatamodule(datamodule)
    
          )
   
    
        fetch('http://localhost:8080/api/classes', {
          method: 'GET',
          headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
          
        }) 
          .then(results => results.json())
          .then(dataclasse => setDataclasse(dataclasse))
      },[])


    const [data, setData] = useState([]);

const fetchInventory = () => {
    fetch("http://localhost:8080/api/notes",{  
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Content-Type': 'application/json',}}
    ) 
  
      .then(res=>res.json())
      .then((result)=>{
       setData(result);
      }
    )
  }

  useEffect(() => {
    fetchInventory();
   
}, [data]);


let list = []
    data.forEach((item) => {
  
    if(item.codeCl==classe && item.codeModule==module && item.anneeDeb == localStorage.getItem('saison')){
    
    list.push(item)
   }})

let list1 = []
    list.forEach((item) => {
  
    if(item.moyenne>=10){
    
    list1.push(item)
   }})


   let list2 = []
    list.forEach((item) => {
  
    if(item.moyenne<10){
    
    list2.push(item)
   }})

   const dataChart = [
    { name: "élèves qui ont la moyenne", value: list1.length },
    { name: "élèves qui n'ont pas la moyenne", value: list2.length },

  ];
  return (
    <>
    
   <div className="FirstTab">
    
   <Form >
          <Row>
            
            <Col md="3">
              <FormGroup>
              <label className="form-control-label" for="codeCl">Classe</label>
                <Input  
                id="codeCl"
                 type="select" 
                 onChange={(e)=>setClasse(e.target.value)}>
                    {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl}</option>
                    ))}
                    </Input>
              </FormGroup>
            </Col>
            <Col md="3">
              <FormGroup>
              <label className="form-control-label" for="codeModule">Module</label>
                <Input  
                id="codeModule"
                 type="select" 
                 onChange={(e)=>setModule(e.target.value)}>
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation}</option>
                    ))}
                    </Input>
              </FormGroup>
            </Col>
            </Row></Form>

      <PieChart width={400} height={400}>
  
        <Pie
        
          data={dataChart}
          cx={200}
          cy={200}
          labelLine={false}
          label={renderCustomizedLabel}
          outerRadius={80}
          fill="#8884d8"
          dataKey="value"
        >
          {dataChart.map((entry, index) => (
            <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
          ))}
           
        </Pie>
        <Legend width={400} height={100}/>
      </PieChart>
      </div>
    
      </>
     
      
      
      
    );
  }
  