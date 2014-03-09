<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.util.regex.*" %>
<%!
private String getStartErrorTag(String sKey, Vector vError)
{
   if (vError.contains(sKey))
   {
      return "<b>";
   }
   return "";
}

private String getEndErrorTag(String sKey, Vector vError)
{
   if (vError.contains(sKey))
   {
      return "</b>";
   }
   return "";
}

%>
<%
Vector vError = new Vector();
String sVorname = "";
String sNachname = "";
String sBenutzername = "";
String sEmail = "";
String sEmail_control = "";
String sPasswort = "";
String sPasswort_control = "";

// Wenn das Formular abgeschickt wurde
if (request.getParameter("vorname") != null)
{
   sVorname  = request.getParameter("vorname");
   if (sVorname.length() == 0) vError.add("vorname");
   
   sNachname  = request.getParameter("nachname");
   if (sNachname.length() == 0) vError.add("nachname");
   
   sBenutzername  = request.getParameter("benutzername");
   if (sBenutzername.length() == 0) vError.add("benutzername"); 
   
   sEmail  = request.getParameter("email");
   if (sEmail.length() == 0) vError.add("email");
   
   sEmail_control  = request.getParameter("email_control");
   if (sEmail_control.length() == 0) vError.add("email_control");
   
   sPasswort  = request.getParameter("passwort");
   if (sPasswort.length() == 0) vError.add("passwort"); 
   
   sPasswort_control  = request.getParameter("passwort_control");
   if (sPasswort_control.length() == 0) vError.add("passwort_control"); 
   
   sEmail = request.getParameter("email");
   Pattern p = Pattern.compile("^[a-zA-Z0-9]+((\\.|!|_|\\+|\\-)[a-zA-Z0-9]+)*@([a-zA-Z0-9]+(\\.|\\-))+[a-zA-Z0-9]{2,}$");
   Matcher m = p.matcher(sEmail);
   if (!m.matches()) vError.add("email");      
   

}

if (request.getParameter("vorname") != null && vError.isEmpty())
{
	RequestDispatcher disp = 
	getServletContext().
	getRequestDispatcher("/MainCar");
	disp.forward(request, response);
 }

else
{
%>   

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
         <form method="POST" action="registration.jsp" name="auswertung_registration" class="container">
         <input type="hidden" name="auswertung_registration">
            <div class="mycss">
               Anmeldung<br/>
               <div class="second_h">Nur wenige Schritte!</div>
            </div>
            <br/><br/>
            <div class="head">
               <div class="anmeldung">
                  Jetzt kostenlos Anmelden<br/><br/>
                  
<%
   if (!vError.isEmpty())
   {
      out.print("<b>Bitte überprüfen Sie die markierten Felder</b><br>");
   }   
%>  
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
               <p><%= getStartErrorTag("vorname", vError) %>Vorname*<%= getEndErrorTag("vorname", vError) %><br/>
                  <input class="textbox" type="text" name="vorname" value="<%= sVorname %>"> 
               </p>
               <p><%= getStartErrorTag("nachname", vError) %>Nachname*<%= getEndErrorTag("nachname", vError) %><br/>
                  <input class="textbox" type="text" name="nachname" value="<%= sNachname %>"> 
               </p>
               <p><%= getStartErrorTag("benutzername", vError) %>Benutzername*<%= getEndErrorTag("benutzername", vError) %><br/>
                  <input class="textbox" type="text" name="benutzername" value="<%= sBenutzername %>"> 
               </p>
            </div>
            <div class="rechts">
               <p><%= getStartErrorTag("email", vError) %>E-Mail*<%= getEndErrorTag("email", vError) %><br/>
                  <input class="textbox" type="text" name="email" value="<%= sEmail %>">
               </p>
               <p><%= getStartErrorTag("email_control", vError) %>E-Mail Bestätigen*<%= getEndErrorTag("email_control", vError) %><br/>
                  <input class="textbox" type="text" name="email_control" value="<%= sEmail_control %>">
               </p>
               <p><%= getStartErrorTag("passwort", vError) %>Passwort*<%= getEndErrorTag("passwort", vError) %><br/>
                  <input class="textbox" type="password" name="passwort" value="<%= sPasswort %>">
               </p>
               <%= getStartErrorTag("passwort_control", vError) %>Passwort Bestätigen*<%= getEndErrorTag("passwort_control", vError) %><br/>
               <input class="textbox" type="password" name="passwort_control" value="<%= sPasswort_control %>"><br/><br/>
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
<%
}
%>