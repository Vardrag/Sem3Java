<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="styles.css">
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Fahrzeug anzeigen</title>
   </head>
   <body>
      <div class="wrap">
         <div class="top"></div>
         <form method="POST" action="MainCar" name="auswertung_login" class="container">
         <input type="hidden" name="auswertung_login">
            <div class="mycss">
               Meet Your Car<br/>
               <div class="second_h">Ihr ausgewähltes Fahrzeug!</div>
            </div>
            <br/><br/>
            <div class="head">
               
            <div class="anmeldung">
            	<b>Fahrzeugdaten</b><br/><br/>
            </div>
            </div>
            <div class="links">
               <br><br><br>
               Marke <br/>
               	DB Abfrage get...
               <br/><br/>
               Leistung <br/>
                DB Abfrage get...
               <br/><br/>
               Erstzulassung<br/>
                DB Abfrage get...
               <br/><br/>
               Kraftstoff <br/>
                DB Abfrage get...
               <br/><br/>
               Kilometerstand <br/>
                DB Abfrage get...
               <br/><br/>
               Preis <br/>
                DB Abfrage get...
               <br/><br/><br/><br/>
               <a href="/MeetYourCarRoot/index.jsp">zur Startseite</a>
            </div>
            <div class="rechts">
            <br><br><br>
               <a href="#"><img src="pics/test1_db.jpg" alt="car" name="car1" width="200px" /></a><br/>
               <br/><br/>
            </div>
        	</div>
         </form>
         
         <div class="bottom"></div>
      </div>
   </body>
</html>