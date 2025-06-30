package traduzione;
import java.util.Scanner;
	public class calcolatrice {
	  public static void main(String[] args) {
		  Scanner tastiera = new Scanner (System.in);
		  

	  
	float num1;
	float num2;
	
	System.out.println("Inserisci un primo numero: ");
	num1 = tastiera.nextFloat();
	
	System.out.println("Inserisci un secondo numero: ");
	num2 = tastiera.nextFloat();
	
	tastiera.close();
	
	
	float somma = somma(num1 , num2);
	System.out.println("La somma è: "+somma);
	float differenza = diff(num1, num2);
	System.out.println("La differenza è: "+ differenza);
	float molt = molt(num1,num2);
	System.out.println("La moltiplicazione è: "+molt);
	float div = divi(num1,num2);
	System.out.println("La divisione è: "+div);
	
	/* somma = num1 + num1;
	System.out.println("La somma è: ");
	System.out.println(somma); */
	

	/* differenza = num1 - num2;
	System.out.println("La differenza è: ");
	System.out.println(differenza); */
	
	
	/* molt = num1 * num2;
	System.out.println("La moltiplicazione è: ");
	System.out.println(molt); */
	

	/* if (num2 != 0) {
	div = num1 / num2;
	System.out.println("La divisione è: ");
	System.out.println(div);
	}else {
		System.out.println("Impossibile dividere per 0");
	}
	*/
	
	
	
	
}
	  /*  Le funzioni vanno dichiarate fuori dal main e dentro la classe */
	  
	  public static float somma(float num1, float num2) {
			return num1 + num2;
		}
	  
	  public static float diff(float num1, float num2) {
			return num1 - num2;
		}
	  
	  public static float molt(float num1, float num2) {
			return num1 * num2;
		}
	  
	  public static float divi(float num1, float num2) {
		  float div = 0;
			if(num2 != 0) {
				div = num1 / num2;
	
			}else {
				System.out.println("Impossibile dividere per 0");
			}
			
			
			return div;
		}
	  
	}
