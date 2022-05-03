package aufgaben;

public class A10 {
	static int x;
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			x = i;
			for (int j = 0; j < 8; j++) {
				x++;
				System.out.print(String.format("%4d", x));
			}
			System.out.println();
		}
	}
}
