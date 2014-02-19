package ressourcePackage;
import db_connection.*;

import java.sql.Date;
import java.sql.ResultSet;

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
public void addUser()/*fuegt neuen User der DB hinzu*/{
    sqlArg = "Select ";
	dbc.runSQL(sqlArg); //User hinzufuegen
	intID = loadID();
	
}

public void updateUser/*Sucht DBEintrag nach ID und updatet alle anderen Felder*/(){

}

public boolean login(){
    sqlArg = "Select * FROM Kunden WHERE Benutzername = '" + strUsername + "', AND Passwort ='"+strPasswort+"';"; 
    rstTemp = dbc.runSQL(sqlArg); //User Abfrage
	boolean boolTemp = rstTemp.last();
	if (boolTemp = false){ 
		return false;
	}
	else{													//Ausfuellen des Objekts Feldnamen anpassen
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
	
}

public boolean register(){
	sqlArg = "INSERT INTO Kunden (Anrede, Name, Vorname) VALUES (";
	return false;
	
}

public void ChangeUserData(){
	
}

}




