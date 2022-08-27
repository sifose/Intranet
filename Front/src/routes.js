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
import Maps from "views/examples/Maps.js";
import Register from "views/examples/Register.js";
import Login from "views/examples/Login.js";
import Tables from "views/examples/Tables.js";
import Icons from "views/examples/Icons.js";
import Cahiers from "views/examples/cahier.js";
import absence from "views/examples/absence.js";
import message from "views/examples/Message.js";
import note from "views/examples/note.js";
import clubs from "views/examples/clubs.js";
import Cahier from "views/examples/cahier.js";

var routes = [
  
  {
    path: "/index",
    name: "Dashboard",
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
  {
    path: "/login",
    name: "Login",
    icon: "ni ni-key-25 text-info",
    component: Login,
    layout: "/auth",
  },
  
  {
    path: "/cahiers",
    name: "Cahiers de texte",
    icon: "ni ni-book-bookmark text-purple",
    component: Cahiers,
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
    path: "/messages",
    name: "Messagerie",
    icon: "ni ni-email-83 text-blue",
    component: message,
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
    path: "/cahier",
    name: "Cahiers de texte 2 ",
    icon: "ni ni-book-bookmark text-purple",
    component: Cahier,
    layout: "/admin",
  },
];
export default routes;
