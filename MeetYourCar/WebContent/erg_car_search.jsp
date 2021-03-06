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
         <div class="container">
            <div class="mycss">
               <b>Ihre Suchanfrage</b><br/>
               <div class="second_h">Kontaktieren Sie den Fahrzeughalter!</div>
            </div>
            <br/><br/>
            <div class="head">
               <div class="anmeldung">
                  <b>Ihre Suchanfrage</b><br/><br/>
               </div>
            </div>
            <br/><br/>
            <div class="links">
               Marke<br/>
               <%= (String)session.getAttribute("Marke") %>
               <br/><br/>
               Leistung<br/>
               <%= (String)session.getAttribute("Leistung") %>
               <br/><br/>
               Erstzulassung<br/>
               <%= (String)session.getAttribute("Erstzulassung") %>
               <br/><br/>
            </div>
            <div class="rechts">
               Preis<br/>
               <%= (String)session.getAttribute("Preis") %>
               <br/><br/>
               Kraftstoff<br/>
               <%= (String)session.getAttribute("Kraftstoff") %>
               <br/><br/>
               Kilometerstand<br/>
               <%= (String)session.getAttribute("Kilometerstand")%>
               <br/><br/>
            </div>
            <div class="erg_suchanfrage">
               <b>Folgende Angebote sind vorhanden</b><br/><br/>
               --- ERG DER SUCHANFRAGE AUS DB ---
               <table class="tbl" cellspacing="0" cellpadding="0">
                  <thead>
                     <tr>
                        <th>Marke</th>
                        <th>Leistung</th>
                        <th>Erstzu.</th>
                        <th>Preis</th>
                        <th>Kraftst.</th>
                        <th>KmStand</th>
                        <th>Anbieter</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Link</td>
                     </tr>
                     <tr>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Link</td>
                     </tr>
                     <tr>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Link</td>
                     </tr>
                     <tr>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Text</td>
                        <td>Link</td>
                     </tr>
                  </tbody>
               </table>
               <br/><br/>
            </div>
            Haben Sie etwas gefunden?<br/><br/>
            Ja<a href="#"> Fahrzeughalter kontaktieren</a><br/>
            Falls nicht <a href="/MeetYourCarRoot/index.jsp">neue Suchanfrage</a>
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
         </div>
         <div class="bottom"></div>
      </div>
   </body>
</html>