
public class AufgabeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Aufgabe:
		 * 
		 * 1. Auto kostet: 3500
		 * 2. Auto kostet: 2340,48
		 * 
		 * 1. Daten in Variablen speichern
		 * 2. Kommazahl umwandeln in eine Ganzzahl
		 * 3. Beide Ganzzahlen zu einem Gesamtbetag verrechen
		 * 4. Gesamtbetrag ausgeben mit System.out.println("");
		 * 
		 */
		
		int auto1 = 3500;
		//int auto2 = (int)2340.48; //Mein Lösung
		double auto2 = 2340.48;
		
		int auto2Ganzzahl = (int)auto2;
		
		int gesamtBetrag;
		//gesamtBetrag = auto1 + auto2;// Meine Lösung
		gesamtBetrag = auto1 + auto2Ganzzahl;
		System.out.println(gesamtBetrag);
		
	}

}
