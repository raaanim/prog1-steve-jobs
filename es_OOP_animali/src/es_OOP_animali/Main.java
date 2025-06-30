package es_OOP_animali;

public class Main {
	public static void main(String[] args) {
	    Rifugio rifugio = new Rifugio();

	    rifugio.aggiungiAnimale(new Cane("Fuffi"));
	    rifugio.aggiungiAnimale(new Gatto("Micia"));
	    rifugio.aggiungiAnimale(new Cane("Doc"));

	    rifugio.stampaVersi();
	    }
	}
	
