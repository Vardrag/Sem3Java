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
    <div class="mycss">Anmeldung<br/>
    <div class="second_h">Nur wenige Schritte!</div></div><br/><br/>
    <div class="head">
    	<div class="anmeldung">
    	Jetzt kostenlos Anmelden<br/><br/>
    	</div>
    </div>
    <div class="links">
    Anrede*<br/>
       
       <select name="Kilometerstand" class="anrede">
       	<option value="female">Frau</option>
       	<option value="male">Herr</option>
       </select> <br/><br/>
      Vorname*<br/>
      <input class="textbox"type="text" name="vorname"> 
      <br/><br/>
       Nachname*<br/>
      <input class="textbox"type="text" name="nachname"> 
     <br/><br/>
       
      </div>
      
      <div class="rechts">
	  E-Mail*<br/>
      	<input class="textbox"type="text" name="email"><br/><br/>
      Passwort*<br/>
      	<input class="textbox" type="password" name="passwort"><br/><br/>
      Passwort best�tigen*<br/>
      	<input class="textbox" type="password" name="passwort"> <br/><br/>
      </div>
      <div class="pflichtfeld">
      *Pflichfeld<br/><br/>
      </div>
   
   <input type="submit" value="registrieren" class="suchen"/> oder <a href="/MeetYourCarRoot/index.jsp">zur Startseite</a>
   </form>
   <div class="footer">
   
   <img src="pics/hr.jpg" class="btw">
   	<br/>
   	<h3> Aktuelle Topangebote!</h3><br/>
   		<a href="#"><img src="pics/test1_db.jpg" alt="car" name="car1_slide" width="193px" /></a>
   		<a href="#"><img src="pics/test2_db.jpg" alt="car" name="car2_slide" width="193px"/></a>
   		<a href="#"><img src="pics/test3_db.jpg" alt="car" name="car3_slide" width="193px"/></a>
   	<br/>	<br/>
   <img src="pics/hr.jpg" class="btw">
   	<br/><br/>
   
   	Impressum
   
   	<br/><br/><br/>
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








