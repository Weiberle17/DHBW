package abstrakteKlassen;

public class Azubi extends Mitarbeiter {

	private int abgelegtePruefungen;
	
	public Azubi(String vname, String nname, double gehalt) {
		super(vname, nname, gehalt);
	}
	
	public void setPruefungen(int anzahl) {
		abgelegtePruefungen = anzahl;
		if (abgelegtePruefungen > 3) {
			super.addZulage(200);
			if (abgelegtePruefungen > 6) {
				super.addZulage(300);
			}
		}
	}
	
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Abgelegte Prüfungen: " + abgelegtePruefungen);
		System.out.println();
	}
	
	public void addZulage() {
		if (abgelegtePruefungen > 3) {
			super.addZulage(200);
		}
	}
}
