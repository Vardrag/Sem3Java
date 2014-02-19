package ressourcePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//
public class Car implements ICar{
//Variablen
public int intKilometerstand; //Kilometerstand des Autos
public String strAutofirma; //Marke des Autos
private String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
public String strSQLarg;
public Date datErstzul; //Erstzulassung
public String strKrSt; //Kraftstoff
public int intKmStand; //Kilometerstand
public String strLeistung; //Motorleistung
public Double dblPreis; //Angebotspreis
public String strUser;
public String strOrt;

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

