package collections_;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {

	Queue<Persona> persona = new LinkedList<Persona>();
	
	
	public void entraInCoda(Persona p) {
		persona.add(p);
	}
	
	public Persona chiEIlProssimo(){
		return persona.peek();
	
	}
	
	public Persona servireProssimo() {
		return persona.poll();
	} 
	
	public void mostraCoda() {
		System.out.println("Persona in coda: ");
		for (Persona stampaCoda : persona) {
			System.out.println(stampaCoda.getNome());
		}
	}
}
