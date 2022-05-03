package klausur;

public class Aufgabe_2 {
	
	public static void main (String args[]) {
	
		double PI = 3.141;
		double radius = 1.5;
		double flaeche, umfang;
		
		flaeche = PI * radius * radius;
		umfang = 2 * PI * radius;
		
		System.out.println("Fläche: " + flaeche);
		System.out.println("Umfang: " + umfang);
	}
}
