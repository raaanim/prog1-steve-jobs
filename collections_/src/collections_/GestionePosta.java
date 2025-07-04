package collections_;

public class GestionePosta {
	public static void main (String[]args) {
		
		Posta gestione = new Posta();
		Persona p1 = new Persona("Mars");
		Persona p2 = new Persona("Saturn");
		Persona p3 = new Persona("Venus");
		
		
		gestione.entraInCoda(p1);
		gestione.entraInCoda(p2);
		gestione.entraInCoda(p3);
		
		
		gestione.mostraCoda();
		System.out.println("\n");
		
		System.out.println("Il prossimo in coda: " + gestione.chiEIlProssimo().getNome());
		System.out.println("\n");
		
		System.out.println("Chi verrà servito dopo? ");
		System.out.println(gestione.servireProssimo().getNome());
		System.out.println(gestione.servireProssimo().getNome());
		
		System.out.println("\n");
		gestione.mostraCoda();
		
	}

}
