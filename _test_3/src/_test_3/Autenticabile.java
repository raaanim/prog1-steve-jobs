package _test_3;

public interface Autenticabile {
	
	// parola chiave throws cercata su internet
	
	public void autentica(String password) throws AuthException;
	
	//Lancia AutenticazioneException se la password è errata

}


