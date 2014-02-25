package ressourcePackage;

import java.util.Date;


//
public class Car implements IObjekt{
//Variablen
public int intKilometerstand; //Kilometerstand des Autos
public String strAutofirma; //Marke des Autos
public String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
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
public boolean add()/*Objekt zu der Tabelle "Angebot" hinzuf�gen; gibt SQL-String weiter*/{
StringBuilder sb = new StringBuilder();
sb.append("Insert into tbl_Fahrzeuge (");
return false;
}

public boolean delete()/*Objekt aus der Tabelle entfernen; gibt SQL-String weiter*/{
	return false;
}
public boolean update()/*bestehendes Objekt wird ver�ndert; gibt SQL-String weiter*/{
	return false;

}
public boolean find(){
	return false;
}
}

