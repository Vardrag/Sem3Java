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
         <form method="POST" action="#" name="login_user" class="container">
         <input type="hidden" name="login_user">
            <div class="mycss">
               Ihr persönliches Profil-Login<br/>
               <div class="second_h">Login und direkt Angebote erstellen!</div>
            </div>
            <br/><br/>
            <div class="head">
               <div class="anmeldung">
                  Jetzt Einloggen!<br/><br/>
               </div>
            </div>
            <div class="links">
               Benutzername<br/>
               <input class="textbox"type="text" name="login_benutzername"> 
               <br/><br/>
            </div>
            <div class="rechts">
               Passwort<br/>
               <input class="textbox" type="password" name="login_pw"><br/><br/>
               <br/>
            </div>
            <p style="margin: 0 200px 0 0;"><input type="submit" value="login" class="suchen"/> oder <a href="/MeetYourCarRoot/index.jsp">zur Startseite</a>
            </p>
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
            <%@ include file="Datenschutz/Impressum.html" %>
         </div>
         <div class="bottom"></div>
      </div>
   </body>
</html>