package aufgaben;

public class Quicksort {

    private static void qsort(int[] daten, int links, int rechts) {
        if (links < rechts) {
            for (int i = links; i <= rechts; i++) {
                int l = links;
                int r = rechts;
                int x = daten[(links+rechts)/2];
                while (l < r) {
                    while (daten[l] < x) { l++; }
                    while (daten[r] > x) { r--; }
                    if (l <= r) {
                        swap(daten, l, r);
                    }
                }
                qsort(daten, links, r);
                qsort(daten, l, rechts);
            }
        }
    }

    private static void swap (int[] liste, int pos1, int pos2) {
        int l1 = liste[pos1];
        int l2 = liste[pos2];
        liste[pos1] = l1;
        liste[pos2] = l2;
    }

    public static void main(String[] args) {
        int[] zahlen = {8, 4, 2, 5, 7, 9, 0, 3, 6};
        int n = zahlen.length;

        qsort(zahlen, 0, n-1);

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}