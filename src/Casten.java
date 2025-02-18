
public class Casten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Was ist eine Typenumwandlung / Casten?
		 * 
		 * Das ist eine Umwandlung von einem Datentypen in einen anderen Datentypen
		 */

		//Expliziete Casting Grundlage
		int userAlter = (int) 18.5; // (int) = castoperator
		System.out.println(userAlter);
		
		//Implizites casten (von klein nach groß) kein Datenverlust
		//Umwandlung findet bei der Zuweisung statt
		
		int zahl1 = 30;
		double zahl2 = zahl1;
		System.out.println(zahl2);
		
		//Expliziet casten (von groß nach klein) Datenverluste 
		//Nachkommastellen werden abgeschnitten
		// Umwandlung findet mir Hilfe des Cast-Operators (Datentypoperator) statt
		
		//1. Auto = 3450,45 € 2. Auto = 2690,94 €
		int autoPreis1 = (int)3450.45;
		System.out.println(autoPreis1);
		int autoPreis2 = (int)2690.94;
		System.out.println(autoPreis2);
		
		int gesamtPreis = autoPreis1 + autoPreis2;
		System.out.println(gesamtPreis);
	}

}
