package ressourcePackage;

import java.sql.SQLException;
import java.util.ArrayList;

import db_connection.DB_connection;


public class  SammlungCar {
	public ArrayList<Car> CarListe;
	private DB_connection dbc;
	
	public void searchCars (Car referenzCar)/*Sucht eine Gruppe von Autos*/{

		StringBuilder strB = new StringBuilder();
		Car tempCar = new Car();
		
		//Beginn SQL-String bauen
		strB.append("Select * from View_Fahrzeuge WHERE ");
		if (referenzCar.intKmStand > 0){
			strB.append("F_Kilometerstand  < "+referenzCar.intKmStand+" AND");
		}
		if (referenzCar.strAutofirma != ""){
			strB.append("F_Marke  = "+ referenzCar.strAutofirma +" AND");
		}		
		if (referenzCar.strLeistung != ""){
			strB.append("F_Leistung  = "+referenzCar.strLeistung+" AND");
		}		
		if (referenzCar.strKrSt != ""){
			strB.append("F_Kraftstoffart  = "+referenzCar.strKrSt+" AND");
		}		
		if (referenzCar.dblPreis > 0.0){
			strB.append("F_Preis  = "+referenzCar.dblPreis+" AND");
		}		
		if (referenzCar.datErstzul != null){
			strB.append("F_Erstzulassung  = "+referenzCar.datErstzul+" AND");
		}
		strB.setLength(strB.length()-3);
		strB.append(';');
		
		
		// Ende SQL-String bauen
	
			dbc.select(strB.toString()); //Daten abfragen
			try {
				while (dbc.rs.next()) {
					tempCar.strAutofirma = dbc.rs.getString("F_Marke"); //Marke des Autos
					tempCar.strFarbe = dbc.rs.getString("F_Farbe"); //Farbe des Autos, als Name (evtl. auch als Farbcode angebbar)
					tempCar.datErstzul = dbc.rs.getDate("F_Erstzulassung"); //Erstzulassung
					tempCar.strKrSt = dbc.rs.getString("F_Kraftstoffart"); //Kraftstoff
					tempCar.intKmStand = dbc.rs.getInt("F_Kilometer"); //Kilometerstand
					tempCar.strLeistung = dbc.rs.getString("F_Leistung"); //Motorleistung
					tempCar.dblPreis = dbc.rs.getDouble("F_Preis"); //Angebotspreis
					tempCar.strUser = dbc.rs.getString("K_Marke");
					tempCar.strOrt = dbc.rs.getString("K_Marke");
				CarListe.add(tempCar);	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
	
}
