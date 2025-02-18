
public class Operatoren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Was sind Operatoren?
		/*
		 * Mit Operatoren kann man Vatiablen verändern oder allgemein mit ihnen arbeiten
		 * 
		 */

		int varZahl = 5;
		
		int zahl1 = 10; //inizialisiert
		int zahl2 = 5; //inizilaisiert
		
		int ergebnis; //deklariert
		
		//Arithmetische Operatoren einfache Rechenoperationen
		
		ergebnis = zahl1 + zahl2 ;//15
		System.out.println(ergebnis);
		
		ergebnis = zahl1 - zahl2 ;//5
		System.out.println(ergebnis);
		
		ergebnis = zahl1 * zahl2 ;//50
		System.out.println(ergebnis);
		
		ergebnis = zahl1 / zahl2 ;//2
		System.out.println(ergebnis);
		
		//Inkrementieren und dekrementieren
		
		varZahl ++; //6
		System.out.println(varZahl);
		
		varZahl --; //5
		System.out.println(varZahl);
		
		//Anwendungsbeispiel
		
		int lebenGegner = 100;
		int geschossEnergie = 20;
		
		lebenGegner = lebenGegner - geschossEnergie;
		System.out.println(lebenGegner);
		
		
		//Zuweisungsoperatoren
		 // Var2 wird von var1 abgezogen und var1 wird überschreiben 
		lebenGegner -= geschossEnergie; 
		System.out.println(lebenGegner);
		
	}

}
