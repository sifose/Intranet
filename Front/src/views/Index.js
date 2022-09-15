/*!

=========================================================
* Argon Dashboard React - v1.2.1
=========================================================

* Product Page: https://www.creative-tim.com/product/argon-dashboard-react
* Copyright 2021 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/argon-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import React from 'react';
import Login from "./examples/TabComponent/Tabs";
import { useState } from "react";
// node.js library that concatenates classes (strings)
import classnames from "classnames";
// javascipt plugin for creating charts
import Chart from "chart.js";
// react plugin used to create charts
import { Line, Bar } from "react-chartjs-2";
// reactstrap components
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  NavItem,
  NavLink,
  Nav,
  Progress,
  Table,
  Container,
  Row,
  Col,
} from "reactstrap";
import useToken from "components/useToken";
import Header from "components/Headers/Header.js";
import { useHistory } from 'react-router-dom';
import  {useEffect } from 'react';

function Index() {
  const history = useHistory();
  const { token, setToken } = useToken();
  const[classecourante,setClassecourante]=useState('')
    

  if(!localStorage.getItem('token')) {
    history.push("/auth/login")} 

    
  return (
    <>
      <Header />
     
      
    </>
  );
};

export default Index;
