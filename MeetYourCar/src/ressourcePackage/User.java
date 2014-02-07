package ressourcePackage;
import db_connection.*;
import java.sql.Date;

public class User {
//Variablen
private int intID; //ID des Users (autoFeld der DB)
private String strUsername; // Benutzername des Users
private String strVorname; //Vorname des Users
private String strNachname;// Nachname des Users
private String strEmail; // Emailadresse des Users
private String strPasswort; // Passwort des Users

//ab hier Zusatz (keine Pflichtfelder - edit profiloptions)
private Date datGeb; // Alter des Users
private String strTelefon; // TelefonNr des Users
private String strStandortCar; //allgemeiner Standort (Wohnort des Users)




//private Methoden
private int loadID()/*lädt ID aus DB nach*/{
	return 0; // hier Ergebnis der DBAbfrage einfügen	
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


//öffentliche Methoden
public void addUser()/*fügt neuen User der DB hinzu*/{
	DB_connection dbc = new DB_connection() //User hinzufügen
	intID = loadID();
	
}

public void updateUser/*Sucht DBEintrag nach ID und updatet alle anderen Felder*/(){

}

}
