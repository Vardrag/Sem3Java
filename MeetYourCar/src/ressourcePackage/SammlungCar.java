package ressourcePackage;


public class  SammlungCar implements ICar {

	
	
	public Car[] searchCars (Car referenzCar)/*Sucht eine Gruppe von Autos*/{

		StringBuilder strB = new StringBuilder();
		
		//Beginn SQL-String bauen
		strB.append("Select * from Tabelle WHERE Tabelle.Feld1 = Variable1");
		for (int i = 2; i < 10; i++) {
			strB.append(" AND Tabelle.Feld"+i+" = Variable"+i);
		}		
		// Ende SQL-String bauen
		referenzCar.strSQLarg = strB.toString();
	
		//DB-Abfrage einfügen Eingabe referenzCar.strSQLarg Ausgabe ...
		
		Car resultCar[] = dbToCar(/*DB-Rückgabe*/);
		
		return resultCar; //gibt Car-Array zur Ausgabe zurück
	}
	
	private Car[] dbToCar(){ //Konvertiert die DB-Rückgabe in ein Car-Array zur Weiterbearbeitung
		
		return null;
	}
}
