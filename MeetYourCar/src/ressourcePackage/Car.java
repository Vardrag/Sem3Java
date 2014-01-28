package ressourcePackage;

public class Car {
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

public String getAutofirma() /*Ausgabe Herrsteller des Autos*/{
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

public void addCar()/*Objekt zu der Tabelle "Angebot" hinzufügen; gibt SQL-String weiter*/{
	strSQLarg = "Insert into Angebot VALUES Angebot.Farbe ="  + strFarbe + ", Angebot.Herrsteller = ";
}

public void removeCar()/*Objekt aus der Tabelle entfernen; gibt SQL-String weiter*/{
	
}
public void editCar()/*bestehendes Objekt wird verändert; gibt SQL-String weiter*/{

}

}
