package esercizio_carrello;


public class Main {
	public static void main (String[]args) {
	
	Carrello cart = new Carrello();
	
	cart.aggiungiProdotto("Acqua Santa");
	cart.aggiungiProdotto("Sale");
	
	cart.aggiungiProdotto("PaloSanto", 10);
	cart.aggiungiProdotto("Salvia", 8);

	
}
}
