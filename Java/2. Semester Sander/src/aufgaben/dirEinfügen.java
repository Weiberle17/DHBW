package aufgaben;

public class dirEinf�gen {
	public static void main(String[] args) {
		int[] daten = { 6, 8, 11, 3, 12, 4, 2, 1};
		int i, j;

		for (i = 1; i < daten.length; i++) {
			int v = daten[i];

			for (j = i; ((j > 0) && (daten[j - 1] > v)); j--) {
				daten[j] = daten[j - 1];
			}
			daten[j] = v;
		}
		System.out.println(java.util.Arrays.toString(daten));
	}
}
