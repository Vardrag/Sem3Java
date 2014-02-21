package ressourcePackage;
import db_connection.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.hsqldb.result.Result;

public class User {
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
private DB_Zugriff dbc;
private String sqlArg;
private ResultSet rstTemp;



//private Methoden
private int loadID()/*laedt ID aus DB nach*/{
	return 0; // hier Ergebnis der DBAbfrage einfuegen	
}


//Setter / Getter Methoden

public String getUsername() {
	return strUsername;
}

public void setUsername(String strUsername) {
	this.strUsername = strUsername;
}

public String getPasswort() {
	return strPasswort;
}

public void setPasswort(String strPasswort) {
	this.strPasswort = strPasswort;
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
	
public boolean update/*Sucht DBEintrag nach ID und updatet alle anderen Felder*/(String strCheckPW){
StringBuilder sb = new StringBuilder();
if (strCheckPW == strPasswort){
sb.append("UPDATE Kunden SET ");
sb.append("Anrede = '"+strAnrede +"', "); //Anrede Value
sb.append("Name = '"+strNachname +"', "); //Name Value
sb.append("Vorname = '"+strVorname +"', "); //Vorname Value
sb.append("Strasse = '"+strStrasse +"', "); //Strasse Value
sb.append("PLZ = '"+strPLZ +"', "); //PLZ Value
sb.append("Ort = '"+strStandortCar +"', "); //Ort Value
sb.append("Email = '"+strEmail +"', "); //Email Value
sb.append("Telefon = '"+strTelefon +"', "); //Telefon Value
sb.append("Passwort = '"+strPasswort +"', "); //Passwort Value
sb.append("Geburtstag = '"+datGeb +"') "); //Geburtstag Value
sb.append("WHERE KID = " + intID + ";");
dbc.runSQL(sb.toString());
return true;
}
else
	return false;
}

public boolean login(){
    sqlArg = "Select * FROM Kunden WHERE Benutzername = '" + strUsername + "', AND Passwort ='"+strPasswort+"';";    
	try { // Wenn ResultSet leer, d.h. Kombination Username und Passwort nicht in DB, springt zum Catch-Block
		rstTemp = dbc.runSQL(sqlArg); //User Abfrage
		rstTemp.first();
    	intID = rstTemp.getInt("KID");
		strAnrede = rstTemp.getString("Anrede");
		strVorname = rstTemp.getString("Vorname");
		strNachname = rstTemp.getString("Name");
		strEmail = rstTemp.getString("Email");
		datGeb = rstTemp.getDate("Geburtstag");
		strTelefon = rstTemp.getString("Telefon");
		strStandortCar = rstTemp.getString("Ort");
		strPLZ = rstTemp.getString("PLZ");
		strStrasse = rstTemp.getString("Strasse");
	    return true;
		}
	catch (SQLException elogin)
	{
		return false;
	}
}
												//Ausfuellen des Objekts Feldnamen anpassen


public boolean register(){
	StringBuilder sb = new StringBuilder();
	sb.append ("INSERT INTO Kunden (Anrede, Name, Vorname, Strasse, PLZ, Ort, Email, Telefon, Benutzername, Passwort, Geburtstag) VALUES (");
	sb.append("'"+strAnrede +"', "); //Anrede Value
	sb.append("'"+strNachname +"', "); //Name Value
	sb.append("'"+strVorname +"', "); //Vorname Value
	sb.append("'"+strStrasse +"', "); //Strasse Value
	sb.append("'"+strPLZ +"', "); //PLZ Value
	sb.append("'"+strStandortCar +"', "); //Ort Value
	sb.append("'"+strEmail +"', "); //Email Value
	sb.append("'"+strTelefon +"', "); //Telefon Value
	sb.append("'"+strUsername +"', "); //Benutzername Value
	sb.append("'"+strPasswort +"', "); //Passwort Value
	sb.append("'"+datGeb +"'); "); //Geburtstag Value

	try{ //Datenbank springt bei bestehendem Username zum Catch-Block
	rstTemp = dbc.runSQL(sb.toString());
    rstTemp.first();  
    return true;
	} 
	catch (SQLException eregister){
	return false;	
	}
	
}

}




