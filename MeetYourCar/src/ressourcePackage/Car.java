package ressourcePackage;

import java.util.Date;


//
public class Car implements IObjekt{
//Variablen
public int intID;
public String strAutofirma; //Marke des Autos
public String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
public String sqlArg;
public Date datErstzul; //Erstzulassung
public String strKrSt; //Kraftstoff
public int intKmStand; //Kilometerstand
public String strLeistung; //Motorleistung
public Double dblPreis; //Angebotspreis
public String strUser;
public String strOrt;

//private Methoden


//�ffentliche Methoden
public String add()/*Objekt zu der Tabelle "Angebot" hinzuf�gen; gibt SQL-String weiter*/{
return sqlArg;
}

public String delete()/*Objekt aus der Tabelle entfernen; gibt SQL-String weiter*/{
	sqlArg = "Delete from tbl_Fahrzeuge where F_ID = " + intID;
	return sqlArg;
}
public String update()/*bestehendes Objekt wird ver�ndert; gibt SQL-String weiter*/{
	return sqlArg;

}
public String find(){
	return sqlArg;
}
}

