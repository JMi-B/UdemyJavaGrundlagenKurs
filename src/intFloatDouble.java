
public class intFloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8 primitive Datentypen in Java
		/*
		 * byte short int long float double boolean (Aussprache: bool) char (von
		 * charakter = Zeichen)
		 */
		// Komplexedatentypen
		// String (Zeicehnketten)

		// <Datentyp><Variablenname> = <Wert> ;

		// Stuffe 1 alle sehen in der Ausgabe gleich aus
		int varZahl1 = 10;
		float varZahl2 = 10;
		double varZahl3 = 10;

		System.out.println("int " + varZahl1);
		System.out.println("float " + varZahl2);
		System.out.println("double " + varZahl3);

		// Stuffe 2 alle sehen in der Ausgabe gleich aus
		int varZahl4 = 10 / 3;
		float varZahl5 = 10 / 3;
		double varZahl6 = 10 / 3;

		System.out.println("int " + varZahl4);
		System.out.println("float " + varZahl5);
		System.out.println("double " + varZahl6);

		// Stuffe 3 alle haben ihr eigenes Ergebnis
		int varZahl7 = 10 / 3;
		float varZahl8 = 10f / 3f; // Typ festlegen
		double varZahl9 = 10d / 3d; // Typ festlegen

		System.out.println("int " + varZahl7);
		System.out.println("float " + varZahl8);
		System.out.println("double " + varZahl9);
	}

}
