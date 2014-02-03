package frontendPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.net.*;

import ressourcePackage.Car;



public class MainCar extends HttpServlet
{
   static final long serialVersionUID = 1L;
  
   Car carObj = new Car();
   @Override
   //Abfrage per Post
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	          throws ServletException, IOException {
	   
	   Object strAutofirma = request.getParameter("Marke");
	   Object strLeistung = request.getParameter("Leistung");
	   
	   //Parameter 
	   StringBuffer sb = new StringBuffer((String) strAutofirma);
	   String ausgabe_Marke = sb.toString();   
	   //session handle
	   HttpSession Marke = request.getSession();
	   Marke.setAttribute("Marke", ausgabe_Marke);
	   	  	   
	   //Parameter
	   StringBuffer tb = new StringBuffer((String) strLeistung);
	   String ausgabe_Leistung = tb.toString();
	   //session handle
	   HttpSession Leistung = request.getSession();
	   Leistung.setAttribute("Leistung", ausgabe_Leistung);
	   
	   
	 
	   
	   
	   
	   
	   
	   //JSP-Aufruf
	   RequestDispatcher disp = 
			   getServletContext().
			   getRequestDispatcher("/erg_car_search.jsp");
	   disp.forward(request, response);
	      
	 
	   }  
}

