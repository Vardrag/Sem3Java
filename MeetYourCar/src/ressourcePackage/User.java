package ressourcePackage;

public class User {
private String strVorname; //Vorname des Users
private String strNachname;// Nachname des Users
private int intID; //ID des Users (autoFeld der DB)
private String strEmail; // Emailadresse des Users
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

public void addUser()/*fügt neuen User der DB hinzu*/{
	
}

public void updateUser/*Sucht DBEintrag nach ID und updatet alle anderen Felder*/(){

}

private void loadID()/*lädt ID aus DB nach*/{
	
}
}
