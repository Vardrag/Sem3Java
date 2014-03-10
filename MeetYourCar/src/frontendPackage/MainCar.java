package frontendPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import myServlets.DbConn;

import java.net.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import ressourcePackage.Car;
import ressourcePackage.User;
import myServlets.DbConn;

public class MainCar extends HttpServlet
{
   static final long serialVersionUID = 1L;
   
   Car carObj = new Car(); //Car obj
   User userObj = new User(); // User obj
   DbConn conn; 

 //Abfrage per Post
@Override
/**
 * Initialisieren der Datenbank-Verbindung mit Parametern aus
 * dem Web Deployment Descriptor WEB-INF/web.xml
 */
public void init(javax.servlet.ServletConfig config)
       throws ServletException {

   // �berschriebene init()-Methode der Superklasse aufrufen !
   super.init(config);

   // Parameter aus der Datein WEB-INF/web.xml auslesen
   String driver = "org.hsqldb.jdbcDriver";
   String url = "jdbc:hsqldb:file:../webapps/MeetYourCar/HSQLDB/hsqldb-2.3.1/hsqldb;create=true";
   String user = "root";
   String pw = "root";

   // Initialisieren der Datenbank-Verbindung 
   // mit der Klasse DbConn
   try {

	 conn = new DbConn(driver, url, user, pw);
	
   } catch (Exception e) {
       throw new ServletException("SQL-Exception in init()", e);
   }
   try {
	ResultSet rs = conn.select("SELECT * FROM   INFORMATION_SCHEMA.TABLES");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
} 

@Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	          throws ServletException, IOException {	
	   
	String form_registration = request.getParameter("auswertung_registration"); 
	String form_index = request.getParameter("auswertung_login");
	String form_edit_user_profil = "";
	String form_login = "";
	String form_create_car = request.getParameter("auswertung_registration");
	
	
	
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
		userObj.setPasswort(passwort);

		
		String sql  = userObj.add();
		
		try {
			conn.dml(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	if(vorname != null){
		RequestDispatcher disp = 
				   getServletContext().
				   getRequestDispatcher("/index.jsp");
		   disp.forward(request, response);
		   System.out.println(vorname); 
		}else{
			RequestDispatcher disp = 
					   getServletContext().
					   getRequestDispatcher("/Login.jsp");
			   disp.forward(request, response);
		}
		*/
		/*if(temp == false){
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
	   
	   //Parameter f�r Marke
	   StringBuffer mar = new StringBuffer((String) strAutofirma);
	   String ausgabe_Marke = mar.toString();   
	   //session handle f�r Marke
	   HttpSession Marke = request.getSession();
	   Marke.setAttribute("Marke", ausgabe_Marke);
	   	  	   
	   //Parameter f�r Leistung
	   StringBuffer lei = new StringBuffer((String) strLeistung);
	   String ausgabe_Leistung = lei.toString();
	   //session handle f�r Leistung
	   HttpSession Leistung = request.getSession();
	   Leistung.setAttribute("Leistung", ausgabe_Leistung);
	   
	   //Parameter f�r Erstzulassung
	   StringBuffer ers = new StringBuffer((String) datErstzul);
	   String ausgabe_Erstzulassung= ers.toString();
	   //session handle f�r Erstzulassung
	   HttpSession Erstzulassung = request.getSession();
	   Erstzulassung.setAttribute("Erstzulassung", ausgabe_Erstzulassung);
	   
	 //Parameter f�r Preis
	   StringBuffer pre = new StringBuffer((String) strPreis);
	   String ausgabe_Preis = pre.toString();
	   //session handle f�r Preis
	   HttpSession Preis = request.getSession();
	   Preis.setAttribute("Preis", ausgabe_Preis);
	   
	   //Parameter f�r Kraftstoff
	   StringBuffer kra = new StringBuffer((String) strKraftstoff);
	   String ausgabe_Kraftstoff = kra.toString();
	   //session handle f�r Kraftstoff
	   HttpSession Kraftstoff = request.getSession();
	   Kraftstoff.setAttribute("Kraftstoff", ausgabe_Kraftstoff);
	   
	   //Parameter f�r Kilometerstand
	   StringBuffer kil = new StringBuffer((String) strKilometerstand);
	   String ausgabe_Kilometerstand = kil.toString();
	   //session handle f�r Kraftstoff
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
@Override
public void destroy() {
    try {
      //Freigeben von Datenbank-Ressourcen
      conn.closeDb();
    } 
	catch (SQLException e) {
      log("SQL-Exception in destroy()", e);
    }
  }   
}

