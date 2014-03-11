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
         <form method="POST" action="MainCar" name="auswertung_login" class="container">
         <input type="hidden" name="auswertung_login">
            <div class="mycss">
               Willkommen auf MeetYourCar<br/>
               <div class="second_h">Finden Sie Ihr Auto!</div>
            </div>
            <br/><br/>
            <div class="head">
               <div class="login">
                  Besitzen Sie schon ein Konto?<br/>
                  <a href="Login.jsp" class="AllButtons">Login</a>
                  <a href="#" class="AllButtons">Logout</a><br/>
                  <a href="user_profil.jsp" class="AllButtons">Ihr Profil</a>
               </div>
               <div class="anmeldung">
                  Noch kein Benutzerkonto?<br/>
                  <a href="/MeetYourCarRoot/registration.jsp" class="AllButtons">kostenlos Anmelden</a>
               </div>
               <br/><br/>
            </div>
            Ihre persönlichen Anforderungen:<br/><br/>
            <div class="links">
               Marke: <br/>
               <select name="Marke" class="drop_select">
                  <option value="BWM">BMW</option>
                  <option value="Audi">Audi</option>
                  <option value="Bugatti">Bugatti</option>
                  <option value="Chrysler">Chrysler</option>
                  <option value="Fiat">Fiat</option>
                  <option value="Ford">Ford</option>
                  <option value="Mercedes">Mercedes</option>
               </select>
               <br/><br/>
               Leistung:<br/>
               <select name="Leistung" class="drop_select">
                  <option value="20">20 PS</option>
                  <option value="40">40 PS</option>
                  <option value="60">60 PS</option>
                  <option value="80">80 PS</option>
                  <option value="100">100 PS</option>
                  <option value="150">150 PS</option>
                  <option value="180">180 PS</option>
                  <option value="200">200 PS</option>
               </select>
               <br/><br/>
               Erstzulassung:<br/>
               <select name="Erstzulassung" class="drop_select">
                  <option value="2013">2013</option>
                  <option value="2012">2012</option>
                  <option value="2011">2011</option>
                  <option value="2010">2010</option>
                  <option value="2009">2009</option>
                  <option value="2008">2008</option>
                  <option value="2007">2007</option>
                  <option value="2006">2006</option>
                  <option value="2005">2005</option>
                  <option value="2004">2004</option>
                  <option value="2003">2003</option>
                  <option value="2002">2002</option>
                  <option value="2001">2001</option>
                  <option value="2000">2000</option>
                  
               </select>
            </div>
            <div class="rechts">
               Preis:<br/>
               <select name="Preis" class="drop_select">
                  <option value="1000">1000</option>
                  <option value="2000">2000</option>
                  <option value="4000">4000</option>
                  <option value="6000">6000</option>
                  <option value="8000">8000</option>
                  <option value="10000">10000</option>
                  <option value="15000">15000</option>
                  <option value="20000">20000</option>
                  <option value="40000">40000</option>
               </select>
               <br/><br/>
               Kraftstoff:<br/>
               <select name="Kraftstoff" class="drop_select">
                  <option value="Benzin">Benzin</option>
                  <option value="Diesel">Diesel</option>
               </select>
               <br/><br/>
            </div>
            <br/>
            <br/>
            <div class="mitte">
               <br/><br/>
               Kilometerstand:<br/>
               <select name="Kilometerstand" class="drop_select">
                  <option value="2500">2500</option>
                  <option value="5000">5000</option>
                  <option value="10000">10000</option>
                  <option value="20000">20000</option>
                  <option value="30000">30000</option>
                  <option value="40000">40000</option>
                  <option value="50000">50000</option>
                  <option value="60000">60000</option>
                  <option value="70000">70000</option>
               </select>
            </div>
            <br/><br/>
         
            <input type="submit" value="MeetYourCar" class="suchen"/><br/><br/>
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
         </div>
         <div class="bottom"></div>
      </div>
   </body>
</html>