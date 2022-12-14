package TestNg;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProvider0 {
	
	
	
	@Test(dataProvider = "harish")
	public void dataprovider1(String login, String password) {
System.out.println("login id :"+login );
System.out.println("password :"+password);
	}
	
	
	
	@DataProvider(name="harish")
	public Object[][] method2() {
		return new Object[][] {
			{"12344","hari22"},
			{"3333","santhosh"}
		};
	}
	
	
	
	

}
