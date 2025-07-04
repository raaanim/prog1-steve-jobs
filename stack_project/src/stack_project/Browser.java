package stack_project;

import java.util.Stack;

public class Browser {
	
	private Stack<String> cronologia = new Stack<String>();
	
	// Aggiunge l’URL della nuova pagina allo stack.
	public boolean visitPage(String url){
		return cronologia.add(url);
	}

	//Rimuove l'ultima pagina visitata e mostra la pagina precedente.
	public void goBack() {
		try {
			cronologia.pop();
			
		}catch(Exception e){
			System.out.println("Nessuna pagina precedente.");
		}
	}
	
	//Stampa la cronologia delle pagine visitate (dal più recente al meno recente).
	public void printHistory() {
		System.out.println("Cronologia delle pagine visitate: ");
		for(String stampaCrono : cronologia) {
			System.out.println(stampaCrono);
		}
		
	}
	
	
}

