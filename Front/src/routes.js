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
import MessagerieAdmin from "views/examples/MessagerieAdmin.js";
import note from "views/examples/note.js";
import clubs from "views/examples/clubs.js";
import cahierdetexte from "views/examples/cahierdetexte.js";
import Login from "views/examples/Login";
import cahierdetexteEns  from "views/examples/cahierdetextEns.js";


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
    icon: "ni ni-tv-2 text-primary",
    component: Index,
    layout: "/admin",
  },
  
  
  {
    path: "/cahier",
    name: "Cahiers de texte",
    icon: "ni ni-book-bookmark text-purple",
    component: cahierdetexte,
    layout: "/admin",
  },
  {
    path: "/absence",
    name: "Gestion des absences",
    icon: "ni ni-bullet-list-67 text-red",
    component: absence,
    layout: "/admin",
  },
  
  {
    path: "/messageAdmin",
    name: "Messagerie",
    icon: "ni ni-email-83 text-blue",
    component: MessagerieAdmin,
    layout: "/admin",
  },
  {
    path: "/notes",
    name: "gestion de notes",
    icon: "ni ni-briefcase-24  text-green",
    component: note,
    layout: "/admin",
  },
  {
    path: "/clubs",
    name: "Activités des Clubs",
    icon: "ni ni-calendar-grid-58 text-pink",
    component: clubs,
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
      name: "Dashboard",
      icon: "ni ni-tv-2 text-primary",
      component: Index,
      layout: "/admin",
    },
    
    
    {
      path: "/cahierEns",
      name: "Cahiers de texte",
      icon: "ni ni-book-bookmark text-purple",
      component: cahierdetexteEns,
      layout: "/admin",
    },
    {
      path: "/absence",
      name: "Gestion des absences",
      icon: "ni ni-bullet-list-67 text-red",
      component: absence,
      layout: "/admin",
    },
    
    {
      path: "/messageAdmin",
      name: "Messagerie",
      icon: "ni ni-email-83 text-blue",
      component: MessagerieAdmin,
      layout: "/admin",
    },
    {
      path: "/notes",
      name: "gestion de notes",
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
        icon: "ni ni-tv-2 text-primary",
        component: Index,
        layout: "/admin",
      },
      
      
      {
        path: "/cahier",
        name: "Cahiers de texte",
        icon: "ni ni-book-bookmark text-purple",
        component: cahierdetexteEns,
        layout: "/admin",
      },
      {
        path: "/absence",
        name: "Gestion des absences",
        icon: "ni ni-bullet-list-67 text-red",
        component: absence,
        layout: "/admin",
      },
      
      {
        path: "/messageAdmin",
        name: "Messagerie",
        icon: "ni ni-email-83 text-blue",
        component: MessagerieAdmin,
        layout: "/admin",
      },
      {
        path: "/notes",
        name: "gestion de notes",
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

    if(localStorage.getItem('role')=='parent'){
      var routes = [
      
        {
          path: "/index",
          name: "Dashboard",
          icon: "ni ni-tv-2 text-primary",
          component: Index,
          layout: "/admin",
        },
        
        
        {
          path: "/cahier",
          name: "Cahiers de texte",
          icon: "ni ni-book-bookmark text-purple",
          component: cahierdetexteEns,
          layout: "/admin",
        },
        {
          path: "/absence",
          name: "Gestion des absences",
          icon: "ni ni-bullet-list-67 text-red",
          component: absence,
          layout: "/admin",
        },
        
        {
          path: "/messageAdmin",
          name: "Messagerie",
          icon: "ni ni-email-83 text-blue",
          component: MessagerieAdmin,
          layout: "/admin",
        },
        {
          path: "/notes",
          name: "gestion de notes",
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
         
      ];}}
      

      




export default routes;
