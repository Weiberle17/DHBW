package abstrakteKlassen;

public abstract class Mitarbeiter {
	
	protected String nname, vname;
	protected double gehalt;
	
	public Mitarbeiter(String vname, String nname, double gehalt) {
		this.nname = nname;
		this.vname = vname;
		this.gehalt = gehalt;
	}
	
	public void erhoeheGehalt(double betrag) {
		gehalt += betrag;
	}
	
	public void zeigeDaten() {
		System.out.println("Vorname: " + vname);
		System.out.println("Nachname: " + nname);
		System.out.println("Gehalt: " + gehalt);
	}
	
	public void addZulage(double betrag) { 
		gehalt += betrag;
	}
	
	public static void main(String[] args) {
		Azubi a1 = new Azubi("Kurt", "Angel", 1000);
		Angestellter a2 = new Angestellter("Max", "Mustermann", 3000);
		a1.zeigeDaten();
		a1.setPruefungen(6);
		a1.zeigeDaten();
		a2.zeigeDaten();
		a2.befoerdere();
		a2.zeigeDaten();
		a2.befoerdere();
		a2.zeigeDaten();
	}
}
