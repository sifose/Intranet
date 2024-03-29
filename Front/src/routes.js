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
import Index from "views/Index.js";
import Profile from "views/examples/Profile.js";
import Tables from "views/examples/Tables.js";
import Icons from "views/examples/Icons.js";
import absence from "views/examples/absence.js";
import absenceEns from "views/examples/absenceEns.js";
import MessagerieAdmin from "views/examples/MessagerieAdmin.js";

import conseil from "views/examples/conseil";
import cahierdetexte from "views/examples/cahierdetexteAdmin.js";
import Login from "views/examples/Login";
import cahierdetexteEns  from "views/examples/cahierdetextEns.js";
import cahierdetexteEleve  from "views/examples/cahierdetexteEleve.js";
import MessagerieEns from "views/examples/MessagerieEns.js";
import MessagerieEleve from "views/examples/MessagerieEleve.js";
import MessagerieParent from "views/examples/MessagerieParent.js";
import absenceadminlist from "views/examples/AbsencelistAdmin.js";
import absenceEtudList from "views/examples/AbsenceEtudList.js";
import Modal from "views/examples/Modal";
import autorisation from "views/examples/autorisation.js";
import note from "views/examples/note.js";
import noteAdmin from "views/examples/noteAdmin";
import noteEtudiant from "views/examples/noteEtudiant";
import chart from "views/examples/chart";


if(!localStorage.getItem('token'))
var routes = [

  {
    path: "/login",
    name: "login",
    icon: "ni ni-calendar-grid-58 text-pink",
    component: Login,
    layout: "/auth",
  },
  {
    path: "/index",
    name: "Accueil",
    icon: "ni ni-tv-2 text-primary",
    component: Index,
    layout: "/admin",
  },
  {
    path: "/icons",
    name: "Icons",
    icon: "ni ni-planet text-blue",
    component: Icons,
    layout: "/admin",
  },
  
  {
    path: "/user-profile",
    name: "User Profile",
    icon: "ni ni-single-02 text-yellow",
    component: Profile,
    layout: "/admin",
  },
  {
    path: "/tables",
    name: "Tables",
    icon: "ni ni-bullet-list-67 text-red",
    component: Tables,
    layout: "/admin",
  },
   
]
else{

  if(localStorage.getItem('role')=='admin'){
var routes = [

  {
    path: "/index",
    name: "Accueil",
    icon: "ni ni-shop text-primary",
    component: Index,
    layout: "/admin",
  },
  {
    path: "/cahier",
    name: "Cahier des textes",
    icon: "ni ni-book-bookmark text-purple",
    component: cahierdetexte,
    layout: "/admin",
  },
  {
    path: "/absence",
    name: "Saisir absences",
    icon: "ni ni-ui-04 text-red",
    component: absence,
    layout: "/admin",
  },
  
  {
    path: "/absencelist",
    name: "Absences",
    icon: "ni ni-ruler-pencil text-red",
    component: absenceadminlist,
    layout: "/admin",
  }
  ,
  {
    path: "/messageAdmin",
    name: "Messagerie",
    icon: "ni ni-email-83 text-blue",
    component: MessagerieAdmin,
    layout: "/admin",
  },
  
  {
    path: "/noteAdmin",
    name: "Résultats",
    icon: "ni ni-briefcase-24  text-black",
    component: noteAdmin,
    layout: "/admin",
  },
  
      {
        path: "/autorisation",
        name: "Autorisations",
        icon: "ni ni-lock-circle-open text-orange",
        component: autorisation,
        layout: "/admin",
      },
  {
    path: "/conseil",
    name: "Conseil de classe",
    icon: "ni ni-paper-diploma text-green",
    component: conseil,
    layout: "/admin",
  },
  {
    path: "/charts",
    name: "Statiqtiques",
    icon: "ni ni-chart-pie-35 text-yellow",
    component: chart,
    layout: "/admin",
  },
  {
    path: "/login",
    name: "login",
    icon: "ni ni-calendar-grid-58 text-pink",
    component: Login,
    layout: "/auth",
  }
   
];}


if(localStorage.getItem('role')=='enseignant'){
  var routes = [
  
    {
      path: "/index",
      name: "Accueuil",
      icon: "ni ni-shop text-primary",
      component: Index,
      layout: "/admin",
    },
    
    
    {
      path: "/cahierEns",
      name: "Cahier des textes",
      icon: "ni ni-book-bookmark text-purple",
      component: cahierdetexteEns,
      layout: "/admin",
    },
    {
      path: "/absenceEns",
      name: "Saisir absences",
      icon: "ni ni-bullet-list-67 text-red",
      component: absenceEns,
      layout: "/admin",
      
    },
    {
      path: "/messageEns",
      name: "Messagerie",
      icon: "ni ni-email-83 text-blue",
      component: MessagerieEns,
      layout: "/admin",
    },
    {
      path: "/notes",
      name: "Résultats",
      icon: "ni ni-briefcase-24  text-green",
      component: note,
      layout: "/admin",
    },
    {
      path: "/login",
      name: "login",
      icon: "ni ni-calendar-grid-58 text-pink",
      component: Login,
      layout: "/auth",
    }
     
  ];}

  if(localStorage.getItem('role')=='etudiant'){
    var routes = [
    
      {
        path: "/index",
        name: "Dashboard",
        icon: "ni ni-shop text-primary",
        component: Index,
        layout: "/admin",
      },
      
      
      {
        path: "/cahier",
        name: "Cahier des textes",
        icon: "ni ni-book-bookmark text-purple",
        component: cahierdetexteEleve,
        layout: "/admin",
      },
      {
        path: "/absenceEtud",
        name: "Absences",
        icon: "ni ni-bullet-list-67 text-red",
        component: absenceEtudList,
        layout: "/admin",
      },
      
      {
        path: "/messageEleve",
        name: "Messagerie",
        icon: "ni ni-email-83 text-blue",
        component: MessagerieEleve,
        layout: "/admin",
      },
      {
        path: "/noteEleve",
        name: "Résultats",
        icon: "ni ni-briefcase-24  text-green",
        component: noteEtudiant,
        layout: "/admin",
      },
      {
        path: "/login",
        name: "login",
        icon: "ni ni-calendar-grid-58 text-pink",
        component: Login,
        layout: "/auth",
      }
    
       
    ];}

    if(localStorage.getItem('role')=='parent'){
      var routes = [
      
        {
          path: "/index",
          name: "Accueil",
          icon: "ni ni-shop text-primary",
          component: Index,
          layout: "/admin",
        },
        
        
        {
          path: "/cahier",
          name: "Cahier des textes",
          icon: "ni ni-book-bookmark text-purple",
          component: cahierdetexteEleve,
          layout: "/admin",
        },
        {
          path: "/absence",
          name: "Absences",
          icon: "ni ni-bullet-list-67 text-red",
          component: absenceEtudList,
          layout: "/admin",
        },
        
        {
        path: "/messagerieParent",
        name: "Messagerie",
        icon: "ni ni-email-83 text-blue",
        component: MessagerieParent,
        layout: "/admin",
      },
      {
        path: "/noteEleve",
        name: "Résultats",
        icon: "ni ni-briefcase-24  text-green",
        component: noteEtudiant,
        layout: "/admin",
      },
        {
          path: "/login",
          name: "login",
          icon: "ni ni-calendar-grid-58 text-pink",
          component: Login,
          layout: "/auth",
        }
         
      ];}}
      

      




export default routes;
