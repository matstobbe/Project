package rockPaperScissors;

import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scanner = new Scanner(System.in);
         
		System.out.println("Välj mellan sten sax och påse!:");
		
		
				
		System.out.println("Spelare1 Väljer!:");
		String player1Choice = scanner.next();  // första spelaren väljer
		
			
		System.out.println("Spelare2 Väljer!:");
		String player2Choice = scanner.next(); // andra spelaren väljer
          
		
					
		
		Choice(player1Choice,player2Choice); // kalla på metoden (choice) 
		
		scanner.close();
		
     }
	
   
	

	public static void Choice(String player1Choice, String player2Choice) {
    	 
		// skriver in all möjliga resultat i ett sten sax påse spel.
    	  
		
    	  if (player1Choice.equals("sten") && player2Choice.equals("sax")) {
    		  System.out.println( "Spelare 1: Vann!");
    		
    	  }else if (player1Choice.equals("sax") && player2Choice == ("sten")) {
    			  System.out.println ("Spelare 2: Vann!");
          }
    	  else if (player1Choice.equals("påse") && player2Choice == ("sten")) {
    		  System.out.println("Spelare 1: Vinner!");
    	  }	  
    	  else if (player1Choice.equals("sten") && player2Choice.equals("påse")) {
    		  System.out.println("Spelare 2: Vinner!");
    	  }
    	  else if (player1Choice.equals("sax") && player2Choice.equals("påse")) {
    		  System.out.println("Spelare 1: Vinner");
    	  }
    	  else if (player1Choice.equals("påse") && player2Choice.equals("sax")) {
    		  System.out.println("Spelare 2: Vinner");
    	  }
    	  else if (player1Choice.equals(player2Choice)) {
    		  System.out.println("Oavgjort!");  
    	  }
    	  else
    		  System.out.println("Orimlig input");
    		  
    		  
     }
      
    	  
    	  
      
      
      
      
}
      
	
	
	

