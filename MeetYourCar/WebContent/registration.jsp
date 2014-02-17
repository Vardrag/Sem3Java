<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.*" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="styles.css">
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>MeetYourCar</title>
   </head>
   <body>
      <div class="wrap">
         <div class="top"></div>
         <form method="POST" action="#" name="auswertung_login" class="container">
         <input type="hidden" name="auswertung_login">
            <div class="mycss">
               Anmeldung<br/>
               <div class="second_h">Nur wenige Schritte!</div>
            </div>
            <br/><br/>
            <div class="head">
               <div class="anmeldung">
                  Jetzt kostenlos Anmelden<br/><br/>
               </div>
            </div>
            <div class="links">
               <p>
                  Anrede*<br/>
                  <select name="ges" class="drop_select">
                     <option value="female">Frau</option>
                     <option value="male">Herr</option>
                  </select>
               </p>
               <p>Vorname*<br/>
                  <input class="textbox"type="text" name="vorname"> 
               </p>
               <p>Nachname*<br/>
                  <input class="textbox"type="text" name="nachname"> 
               </p>
               <p>Benutzername*<br/>
                  <input class="textbox"type="text" name="nachname"> 
               </p>
            </div>
            <div class="rechts">
               <p>E-Mail*<br/>
                  <input class="textbox"type="text" name="email">
               </p>
               <p>E-Mail Bestätigen*<br/>
                  <input class="textbox" type="password" name="passwort">
               </p>
               <p>Passwort*<br/>
                  <input class="textbox" type="password" name="passwort">
               </p>
               Passwort Bestätigen*<br/>
               <input class="textbox" type="password" name="passwort"><br/><br/>
            </div>
            <div class="pflichtfeld">
               *Pflichfeld<br/><br/>
            </div>
            <input type="submit" value="registrieren" class="suchen"/> oder <a href="/MeetYourCarRoot/index.jsp">zur Startseite</a>
         </form>
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