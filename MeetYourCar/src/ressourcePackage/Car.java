package ressourcePackage;

import java.util.Currency;

public class Car {
//Variablen
public int intKilometerstand; //Kilometerstand des Autos
public String strAutofirma; //Marke des Autos
private String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
public String strSQLarg;
public int datErstzul; //Erstzulassung
public String strKrSt; //Kraftstoff
public int intKmStand; //Kilometerstand
public String strLeistung; //Motorleistung
public Currency crcPreis; //Angebotspreis
public String strSonst; //Sonstiges; vor�bergehend


//private Methoden


//�ffentliche Methoden
public void addCar()/*Objekt zu der Tabelle "Angebot" hinzuf�gen; gibt SQL-String weiter*/{
	strSQLarg = "Insert into Angebot VALUES Angebot.Farbe ="  + strFarbe + ", Angebot.Herrsteller = ";
}

public void removeCar()/*Objekt aus der Tabelle entfernen; gibt SQL-String weiter*/{
	
}
public void editCar()/*bestehendes Objekt wird ver�ndert; gibt SQL-String weiter*/{

}

}
