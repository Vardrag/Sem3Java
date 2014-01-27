package calc_package;

public class ClsCar {
private int intKilometerstand; //Kilometerstand des Autos
private String strAutofirma; //Herstellerfirma des Autos
private String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
private String strSQLarg;

public void setFarbe(String eingFarbe){
	strFarbe = eingFarbe;
}

public String getFarbe()/*Ausgabe Lackfarbe des Autos*/ {
	return strFarbe;
}

public String getAutofirma() {
	return strAutofirma;
}

public void setAutofirma(String strAutofirma) {
	this.strAutofirma = strAutofirma;
}

public int getKilometerstand() {
	return intKilometerstand;
}

public void setKilometerstand(int intKilometerstand) {
	this.intKilometerstand = intKilometerstand;
}

public String addCar()/*Objekt zu der Tabelle "Angebot" hinzufügen; gibt SQL-String weiter*/{
	strSQLarg = "Insert into Angebot VALUES Angebot.Farbe ="  + strFarbe + ", Angebot.Herrsteller = ";
	return strSQLarg;
}




}
