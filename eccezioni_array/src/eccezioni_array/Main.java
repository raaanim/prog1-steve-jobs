package eccezioni_array;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		String[] pianeti = {"Mercury", "Jupiter","Saturn","Venus","Uranus"};
		
		Scanner pianeta = new Scanner(System.in);
		System.out.println("Inserisci un indice: ");
		int indice = pianeta.nextInt();
		
		
		
		try{
			
			System.out.println(pianeti[indice]);
			
		}catch(Exception e){
			System.out.println("Non esiste l'indice " + indice + " nell'array Pianeti");
		
		}finally{
			pianeta.close();
		}
	}
}
		
		
		

		
/*	

		
		
		String[] Pianeti = {"Mercury", "Jupiter","Saturn","Venus","Uranus"};
		
		Scanner pianeta = new Scanner(System.in);
		System.out.println("Inserisci un indice: ");
		int indice = pianeta.nextInt();
		

		
		if (indice < Pianeti.length) {
			System.out.println("L'elemento dell'array nella posizione " + indice +  " è: ");
			System.out.println(Pianeti[indice]);
		}else {
			System.out.println("Non esiste l'indice " + indice + " nell'array Pianeti");
		}
		
	}

}
*/
		