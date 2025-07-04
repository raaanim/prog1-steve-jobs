package _test_3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Utente> utenti = new ArrayList<Utente>();
		
		Studente s1 = new Studente("mario2024", "mariorossi@gmail.com", "0001");
		Professore pr = new Professore ("gianni30","gianni30@gmail.com","Java");
		Segreteria sg1 = new Segreteria ("Pippo6", "pippo6@gmail.com", "02" );
		
		utenti.add(s1);
		utenti.add(pr);
		utenti.add(sg1);
		
		for(Utente users : utenti) {
			users.presentati();
			
			// da qui il resto è realizzato con l'aiuto di chatgpt
					
			if(users instanceof Autenticabile) {
				Autenticabile a = (Autenticabile) users;
				
				try {
					if (users instanceof Studente) {
						a.autentica("studente123");
					}else if (users instanceof Professore) {
						a.autentica("prof2024");
					}
					System.out.println("Autenticazione riuscita");
					
				}catch (AuthException e) {
					System.out.println("Errore di autenticazione " + e.getMessage());
				}
					
				}
			   System.out.println();
			}							
		
		
	}

}
