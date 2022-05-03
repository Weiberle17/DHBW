package klausur;

public class Aufgabe_1 {
	
	public static void main (String[] args) {
		
		int n = 300;
		int g, s, d, r;
		
		System.out.println("Die eingegebene Nummer ist : " + n);
		
		g = n/144;
		n = n%144;
		s = n/60;
		n = n%60;
		d = n/12;
		r = n%12;
		
		System.out.println("Das ergibt:");
		System.out.println(g + " Gros");
		System.out.println(s + " Schock");
		System.out.println(d + " Dutzend");
		System.out.println(r + " Stück");
		double x = 3.14;
		
		x += x;
		
		System.out.println(x);
	}
}
