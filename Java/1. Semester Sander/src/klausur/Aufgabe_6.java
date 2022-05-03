package klausur;

public class Aufgabe_6 {

	public static void main (String args[]) {

		Versuch2();
	}

	public static void Versuch1() {
		String x = "*";

		for(int i = 0; i < 10; i ++) {
			System.out.println(x);
			x = x + "*";
		}
	}
	
	public static void Versuch2() {
		String x = "*";
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
