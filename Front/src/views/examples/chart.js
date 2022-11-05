
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
import ChartTabs from "views/examples//TabComponent/ChartTabs";





export default function App() {
  

 
  return (
  <>
  <Header/>
<ChartTabs/>
    </>
   
    
    
    
  );
}
