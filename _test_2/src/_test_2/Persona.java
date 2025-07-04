package _test_2;

public class Persona {
	private String nome;
	private String cognome;
	
	
	public Persona(String nome, String cognome) {
		this.setNome(nome);
		this.setCognome(cognome);
	}
	
	public void presentati() {
		System.out.println("Ciao sono " + getNome() + " " + getCognome());
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
