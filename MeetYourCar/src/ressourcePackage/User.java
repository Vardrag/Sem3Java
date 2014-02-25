package ressourcePackage;
import db_connection.*;

import java.security.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


public class User implements IObjekt {
//Variablen
private int intID; //ID des Users (autoFeld der DB)
private String strUsername; // Benutzername des Users
private String strAnrede;
private String strVorname; //Vorname des Users
private String strNachname;// Nachname des Users
private String strEmail; // Emailadresse des Users
private String strPasswort; // Passwort des Users

//ab hier Zusatz (keine Pflichtfelder - edit profiloptions)
private Date datGeb; // Alter des Users
private String strTelefon; // TelefonNr des Users
private String strStandortCar; //allgemeiner Standort (Wohnort des Users)
private String strPLZ;
private String strStrasse;
private DB_connection dbc;
private String sqlArg;
private ResultSet rstTemp;



//private Methoden



//Setter / Getter Methoden

public String getStrasse() {
	return strStrasse;
}

public void setStrasse(String strStrasse) {
	this.strStrasse = strStrasse;
}

public String getAnrede() {
	return strAnrede;
}

public void setAnrede(String strAnrede) {
	this.strAnrede = strAnrede;
}
public String getUsername() {
	return strUsername;
}

public void setUsername(String strUsername) {
	this.strUsername = strUsername;
}

public void setPasswort(String strPasswort) {

	MessageDigest md;
	try {
		md = MessageDigest.getInstance( "SHA" );
		md.update( strPasswort.getBytes() );
		this.strPasswort = md.digest().toString();
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}

public String getUserOrt() {
	return strStandortCar;
}

public void setUserOrt(String strStandortCar) {
	this.strStandortCar = strStandortCar;
}

public String getTelefon() {
	return strTelefon;
}

public void setTelefon(String strTelefon) {
	this.strTelefon = strTelefon;
}

public String getVorname() {
	return strVorname;
}

public void setVorname(String strVorname) {
	this.strVorname = strVorname;
}

public Date getGeburtstag() {
	return datGeb;
}

public void setGeburtstag(Date datGeb) {
	this.datGeb = datGeb;
}

public String getNachname() {
	return strNachname;
}

public void setNachname(String strNachname) {
	this.strNachname = strNachname;
}

public int getID() {
	return intID;
}

public String getEmail() {
	return strEmail;
}

public void setEmail(String strEmail) {
	this.strEmail = strEmail;
}


//oeffentliche Methoden
	
public boolean update()/*Sucht DBEintrag nach ID und updatet alle anderen Felder ausser Username*/{
StringBuilder sb = new StringBuilder();
sb.append("-->>>TEST<<<-- ; UPDATE tbl_Kunden SET ");
sb.append("K_Anrede = '"+strAnrede +"', "); //Anrede Value
sb.append("K_Name = '"+strNachname +"', "); //Name Value
sb.append("K_Vorname = '"+strVorname +"', "); //Vorname Value
sb.append("K_Strasse = '"+strStrasse +"', "); //Strasse Value
sb.append("K_PLZ = '"+strPLZ +"', "); //PLZ Value
sb.append("K_Ort = '"+strStandortCar +"', "); //Ort Value
sb.append("K_Email = '"+strEmail +"', "); //Email Value
sb.append("K_Telefon = '"+strTelefon +"', "); //Telefon Value
sb.append("K_Passwort = '"+strPasswort +"', "); //Passwort Value
sb.append("K_Geburtstag = '"+datGeb +"') "); //Geburtstag Value
sb.append("WHERE K_ID = " + intID + ";");

try {
		dbc.update(sb.toString());
		rstTemp = dbc.rs;
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}


public boolean login(){
    sqlArg = "-->>>TEST<<<-- ; Select * FROM tbl_Kunden WHERE K_Benutzername = '" + strUsername + "', AND K_Passwort ='"+strPasswort+"';";    
	try { // Wenn ResultSet leer, d.h. Kombination Username und Passwort nicht in DB, springt zum Catch-Block
		dbc.select(sqlArg);
		rstTemp = dbc.rs;
		//User Abfrage
		rstTemp.first();
    	intID = rstTemp.getInt("K_ID");
		strAnrede = rstTemp.getString("K_Anrede");
		strVorname = rstTemp.getString("K_Vorname");
		strNachname = rstTemp.getString("K_Name");
		strEmail = rstTemp.getString("K_Email");
		datGeb = rstTemp.getDate("K_Geburtstag");
		strTelefon = rstTemp.getString("K_Telefon");
		strStandortCar = rstTemp.getString("K_Ort");
		strPLZ = rstTemp.getString("K_PLZ");
		strStrasse = rstTemp.getString("K_Strasse");
	    return true;
		}
	catch (SQLException elogin)
	{
		return false;
	}
}
		


public boolean add(){
	 //Datenbank springt bei bestehendem Username zum Catch-Block
		StringBuilder sb = new StringBuilder();
		sb.append ("-->>>TEST<<<-- ; INSERT INTO PUBLIC.tbl_KUNDEN (K_ANREDE, K_NAME, K_VORNAME, K_EMAIL, K_BENUTZERNAME, K_PASSWORT) VALUES (");
		sb.append("'"+strAnrede +"', "); //Anrede Value
		sb.append("'"+strNachname +"', "); //Name Value
		sb.append("'"+strVorname +"', "); //Vorname Value
		sb.append("'"+strEmail +"', "); //Email Value
		sb.append("'"+strUsername +"', "); //Benutzername Value
		sb.append("'"+strPasswort +"' )" ); //Passwort Value
		try { //Wenn erfolgreich, dann true zur�ckgeben
			dbc.update(sb.toString());
			rstTemp = dbc.rs;
		    return true;
		} catch (SQLException e) { //Wenn Fehler, dann false zur�ckgeben
			return false;
		}

	} 
	
public boolean delete(){
	return false; 
}
public boolean find(){
	return false;
}
}





