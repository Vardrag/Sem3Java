package ressourcePackage;


public class FunctCar /* Stellt Funktionen f�r die Arbeit mit Objekten der Klasse "ClsCar" bereit*/ {

	public Car[] searchCars(Car referenzCar)/*Sucht Eine Liste von Autos, muss f�r Liste gemacht werden (Collection??)*/{
		 //sollte Collection/Array werden
		//Hier SqlString aus referenzCar generieren
		//Hier SqlString an DBKlasse weitergeben
		Car resultCar[] = null;
		for (int i = 0; i < 10; i++) { //F�llen durch Ergebnis der Abfrage
			resultCar[i] = new Car(/*Hier werden die Daten aus der DBAbfrage eingef�gt*/);
		}
		return resultCar;	//Conection zur�ckgeben, um angezeigt zu werden	
	}
	
}
