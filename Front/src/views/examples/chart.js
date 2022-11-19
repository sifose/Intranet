
import { PieChart, Pie, Cell,Bar,ResponsiveContainer,
    BarChart,
    XAxis,
    YAxis,
    CartesianGrid,
    Tooltip,
    Legend } from "recharts";
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
      CardTitle,
      CardText
    } from "reactstrap";

import React, {useCallback,useEffect, useState} from 'react';
import { textAlign } from "@mui/system";
import Header from "components/Headers/Header";
import ChartTabs from "views/examples//TabComponent/ChartTabs";
import Tab1 from "views/examples//TabComponent/AllTabs/Tab1";
import Tab2 from "views/examples//TabComponent/AllTabs/Tab2";
import Tab3 from "views/examples//TabComponent/AllTabs/Tab3";
import Tab4 from "views/examples//TabComponent/AllTabs/Tab4";






export default function App() {
  

 
  return (
  <>
  <Header/>
  <Container>
  <Row>
  <Card style={{ width: "30rem" , height:"30rem"}} >
          <CardBody>
          <CardTitle className="text-uppercase text-muted mb-0"> Admission annuelle</CardTitle>
            <div className="chart">
              {/* Chart wrapper */}
              <Tab1/>
            </div>
          </CardBody>
        </Card>
        &nbsp; &nbsp; 
        <Card style={{ width: "40rem" , height:"30rem"}} >
          <CardBody>
          <CardTitle className="text-uppercase text-muted mb-0">nombre d'absences par année</CardTitle>
            <div className="chart">
              {/* Chart wrapper */}
              <br></br><br></br><br></br>
              <Tab3/>
            </div>
          </CardBody>
        </Card>
        </Row>
        &nbsp;
        &nbsp;
        <Row>
        <Card style={{ width: "30rem" , height:"30rem"}} >
          <CardBody>
          <CardTitle className="text-uppercase text-muted mb-0">Taux de moyenne modulaire par classe</CardTitle>
            <div className="chart">
            <CardText>
              Veuillez insérer la classe et le module
            </CardText>
              {/* Chart wrapper */}
              <Tab2/>
            </div>
          </CardBody>
        </Card>
        &nbsp;
        &nbsp;
        <Card style={{ width: "40rem" , height:"30rem"}}>
          <CardBody>
          <CardTitle className="text-uppercase text-muted mb-0">Nombre d'absences par enseignant</CardTitle>
          <CardText>
              Veuillez insérer le nom d'enseignant
            </CardText>
            <div className="chart">
              {/* Chart wrapper */}
              <Tab4/>
            </div>
          </CardBody>
        </Card>
        </Row>
        </Container>
    </>
   
    
    
    
  );
}
