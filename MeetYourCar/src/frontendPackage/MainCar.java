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
	   
	String form_registration = request.getParameter("auswertung_registration"); 
	String form_index = request.getParameter("auswertung_login");
	String form_edit_user_profil = "";
	String form_login = "";
	
	
	
	
	if( form_registration != null){
		
		String anrede = request.getParameter("ges");
		String vorname = request.getParameter("vorname");
		String nachname = request.getParameter("nachname");
		String benutzername = request.getParameter("benutzername");
		String email = request.getParameter("email");
		String passwort = request.getParameter("passwort");
		
		userObj.setAnrede(anrede);
		userObj.setVorname(vorname);
		userObj.setNachname(nachname);
		userObj.setUsername(benutzername);
		userObj.setEmail(email);

		
		boolean temp = userObj.register();
		
		
		RequestDispatcher disp = 
				   getServletContext().
				   getRequestDispatcher("/registration.jsp");
		   disp.forward(request, response);
		
		
		/*if(Temp == false){
			RequestDispatcher disp = 
					   getServletContext().
					   getRequestDispatcher("/registration.jsp");
			   disp.forward(request, response);
		}else{
			RequestDispatcher disp = 
					   getServletContext().
					   getRequestDispatcher("/index.jsp");
			   disp.forward(request, response);
		}*/
	}
	
	
	
	if( form_index != null){
	   
		//Objecte definieren
	   Object strAutofirma = request.getParameter("Marke");
	   Object strLeistung = request.getParameter("Leistung");
	   Object datErstzul = request.getParameter("Erstzulassung");
	   Object strPreis = request.getParameter("Preis");
	   Object strKraftstoff = request.getParameter("Kraftstoff");
	   Object strKilometerstand = request.getParameter("Kilometerstand");
	   
	   //HttpSessions erzeugen
	   
	   //Parameter für Marke
	   StringBuffer mar = new StringBuffer((String) strAutofirma);
	   String ausgabe_Marke = mar.toString();   
	   //session handle für Marke
	   HttpSession Marke = request.getSession();
	   Marke.setAttribute("Marke", ausgabe_Marke);
	   	  	   
	   //Parameter für Leistung
	   StringBuffer lei = new StringBuffer((String) strLeistung);
	   String ausgabe_Leistung = lei.toString();
	   //session handle für Leistung
	   HttpSession Leistung = request.getSession();
	   Leistung.setAttribute("Leistung", ausgabe_Leistung);
	   
	   //Parameter für Erstzulassung
	   StringBuffer ers = new StringBuffer((String) datErstzul);
	   String ausgabe_Erstzulassung= ers.toString();
	   //session handle für Erstzulassung
	   HttpSession Erstzulassung = request.getSession();
	   Erstzulassung.setAttribute("Erstzulassung", ausgabe_Erstzulassung);
	   
	 //Parameter für Preis
	   StringBuffer pre = new StringBuffer((String) strPreis);
	   String ausgabe_Preis = pre.toString();
	   //session handle für Preis
	   HttpSession Preis = request.getSession();
	   Preis.setAttribute("Preis", ausgabe_Preis);
	   
	   //Parameter für Kraftstoff
	   StringBuffer kra = new StringBuffer((String) strKraftstoff);
	   String ausgabe_Kraftstoff = kra.toString();
	   //session handle für Kraftstoff
	   HttpSession Kraftstoff = request.getSession();
	   Kraftstoff.setAttribute("Kraftstoff", ausgabe_Kraftstoff);
	   
	   //Parameter für Kilometerstand
	   StringBuffer kil = new StringBuffer((String) strKilometerstand);
	   String ausgabe_Kilometerstand = kil.toString();
	   //session handle für Kraftstoff
	   HttpSession Kilometerstand = request.getSession();
	   Kilometerstand.setAttribute("Kilometerstand", ausgabe_Kilometerstand);
	   
	   
	   
	   //Ende des HttpSessions erzeugens
	   
	   //JSP-Aufruf
	   RequestDispatcher disp = 
			   getServletContext().
			   getRequestDispatcher("/erg_car_search.jsp");
	   disp.forward(request, response);
	}
	
	
	if( form_edit_user_profil != null){
		
	}
	
	if( form_login != null){
		
	}
	
	
	
	   }  
}

