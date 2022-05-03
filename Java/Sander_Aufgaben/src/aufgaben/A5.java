package aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class A5 {
	public static double[] median = new double[3];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Geben Sie eine von drei Zahlen ein: ");
		median[0] = in.nextDouble();
		System.out.println("Geben Sie die zweite Zahl ein: ");
		median[1] = in.nextDouble();
		System.out.println("Geben Sie die dritte Zahl ein: ");
		median[2] = in.nextDouble();
		Arrays.sort(median);
		for (int i = 0; i < median.length; i++) {
			System.out.println(median[i]);
		}
		System.out.println("Der Median ist: " + median[1]);
		in.close();
	}
}
