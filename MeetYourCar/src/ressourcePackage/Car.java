package ressourcePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//
public class Car {
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
public String giveString(){ //schreibt Member des Objekt in einen String (siehe readString(String))
	StringBuilder sParameter = new StringBuilder();
	
	sParameter.append(strAutofirma + "&");
	sParameter.append(strFarbe + "&");
	sParameter.append(intKilometerstand + "&");
	sParameter.append(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(datErstzul) + "&");
	sParameter.append(strKrSt + "&");
	sParameter.append(intKmStand + "&");
	sParameter.append(strLeistung + "&");
	sParameter.append(dblPreis + "&");	
	sParameter.append(strUser + "&");
	sParameter.append(strOrt + "&");
	
	return sParameter.toString();
}
public void readString(String strParameter) throws ParseException{ //liest Member aus String aus (siehe giveString())
	StringBuilder sRead = new StringBuilder();
	int k = 0;
	int j = 0;
	sRead.append(strParameter);
	for (int i = 0;i<= 9; i++){
	while (sRead.charAt(j) != '&') {
		j++;
	switch(i){
	case 0: 	strAutofirma = sRead.substring(k, j); 
	case 1:		strFarbe = sRead.substring(k, j);
	case 2: 	intKilometerstand = Integer.parseInt(sRead.substring(k, j));
	case 3:		datErstzul = new SimpleDateFormat("yyyy-MM-dd").parse(sRead.substring(k, j));
	case 4: 	strKrSt = sRead.substring(k, j);
	case 5:		intKmStand =Integer.parseInt(sRead.substring(k, j));
	case 6: 	strLeistung = sRead.substring(k, j);
	case 7:		dblPreis = Double.parseDouble(sRead.substring(k, j));
	case 8: 	strUser = sRead.substring(k, j);
	case 9: 	strOrt = sRead.substring(k, j);
	}
	j++; k = j; 
	}
	}
	}
}

