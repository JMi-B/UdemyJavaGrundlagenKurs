
public class AufgabeI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Auto: 3500
		 * 2. Alter: 18
		 * 3. Vorname: Peter
		 * 4. Nachname: Müller
		 * 
		 * 1. Überlege dir welche Datentypen diese Informationenn representieren
		 * 2. Lege Variablen fest und speicher diese Werte in den Variablen ab
		 * 3. Geben die WErte mit Hilde von System.out.println(""); aus
		 * 
		 */
		
		double autoPreis = 3500;
		int alter = 18;
		String vorName = "Peter";
		String nachName = "Müller";
		
		System.out.println("Das Auto, das " + vorName + " "+ nachName + " mit " 
		+ alter + " gekauft hat, hat " + autoPreis + " € gekostet.");
		
		//Alternative
		String name = "Peter Müller";
		System.out.println("Das Auto, das " + name+  " mit " 
				+ alter + " gekauft hat, hat " + autoPreis + " € gekostet.");
		

	}

}
