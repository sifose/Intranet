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
    const [data, setData] = useState([]);

const fetchInventory = () => {
    fetch("http://localhost:8080/api/moyennes",{  
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

let list1 = []
    data.forEach((item) => {
  
    if(item.observation=='admis' && item.anneeDeb == localStorage.getItem('saison')){
    
    list1.push(item)
   }})


   let list2 = []
    data.forEach((item) => {
  
    if(item.observation=='refusé' && item.anneeDeb == localStorage.getItem('saison')){
    
    list2.push(item)
   }})

   const dataChart = [
    { name: "Taut d'admission", value: list1.length },
    { name: "Taut de refus", value: list2.length },

  ];
  return (
    <>
   <div className="FirstTab">
    <form>
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
      </form>
      </div>
      
      </>
     
      
      
      
    );
  }
  