package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class puvi {
	
	@Test
	@Parameters({"partner","chellama", "number"})
	public void para (String partner, String chellama, int number) {
		System.out.println("wife :"+partner);
		System.out.println("puvi"+chellama);
		System.out.println("lucky number"+ number);
	}
	@Test
	public void child1() {
		System.out.println("Nila");
		
	}
	
	
	
	
	
	

}
