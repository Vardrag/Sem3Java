package frontendPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.net.*;

import ressourcePackage.Car;
import ressourcePackage.User;
import db_connection.DB_connection;

public class MainCar extends HttpServlet
{
   static final long serialVersionUID = 1L;
   
   Car carObj = new Car(); //Car obj
   User userObj = new User(); // User obj
   DB_connection dbObj = new DB_connection(); //DB connection obj

 //Abfrage per Post
@Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	          throws ServletException, IOException {	
	   
	String form = request.getParameter("auswertung_login");
	if( form != null){
	   Object strAutofirma = request.getParameter("Marke");
	   Object strLeistung = request.getParameter("Leistung");
	   
	   //Parameter f�r Marke
	   StringBuffer sb = new StringBuffer((String) strAutofirma);
	   String ausgabe_Marke = sb.toString();   
	   //session handle f�r Marke
	   HttpSession Marke = request.getSession();
	   Marke.setAttribute("Marke", ausgabe_Marke);
	   	  	   
	   //Parameter f�r Leistung
	   StringBuffer tb = new StringBuffer((String) strLeistung);
	   String ausgabe_Leistung = tb.toString();
	   //session handle f�r Leistung
	   HttpSession Leistung = request.getSession();
	   Leistung.setAttribute("Leistung", ausgabe_Leistung);
	   
	   
	   //JSP-Aufruf
	   RequestDispatcher disp = 
			   getServletContext().
			   getRequestDispatcher("/erg_car_search.jsp");
	   disp.forward(request, response);
	}
	 
	   }  
}

