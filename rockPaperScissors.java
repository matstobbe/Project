package rockPaperScissors;

import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scanner = new Scanner(System.in);
         
		System.out.println("V�lj mellan sten sax och p�se!:");
		
		
				
		System.out.println("Spelare1 V�ljer!:");
		String player1Choice = scanner.next();  // f�rsta spelaren v�ljer
		
			
		System.out.println("Spelare2 V�ljer!:");
		String player2Choice = scanner.next(); // andra spelaren v�ljer
          
		
					
		
		Choice(player1Choice,player2Choice); // kalla p� metoden (choice) 
		
		scanner.close();
		
     }
	
   
	

	public static void Choice(String player1Choice, String player2Choice) {
    	 
		// skriver in all m�jliga resultat i ett sten sax p�se spel.
    	  
		
    	  if (player1Choice.equals("sten") && player2Choice.equals("sax")) {
    		  System.out.println( "Spelare 1: Vann!");
    		
    	  }else if (player1Choice.equals("sax") && player2Choice == ("sten")) {
    			  System.out.println ("Spelare 2: Vann!");
          }
    	  else if (player1Choice.equals("p�se") && player2Choice == ("sten")) {
    		  System.out.println("Spelare 1: Vinner!");
    	  }	  
    	  else if (player1Choice.equals("sten") && player2Choice.equals("p�se")) {
    		  System.out.println("Spelare 2: Vinner!");
    	  }
    	  else if (player1Choice.equals("sax") && player2Choice.equals("p�se")) {
    		  System.out.println("Spelare 1: Vinner");
    	  }
    	  else if (player1Choice.equals("p�se") && player2Choice.equals("sax")) {
    		  System.out.println("Spelare 2: Vinner");
    	  }
    	  else if (player1Choice.equals(player2Choice)) {
    		  System.out.println("Oavgjort!");  
    	  }
    	  else
    		  System.out.println("Orimlig input");
    		  
    		  
     }
      
    	  
    	  
      
      
      
      
}
      
	
	
	

