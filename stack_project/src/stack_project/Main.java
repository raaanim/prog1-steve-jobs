package stack_project;

public class Main {
	public static void main(String[]args) {
		
		Browser crono = new Browser();
	
		//Visita di 3 pagine diverse
		
		crono.visitPage("https://www.w3schools.com/java/java_try_catch.asp");
		crono.visitPage("https://it.wikipedia.org/wiki/Java_(linguaggio_di_programmazione)");
		crono.visitPage("https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html");
		
		//Debug 
		crono.printHistory();
		
		//Uso del taso "indietro" una o due volte
		crono.goBack();
		crono.goBack();
		
		
		// Stampa finale della cronologia
		crono.printHistory();
	}
}
