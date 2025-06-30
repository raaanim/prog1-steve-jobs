package lezione_4;

import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		ArrayList<String> star = new ArrayList<String>();
		star.add("Skat");
	    star.add("Zeta");
	    star.add("Albali");
	    star.add("Sadachbia");
	    star.add("Sadalmelik");
	    star.add("Hydor");
	    star.add("Ancha");
	    
	    
	    
	    for (String i : star) {
	    	  System.out.println(i);
	    }
	    
	    System.out.println("\n*********\n");
	    
	    star.remove(0);
	    star.set(4, "Unknown");
	    
	    for(String i : star) {
	    	System.out.println(i);
	    }
	}
	

}
