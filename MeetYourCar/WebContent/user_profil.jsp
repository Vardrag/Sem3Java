<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.*" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="styles.css">
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Inserat aufgeben</title>
   </head>
   <body>
      <div class="wrap">
         <div class="top"></div>
         <div class="container">
            <div class="mycss">
               Ihr Benutzerprofil<br/>
               <div class="second_h">Jetzt Bearbeiten</div>
            </div>
            <br/><br/>
            <div class="head">
			<div class="anmeldung">
            	<b>Ihr Profil</b><br/><br/>
            </div>
            </div>
            <div class="links">
               *Benutzername <br/>
               --Benutzername--
               <br/><br/>
               *Anrede <br/>
               --Anrede--
               <br/><br/>
               *Vorname <br/>
               --Vorname--
               <br/><br/>
               *Nachname <br/>
               --Nachname--
               <br/><br/>
               *nicht editierbar<br/>
               <br/><br/>
            </div>
            <div class="rechts">
               E-Mail <br/>
               --EMail--
               <br/><br/>
               Ort <br/>
               --Ort--
               <br/><br/>
               Straße <br/>
               --Straße-
               <br/><br/>
               PLZ <br/>
               --PLZ--
               <br/><br/>
               Telefon <br/>
               --Telefon--
               <br/><br/>
            </div>
             <div>
               Passwort <br/>
               --%%%%%--
               <br/><br/>
        	</div>
            <div class="erg_suchanfrage">
               <b>Profil jetzt editieren?</b><br/><br/>
            </div>
            Ja<a href="edit_user_profil.jsp"> Edit Profil</a><br/>
            nein <a href="/MeetYourCarRoot/index.jsp">zur Startseite</a>
            <br><br>
            <a href="/MeetYourCarRoot/create_car.jsp">Neues Inserat aufgeben</a>
         </div>
         <div class="footer">
            <img src="pics/hr.jpg" class="btw">
            <br/>
            <h3> Aktuelle Topangebote!</h3>
            <br/>
            <a href="#"><img src="pics/test1_db.jpg" alt="car" name="car1_slide" width="193px" /></a>
            <a href="#"><img src="pics/test2_db.jpg" alt="car" name="car2_slide" width="193px"/></a>
            <a href="#"><img src="pics/test3_db.jpg" alt="car" name="car3_slide" width="193px"/></a>
            <br/>	<br/>
            <img src="pics/hr.jpg" class="btw">
            <br/><br/>     
            <%@ include file="Datenschutz/Impressum.html" %>
            <br/><br/>
            <h3> Meine WebApp-Startseite </h3>
            <p> <a href="/MeetYourCarRoot/StartPage.jsp">/MeetYourCarRoot/StartPage.jsp</a> </p>
            <br/>
            <h3> Meine Servlet </h3>
            <p> <a href="/MeetYourCarRoot/MainCar">/MeetYourCarRoot/MainCar</a> </p>
         </div>
         <div class="bottom"></div>
      </div>
   </body>
</html>








