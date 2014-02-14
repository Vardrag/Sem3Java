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
         <form method="POST" action="#" name="edit_user_profil" class="container">
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
               <input class="textbox" type="text" name="edit_benutzername" value="--Benutzername--">
               <br/><br/>
               *Anrede <br/>
               <input class="textbox" type="text" name="edit_Anrede" value="--Anrede--">
               <br/><br/>
               *Vorname <br/>
               <input class="textbox" type="text" name="edit_Vorname" value="--Vorname--">
               <br/><br/>
               *Nachname <br/>
               <input class="textbox" type="text" name="edit_Nachname" value="--Nachname--">
               <br/><br/>
               *nicht editierbar<br/>
               <br/><br/>
            </div>
            <div class="rechts">
               E-Mail <br/>
               <input class="textbox" type="text" name="edit_email" value="--EMail--">
               <br/><br/>
               Ort <br/>
               <input class="textbox" type="text" name="edit_ort" value="--Ort--">
               <br/><br/>
               Straße <br/>
               <input class="textbox" type="text" name="edit_strasse" value="--Straße-">
               <br/><br/>
               PLZ <br/>
               <input class="textbox" type="text" name="edit_plz" value="--PLZ--">
               <br/><br/>
               Telefon <br/>
               <input class="textbox" type="text" name="edit_telefon" value="--Telefon--">
               <br/><br/>
            </div>
             <div>
               Passwort <br/>
               <input class="textbox" type="password" name="edit_telefon">
               <br/><br/>
               Passwort bestätigen <br/>
               <input class="textbox" type="password" name="edit_telefon">
               <br/><br/>
        	</div>
        	<div class="test">
            <input type="submit" value="übernehmen" class="suchen"/>oder <a href="/MeetYourCarRoot/index.jsp">zur Startseite</a><br/><br/></div>
            <img src="pics/hr.jpg" class="btw">
         </form>
         <div class="footer">
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