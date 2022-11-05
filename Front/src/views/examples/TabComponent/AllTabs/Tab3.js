
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





const COLORS = ["#0088FE", "#00C49F", "#FFBB28", "#FF8042"];

export default function App() {
   

  const [data2, setData2] = useState([]);

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

let list2017 = []
let list2018 = []
let list2019 = []
let list2020 = []
let list2021 = []
data2.forEach((item) => {

if(item.anneeDeb == '2017'){

list2017.push(item)
}
if(item.anneeDeb == '2018'){

    list2018.push(item)
    }
    if(item.anneeDeb == '2019'){

        list2019.push(item)
        }
        if(item.anneeDeb == '2020'){

            list2020.push(item)
            }
            if(item.anneeDeb == '2021'){

                list2021.push(item)
                }



})

const dataBar = [
    { name: "2017", absences: list2017.length },
    { name: "2018", absences: list2018.length },
    { name: "2019", absences: list2019.length },
    { name: "2020", absences: list2020.length },
    { name: "2021", absences: list2021.length }

  ];

 
  return (
  <>

<div className="FirstTab">
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
