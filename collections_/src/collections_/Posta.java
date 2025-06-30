package collections_;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {

	Queue<Persona> persona = new LinkedList<Persona>();
	
	
	public void entraInCoda(Persona p) {
		persona.add(p);
	}
	
	public void chiEIlProssimo(Persona p) {
		persona.peek();
	}
	
	public void  servireProssimo(Persona p) {
		persona.poll();
	} 
	
	public void mostraCoda() {
		for (Persona stampaCoda : persona) {
			System.out.println(stampaCoda);
		}
	}
}
