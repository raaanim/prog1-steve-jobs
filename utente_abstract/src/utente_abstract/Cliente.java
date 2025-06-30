package utente_abstract;

import java.util.ArrayList;

public class Cliente extends Utente{
	
	public Cliente (String username, String email) {
	super(username, email);
	}
	
	public ArrayList<String> getPermessi(){
		ArrayList<String> lettura = new ArrayList<String>();
		lettura.add("READ");
		
		return lettura;
	}

}
