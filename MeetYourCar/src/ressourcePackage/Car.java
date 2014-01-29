package ressourcePackage;

import java.util.Currency;

public class Car {
private int intKilometerstand; //Kilometerstand des Autos
private String strAutofirma; //Marke des Autos
private String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
private String strSQLarg;
private int datErstzul; //Erstzulassung
private String strKrSt; //Kraftstoff
private int intKmStand; //Kilometerstand
private String strLeistung; //Motorleistung
private Currency crcPreis; //Angebotspreis
private String strSonst; //Sonstiges; vorübergehend

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

public int getDatErstzul() {
	return datErstzul;
}

public void setDatErstzul(int datErstzul) {
	this.datErstzul = datErstzul;
}

public String getStrKrSt() {
	return strKrSt;
}

public void setStrKrSt(String strKrSt) {
	this.strKrSt = strKrSt;
}

public int getIntKmStand() {
	return intKmStand;
}

public void setIntKmStand(int intKmStand) {
	this.intKmStand = intKmStand;
}

public String getStrLeistung() {
	return strLeistung;
}

public void setStrLeistung(String strLeistung) {
	this.strLeistung = strLeistung;
}

public Currency getCrcPreis() {
	return crcPreis;
}

public void setCrcPreis(Currency crcPreis) {
	this.crcPreis = crcPreis;
}

public String getStrSonst() {
	return strSonst;
}

public void setStrSonst(String strSonst) {
	this.strSonst = strSonst;
}

public void addCar()/*Objekt zu der Tabelle "Angebot" hinzufügen; gibt SQL-String weiter*/{
	strSQLarg = "Insert into Angebot VALUES Angebot.Farbe ="  + strFarbe + ", Angebot.Herrsteller = ";
}

public void removeCar()/*Objekt aus der Tabelle entfernen; gibt SQL-String weiter*/{
	
}
public void editCar()/*bestehendes Objekt wird verändert; gibt SQL-String weiter*/{

}

}
