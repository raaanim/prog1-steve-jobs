package _test_3;

public class Professore extends Utente implements Autenticabile{

	private String materia;
	
	public Professore(String username, String email, String materia) {
		super(username, email);
		this.materia = materia;
	}

	// metodo realizzato con l'aiuto di chatgpt
	public void autentica(String password) throws AuthException {
        if (!"prof2024".equals(password)) {
            throw new AuthException("Password errata per Professore");
        }
    }
	
	@Override
	public void presentati() {
		System.out.println("Professore " + getUsername() + ", " + "insegna: " + materia);
		
	}

}
