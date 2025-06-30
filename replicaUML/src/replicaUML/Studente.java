package replicaUML;

public class Studente extends Persona {
	
	String id;
	Float average;
	
	
	public Studente(String id, Float average,String name, String surname, int age) {
		super(name, surname, age);
		this.id = id;
		this.average = average;
		
	}
	
}
