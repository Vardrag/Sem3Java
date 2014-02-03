package frontendPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;


public class MainCar extends HttpServlet
{
   static final long serialVersionUID = 1L;
   @Override
   //Abfrage per Post
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	          throws ServletException, IOException {
	   
	   //Parameter Empfangen
	   String carMarke = request.getParameter("Marke");
	   /*String carLeistung = request.getParameter("Leistung");
	   String carErstzulassung = request.getParameter("Erstzulassung");
	   String carPreis = request.getParameter("Preis");
	   String carKraftstoff = request.getParameter("Kraftstoff");
	   String carModell = request.getParameter("Modell");
	   String carKilometerstand = request.getParameter("Kilometerstand");
	   String carSonstiges = request.getParameter("sonstiges");*/
	   
	   //Parameter 
	   StringBuffer sb = new StringBuffer(carMarke);
	   String ausgabe = sb.toString();
	   
	   //session handle
	   HttpSession session = request.getSession();
	   session.setAttribute("Marke", ausgabe);
	   
	   //JSP-Aufruf
	   RequestDispatcher disp = 
			   getServletContext().
			   getRequestDispatcher("/erg_car_search.jsp");
	   disp.forward(request, response);
	      
	 
	   }  
}

