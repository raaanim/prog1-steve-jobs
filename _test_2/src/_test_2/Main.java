package _test_2;

public class Main {

	public static void main(String[] args) {
		
		
		Persona p = new Persona("Mario", "Rossi");
		
		Studente s1 = new Studente("Giovanni", "Verdi", "0001");
		
		Professore pr = new Professore("Luigi", "Bianchi", "Java");
		
		
		Persona[] persons = new Persona[3];
		
		persons[0] = p;
		persons[1] = s1;
		persons[2] = pr;
		
		for(Persona listaPersone : persons) {
			listaPersone.presentati();
		}
	}

}
