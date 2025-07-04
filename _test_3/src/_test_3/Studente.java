package _test_3;

public class Studente extends Utente implements Autenticabile{
	
	private String matricola;

	public Studente(String username, String email, String matricola) {
		super(username, email);
		this.matricola = matricola;
		
		
	}

	@Override
	//metodo realizzato con l'aiuto di chatgpt
	public void autentica(String password) throws AuthException {
        if (!"studente123".equals(password)) {
            throw new AuthException("Password errata per Professore");
        }
    }
	
	@Override
	public void presentati() {
		System.out.println("Studente " + getUsername() + ", " + "matricola: " + matricola);
	}

}
