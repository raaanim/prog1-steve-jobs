package _test_3;

public class Utente {
	private String username;
	private String email;
	
	
	public Utente(String username, String email) {
		this.setUsername(username);
		this.email = email;
	}
	
	public void presentati() {
		System.out.println("Utente generico: " + getUsername() + ", " + "email: " + email);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
