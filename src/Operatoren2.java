
public class Operatoren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Die Vergleich Operatoren werden oft im Zusammenhang mit
		 * if else Konstruktionen verwendet
		 * Beispiel:
		 * 
		 * if(Bedingung){
		 * 
		 * Wenn die Bedingung true = also wahr ist, dann wird alles zwischen 
		 * {}ausgeführt
		 * 
		 * }
		 */
		// if = falls
		// else = ansonsten
		
		int lebenGegner = 0; // Was soll dann passieren
		boolean hit = false;
		
		//Einfacher Zusammenhang
		
		int a = 3;
		int b = 3;
		boolean c;
		
		c = a == b;
		System.out.println(c);
		
		c = a < b;
		System.out.println(c);
		
		//Beispiel mit if else
		
		if (lebenGegner == 0) {//Bedingung (true) oder (false)
			System.out.println("Gegner zerstört");
		}else {
			System.out.println("Gegener hat noch: " + lebenGegner + " Punkte");
		}

		//Beispiel mit if else und Logischem Operator
		
				if (lebenGegner == 0 && hit == true) {//Bedingung (true) oder (false)
					System.out.println("Gegner zerstört");
				}else {
					System.out.println("Gegener hat noch: " + lebenGegner + " Punkte");
				}
	}

}
