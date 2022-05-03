package abstrakteKlassen;

public class Angestellter extends Mitarbeiter {

	private static final int MAX_STUFE = 5;
	private int stufe;
	
	public Angestellter(String vname, String nname, double gehalt) {
		super(vname, nname, gehalt);
	}
	
	public void befoerdere() {
		if (stufe < MAX_STUFE) {
			stufe++;
			super.addZulage(400);
		}
	}
	
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Stufe: " + stufe);
		System.out.println();
	}
	
	public void addZulage() {
		if (stufe > 1) {
			super.addZulage(400);
		}
	}
}
