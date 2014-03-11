package ressourcePackage;



//
public class Car implements IObjekt{
//Variablen
public int intID;
public String strAutofirma; //Marke des Autos
public String strFarbe; //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
public String sqlArg;
public String strErstzul; //Erstzulassung
public int intKmStand; //Kilometerstand
public String strLeistung; //Motorleistung
public Double dblPreis; //Angebotspreis
public String strUser;
public String strOrt;
public int intKID;
public String strKraftstoff;

//private Methoden


//�ffentliche Methoden
public String add(){
	 //Datenbank springt bei bestehendem Username zum Catch-Block
		StringBuilder sb = new StringBuilder();
		sb.append ("INSERT INTO tbl_Fahrzeuge (F_Marke, F_Farbe, F_Erstzulassung, F_Kilometer, F_Leistung, F_Preis,F_KID) VALUES (");
		sb.append("'"+strAutofirma +"'"+", "); //Anrede Value
		sb.append("'"+strFarbe +"'"+", "); //Name Value
		sb.append("'"+strErstzul +"'"+", "); //Vorname Value
		sb.append("'"+intKmStand +"'"+", "); //Email Value
		sb.append("'"+strLeistung +"'"+", "); //Benutzername Value
		sb.append("'"+dblPreis +"'"+" );" ); //Passwort Value
		sb.append("'"+intKID +"'"+" );" ); //Passwort Value
		sqlArg = sb.toString();
		System.out.print(sqlArg);
		 //Wenn erfolgreich, dann true zur�ckgeben
		return sqlArg;
	} 

public String delete()/*Objekt aus der Tabelle entfernen; gibt SQL-String weiter*/{
	sqlArg = "Delete from tbl_Fahrzeuge where F_ID = " + intID;
	return sqlArg;
}
public String update()/*Sucht DBEintrag nach ID und updatet alle anderen Felder ausser Username*/{
StringBuilder sb = new StringBuilder();
sb.append("UPDATE tbl_Fahrzeuge SET ");
sb.append("F_Marke = '"+strAutofirma +"', "); //Anrede Value
sb.append("F_Farbe = '"+strFarbe +"', "); //Name Value
sb.append("F_Erstzulassung = '"+strErstzul +"', "); //Vorname Value
sb.append("F_Kilometer = '"+intKmStand +"', "); //Strasse Value
sb.append("F_Leistung = '"+strLeistung +"', "); //PLZ Value
sb.append("F_Preis = '"+dblPreis +"', "); //Ort Value

sb.append("WHERE F_ID = " + intID + ";");

return sb.toString();
}

public String find(){
	StringBuilder strB = new StringBuilder();
	strB.append("Select * from View_Fahrzeuge WHERE ");
	if (intKmStand > 0){
		strB.append("F_Kilometerstand  < "+intKmStand+" AND");
	}
	if (strAutofirma != ""){
		strB.append("F_Marke  = "+ strAutofirma +" AND");
	}		
	if (strLeistung != ""){
		strB.append("F_Leistung  = "+strLeistung+" AND");
	}		
	if (dblPreis > 0.0){
		strB.append("F_Preis  = "+dblPreis+" AND");
	}		
	if (strErstzul != ""){
		strB.append("F_Erstzulassung  = "+strErstzul+" AND");
	}
	strB.setLength(strB.length()-3);
	return sqlArg;
}
}
