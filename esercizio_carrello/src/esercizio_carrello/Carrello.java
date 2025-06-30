package esercizio_carrello;

import java.util.ArrayList;

public class Carrello {
	
	private ArrayList<String> prodotti; // per questioni didattiche lasciamo private ma in realtà non cambia nulla senza
	
	
	public Carrello() {
		prodotti = new ArrayList<String>();
	}
	

	public void aggiungiProdotto(String nome) {
		prodotti.add(nome);
	}
	
	public void aggiungiProdotto(String nome, int quantità) {
		String qta = String.valueOf(quantità);
		String prodotto = nome + qta;
		prodotti.add(prodotto);
	
	
	}
}
