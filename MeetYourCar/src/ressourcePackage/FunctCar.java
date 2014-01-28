package ressourcePackage;


public class FunctCar /* Stellt Funktionen für die Arbeit mit Objekten der Klasse "ClsCar" bereit*/ {

	public Car[] searchCars(Car referenzCar)/*Sucht Eine Liste von Autos, muss für Liste gemacht werden (Collection??)*/{
		 //sollte Collection/Array werden
		//Hier SqlString aus referenzCar generieren
		//Hier SqlString an DBKlasse weitergeben
		Car resultCar[] = null;
		for (int i = 0; i < 10; i++) { //Füllen durch Ergebnis der Abfrage
			resultCar[i] = new Car(/*Hier werden die Daten aus der DBAbfrage eingefügt*/);
		}
		return resultCar;	//Conection zurückgeben, um angezeigt zu werden	
	}
	
}
