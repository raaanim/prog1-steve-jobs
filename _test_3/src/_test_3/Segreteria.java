package _test_3;

public class Segreteria extends Utente {
	
	private String ufficio;
	
	public Segreteria(String username, String email, String ufficio) {
		super(username, email);
		this.ufficio = ufficio;
	}

	public void presentati() {
		System.out.println("Personale di segreteria " + getUsername()  + ", " + "ufficio:" + ufficio);
	}
	

}
