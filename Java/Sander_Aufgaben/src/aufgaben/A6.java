package aufgaben;

public class A6 {
	public static String x = "*";
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
//			System.out.println(x);
			for (int j = 0; j < i; j++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
