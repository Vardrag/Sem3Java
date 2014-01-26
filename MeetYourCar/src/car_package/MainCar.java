package car_package;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainCar extends HttpServlet
{
   static final long serialVersionUID = 1L;

   @Override
   public void doGet( HttpServletRequest requ, HttpServletResponse resp )
   throws ServletException, IOException
   {
      resp.setContentType( "text/html" );
      PrintWriter out = resp.getWriter();
      out.println( "<html>" );
      out.println( "<h3> Hallo, mein erstes Servlet meldet sich </h3>" );
      out.println( "<a href='/MeetYourCarRoot/'>zur&uuml;ck</a>" );
      out.println( "</html>" );
      out.close();
   }
   
   //Abfrage per Post
   protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	          throws ServletException, IOException {
	   
	   //Benutzerauswahl in Variablen speichern
	   String carMarke = request.getParameter("Marke");
	   String carLeistung = request.getParameter("Leistung");
	   String carErstzulassung = request.getParameter("Erstzulassung");
	   String carPreis = request.getParameter("Preis");
	   String carKraftstoff = request.getParameter("Kraftstoff");
	   String carModell = request.getParameter("Modell");
	   String carKilometerstand = request.getParameter("Kilometerstand");
	   String carSonstiges = request.getParameter("sonstiges");
	   
	   //Ausgabe Benutzerauswahl
	   response.getWriter().println("<html>");
	   response.getWriter().println("Marke: " + carMarke + "<br/>");
	   response.getWriter().println("Leistung: " + carLeistung + "<br/>");
	   response.getWriter().println("Erstzulassung: " + carErstzulassung + "<br/>");
	   response.getWriter().println("Preis: " + carPreis + "<br/>");
	   response.getWriter().println("Kraftstoff: " + carKraftstoff + "<br/>");
	   response.getWriter().println("Modell: " + carModell + "<br/>");
	   response.getWriter().println("Kilometerstand: " + carKilometerstand + "<br/>");
	   response.getWriter().println("Sonstiges: " + carSonstiges + "<br/>");
	   response.getWriter().println("<p> <a href='/MeetYourCarRoot'>zur&uuml;ck</a> </p>");
	   response.getWriter().println("</html>");
	       }    
}

// Kommentar von ERIC @@@@@@@@@@@@@@@@@@ clemens