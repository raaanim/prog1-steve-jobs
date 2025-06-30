package esercizio_signatur;

public class Main {
	public static void main (String[] args) {
		Calcolatrice calcolo = new Calcolatrice();
		System.out.println(calcolo.somma(10, 90));
		System.out.println(calcolo.somma(1, 2, 3));
		System.out.println(calcolo.somma(20.578, 1.5436));
		calcolo.somma("cinque", "cinque");
	}

}
