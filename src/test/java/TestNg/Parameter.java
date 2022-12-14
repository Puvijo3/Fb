package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
 @Test
@Parameters("color")
 private void hari(String color) {
System.out.println("fav color :"+color);
}
	@Test
	private void happy() {
System.out.println("hi");
	}
	
}
