package ressourcePackage;

public class User {
//Variablen
private String strVorname; //Vorname des Users
private String strNachname;// Nachname des Users
private int intID; //ID des Users (autoFeld der DB)
private String strEmail; // Emailadresse des Users


//private Methoden
private int loadID()/*lädt ID aus DB nach*/{
	return 0; // hier Ergebnis der DBAbfrage einfügen	
}


//Setter / Getter Methoden
public String getStrVorname() {
	return strVorname;
}
public void setStrVorname(String strVorname) {
	this.strVorname = strVorname;
}
public String getStrNachname() {
	return strNachname;
}
public void setStrNachname(String strNachname) {
	this.strNachname = strNachname;
}
public int getIntID() {
	return intID;
}
public String getStrEmail() {
	return strEmail;
}
public void setStrEmail(String strEmail) {
	this.strEmail = strEmail;
}


//öffentliche Methoden
public void addUser()/*fügt neuen User der DB hinzu*/{
	//User hinzufügen
	intID = loadID();
}

public void updateUser/*Sucht DBEintrag nach ID und updatet alle anderen Felder*/(){

}

}
