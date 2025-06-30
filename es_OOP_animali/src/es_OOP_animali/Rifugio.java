package es_OOP_animali;

import java.util.ArrayList;

public class Rifugio {
	private ArrayList <Animale> animali;

	public Rifugio() {
		animali = new ArrayList<Animale>();
	}
	
	public void aggiungiAnimale(Animale a) {
		animali.add(a);
	}
	
	public void stampaVersi() {
		for (Animale a : animali) {
			a.emettiVerso();
		}
	}
	
}
