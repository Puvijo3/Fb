package TestNg;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class my_puvi {
	@Test(retryAnalyzer = iretry.class)
	public void method() {
		System.out.println("puvi say i love you");
		Assert.assertEquals("puvi say i love you","puvi say i like you");
	}
	
	
	
	
	

}
