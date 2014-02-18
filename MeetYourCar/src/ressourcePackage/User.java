package ressourcePackage;
import db_connection.*;

import java.sql.Date;
import java.sql.ResultSet;

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
private DB_connection dbc;
private String sqlArg;
private ResultSet rstTemp;


//private Methoden
private int loadID()/*l�dt ID aus DB nach*/{
	return 0; // hier Ergebnis der DBAbfrage einf�gen	
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


//�ffentliche Methoden
public void addUser()/*f�gt neuen User der DB hinzu*/{
    sqlArg = "Select ";
	dbc.main(sqlArg); //User hinzufuegen
	intID = loadID();
	
}

public void updateUser/*Sucht DBEintrag nach ID und updatet alle anderen Felder*/(){

}

public boolean login(){
    sqlArg = "Select * WHERE Benutzername = '" + strUsername + "', AND Passwort ='"+strPasswort+"';"; 
	rstTemp = dbc.main(sqlArg); //User Abfrage
	boolean boolTemp = rstTemp.last();
	if (boolTemp = false){ 
		return false;
	}
	else{													//Ausfuellen des Objekts Feldnamen anpassen
		intID = rstTemp.getInt("User_ID");
		strAnrede = rstTemp.getString("User_Anrede");
		strVorname = rstTemp.getString("User_Vorname");
		strNachname = rstTemp.getString("User_Nachname");
		strEmail = rstTemp.getString("User_Email");
		datGeb = rstTemp.getDate("User_Geburtstag");
		strTelefon = rstTemp.getString("User_Telefon");
		strStandortCar = rstTemp.getString("User_Wohnort");
		strPLZ = rstTemp.getString("User_PLZ");
		strStrasse = rstTemp.getString("User_Strasse");
		return true;
	}
	
}

public boolean register(){
	return false;
	
}

public void ChangeUserData(){
	
}

}




