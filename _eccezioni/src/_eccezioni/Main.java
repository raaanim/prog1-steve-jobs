package _eccezioni;

import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		
	
		Scanner numero = new Scanner(System.in);
	    System.out.println("Inserisci due numeri: ");
		
		
	    int num1 = numero.nextInt();
	    int num2 = numero.nextInt();
		
		
	    try {
			
			System.out.println(num1 / num2); // è ciò che viene eseguito se non c'è errore
			System.exit(num2);
			
		}catch(Exception e) {
			
			System.out.println("Impossibile dividere per 0");
			
		}finally {
			 System.out.println("Inserisci un nuovo denominatore: ");
			 num2 = numero.nextInt();
			 System.out.println(num1 / num2);
		}
}
}
		
		
		/*
		 * 
		 * 
		 * 
		
		int a = 30;
		int b = 10;
		
		try {
			
			System.out.println(a / b);
			
		}catch(Exception e) {
			
			System.out.println("Impossibile dividere per 0!");
			
		}
		
		
	}
*/

