<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.*" %>
<%@ page import="java.util.*" %>
<jsp:include page="/MainCar" flush="true"/> <% //lädt die MainCar.java ,  wird momentan nicht benötigt%>

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
            <div class="links">
               Marke<br/>
               <% String carMarke = request.getParameter("Marke"); %>
               <%= carMarke %>
               <br/><br/>
               Leistung<br/>
               <% String carLeistung = request.getParameter("Leistung"); %>
               <%= carLeistung %>
               <br/><br/>
               Erstzulassung<br/>
               <% String carErstzulassung = request.getParameter("Erstzulassung"); %>
               <%= carErstzulassung %>
               <br/><br/>
            </div>
            <div class="rechts">
               Preis<br/>
               <% String carPreis = request.getParameter("Preis"); %>
               <%= carPreis %>
               <br/><br/>
               Kraftstoff<br/>
               <% String carKraftstoff = request.getParameter("Kraftstoff"); %>
               <%= carKraftstoff %>
               <br/><br/>
               Kilometerstand<br/>
               <% String carKilometerstand = request.getParameter("Kilometerstand"); %>
               <%= carKilometerstand %>
               <br/><br/>
            </div>
            <div class="erg_suchanfrage">
               <b>Folgende Angebote sind vorhanden</b><br/><br/>
               --- ERG DER SUCHANFRAGE AUS DB ---
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








