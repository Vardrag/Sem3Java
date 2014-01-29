package ressourcePackage;


public class FunctCar /* Stellt Funktionen f�r die Arbeit mit Objekten der Klasse "ClsCar" bereit*/ {

	public Car[] searchCars(Car referenzCar)/*Sucht eine Gruppe von Autos*/{

		StringBuilder strB = new StringBuilder();
		
		//Beginn SQL-String bauen
		strB.append("Select * from ");
		strB.append("Tabelle"); //Tabellenname Fehlt
		strB.append(" Where ");
		if (referenzCar.strAutofirma != null) //SQL-Bedingung "Marke"
		{
			//Spalte plus Bedingung
			//Variable	
		}
		if (referenzCar.crcPreis != null) //SQL-Bedingung "Preis"
		{
			//Spalte plus Bedingung
			//Variable	
		}		
		if (referenzCar.datErstzul != 0) //SQL-Bedingung "Erstzulassung"
		{
			//Spalte plus Bedingung
			//Variable	
		}		
		
		// Ende SQL-String bauen
		referenzCar.strSQLarg = strB.toString();
	
		//DB-Abfrage einf�gen Eingabe referenzCar.strSQLarg Ausgabe ...
		
		Car resultCar[] = dbToCar(/*DB-R�ckgabe*/);
		
		return resultCar; //gibt Car-Array zur Ausgabe zur�ck
	}
	
	private Car[] dbToCar(){ //Konvertiert die DB-R�ckgabe in ein Car-Arryay zur Weiterbearbeitung
		
		return null;
		
	}
}
