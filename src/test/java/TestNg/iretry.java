package TestNg;

import org.testng.annotations.Test;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class iretry implements IRetryAnalyzer {

	int count =0;
	int limit=3;
	@Test
	@Override
	public boolean retry(ITestResult result) {
		if(count<limit) {
			count++;
			return true;
		}
		
		
		return false;
	}

	

	
	
	
	
}
