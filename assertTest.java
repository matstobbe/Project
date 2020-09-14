package junitTest;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
public class assertTest {
	
	private final Calculator calculator = new Calculator();
	
	@Test
	void additon() {
		assertNotEquals(4,calculator.add(5, 6));
	   
	   
   }

	
		
	
}
