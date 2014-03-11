package frontendPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.jasper.tagplugins.jstl.core.Out;

import myServlets.DbConn;

import java.net.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

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
   String url = "jdbc:hsqldb:file:~/MeetYourCar/HSQLDB/hsqldb-2.3.1/hsqldb/hsqldb;create=true";
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
	   conn.dml("CREATE TABLE TBL_KUNDEN(K_ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 0) NOT NULL PRIMARY KEY,K_ANREDE VARCHAR(20),K_NAME VARCHAR(50),K_VORNAME VARCHAR(50),K_STRASSE VARCHAR(50),K_PLZ VARCHAR(50),K_ORT VARCHAR(50),K_EMAIL VARCHAR(50),K_TELEFON VARCHAR(50),K_BENUTZERNAME VARCHAR(50),K_PASSWORT VARCHAR(250),K_GEBURTSTAG VARCHAR(50),UNIQUE(K_BENUTZERNAME))");
	   conn.dml("ALTER TABLE TBL_KUNDEN ALTER COLUMN K_ID RESTART WITH 2");
	   conn.dml("CREATE TABLE TBL_FAHRZEUGE(F_ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 0) NOT NULL PRIMARY KEY,F_TYP VARCHAR(20),F_MARKE VARCHAR(50),F_ERSTZULASSUNG DATE,F_KILOMETER INTEGER,F_LEISTUNG VARCHAR(50),F_PREIS DOUBLE,F_KRAFTSTOFFART VARCHAR(50),F_FARBE VARCHAR(50),F_AUSSTATTUNG VARCHAR(50),F_BILDLINK VARCHAR(50),F_KID INTEGER)");
	   conn.dml("ALTER TABLE TBL_FAHRZEUGE ALTER COLUMN F_ID RESTART WITH 0");
	   conn.dml("Insert into TBL_FAhrzeuge (F_Marke) Value ('test erfolgreich'");
	ResultSet rs = conn.select("SELECT * FROM   INFORMATION_SCHEMA.TABLES");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   /*
   try {
	    conn.dml("Insert into tbl_FAhrzeuge (F_Marke) Values ('BMW')");
	       conn.dml("Insert into tbl_FAhrzeuge (F_Marke) Values ('BMW')");
	       conn.dml("Insert into tbl_FAhrzeuge (F_Marke) Values ('BMW')");
	       conn.dml("Insert into tbl_FAhrzeuge (F_Marke) Values ('Audi')");
	       conn.dml("Insert into tbl_FAhrzeuge (F_Marke) Values ('Audi')");
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}*/
   testdaten();
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
			//Benutzer konnte erfolgreich hinzugef�gt werden
			 RequestDispatcher disp = 
					   getServletContext().
					   getRequestDispatcher("/index.jsp");
			   disp.forward(request, response);
		} catch (SQLException e) {
			//Fehler, dass Benutzername bereits vorhanden ist
				RequestDispatcher disp = 
						   getServletContext().
						   getRequestDispatcher("/index.jsp");
				   disp.forward(request, response);		
		}
	}
	
	
	
	if( form_index != null){
	   
		//Objecte definieren
	   carObj.strAutofirma = request.getParameter("Marke");
	   carObj.strLeistung = request.getParameter("Leistung");  
	   carObj.strErstzul = request.getParameter("Erstzulassung");
	   carObj.dblPreis = Double.parseDouble(request.getParameter("Preis"));
	   carObj.strKraftstoff = request.getParameter("Kraftstoff");
	   carObj.intKmStand = Integer.parseInt(request.getParameter("Kilometerstand"));
	   
	   String sql = carObj.find();
	   try {
		ResultSet rs = conn.select(sql);
		while(rs.next()){
			System.out.println(rs.getString("f_Marke"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   //HttpSessions erzeugen
	   
	   //Parameter f�r Marke
	   StringBuffer mar = new StringBuffer((String) carObj.strAutofirma);
	   String ausgabe_Marke = mar.toString();   
	   //session handle f�r Marke
	   HttpSession Marke = request.getSession();
	   Marke.setAttribute("Marke", ausgabe_Marke);
	   	  	   
	   //Parameter f�r Leistung
	   StringBuffer lei = new StringBuffer((String) carObj.strLeistung);
	   String ausgabe_Leistung = lei.toString();
	   //session handle f�r Leistung
	   HttpSession Leistung = request.getSession();
	   Leistung.setAttribute("Leistung", ausgabe_Leistung);
	   
	   //Parameter f�r Erstzulassung
	   StringBuffer ers = new StringBuffer((String) carObj.strErstzul);
	   String ausgabe_Erstzulassung= ers.toString();
	   //session handle f�r Erstzulassung
	   HttpSession Erstzulassung = request.getSession();
	   Erstzulassung.setAttribute("Erstzulassung", ausgabe_Erstzulassung);
	   
	   //Parameter f�r Preis
	   StringBuffer pre = new StringBuffer((Double.toString (carObj.dblPreis)));
	   String ausgabe_Preis = pre.toString();
	   //session handle f�r Preis
	   HttpSession Preis = request.getSession();
	   Preis.setAttribute("Preis", ausgabe_Preis);
	   
	   //Parameter f�r Kraftstoff
	   StringBuffer kra = new StringBuffer((String) carObj.strKraftstoff);
	   String ausgabe_Kraftstoff = kra.toString();
	   //session handle f�r Kraftstoff
	   HttpSession Kraftstoff = request.getSession();
	   Kraftstoff.setAttribute("Kraftstoff", ausgabe_Kraftstoff);
	   
	   //Parameter f�r Kilometerstand
	   StringBuffer kil = new StringBuffer((Integer.toString (carObj.intKmStand)));
	   String ausgabe_Kilometerstand = kil.toString();
	   //session handle f�r Kraftstoff
	   HttpSession Kilometerstand = request.getSession();
	   Kilometerstand.setAttribute("Kilometerstand", ausgabe_Kilometerstand);
	   
	   //carObj.intKmStand = strKilometerstand;
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

private void testdaten(){
    try {
         conn.dml("Insert into tbl_FAhrzeuge (F_Marke, F_Leistung. F_Preis, F_Krafstoffart, F_erstzulassung, F_Kilometer) Values ('BMW', '100 PS', '8000', 'Diesel', '2006', '20000')");
         conn.dml("Insert into tbl_FAhrzeuge (F_Marke, F_Leistung. F_Preis, F_Krafstoffart, F_erstzulassung, F_Kilometer) Values ('BMW', '100 PS', '8000', 'Diesel', '2006', '20000')");
         conn.dml("Insert into tbl_FAhrzeuge (F_Marke, F_Leistung. F_Preis, F_Krafstoffart, F_erstzulassung, F_Kilometer) Values ('BMW', '100 PS', '8000', 'Diesel', '2006', '20000')");
         conn.dml("Insert into tbl_FAhrzeuge (F_Marke, F_Leistung. F_Preis, F_Krafstoffart, F_erstzulassung, F_Kilometer) Values ('BMW', '100 PS', '8000', 'Diesel', '2006', '20000')");
     } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
 
}


}




