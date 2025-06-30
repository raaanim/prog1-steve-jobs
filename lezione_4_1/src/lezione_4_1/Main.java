package lezione_4_1;

import java.util.ArrayList;
import java.time.LocalDate;


public class Main {
	public static void main (String[]args) {
		
			ArrayList<Product> ProductList = new ArrayList<Product>();
			
			Product mozzarella = new Product ("Mozzarella", "Santa Lucia", 3.2, LocalDate.of(2025,8,1));
			ProductList.add(mozzarella);
			
			Product pomodoro = new Product ("Pomodoro", "Santa Lucia", 5, LocalDate.of(2025,7,5));
			ProductList.add(pomodoro);
			
			for( Product prodotto : ProductList) {
				System.out.println(prodotto);
			}
		    
			
		    
		    System.out.println("\n*********\n");
		    
		    ProductList.remove(0);
		   
		    
		    for(Product prodotto : ProductList) {
		    	System.out.println(prodotto);
		    }
		    
		    
		    if(pomodoro.isExpired(pomodoro.getScadenza())){
		    	System.out.println("Prodotto scaduto");
		    }else {
		    	System.out.println("Prodotto non scaduto");
		    }
		    
	}
  
}
