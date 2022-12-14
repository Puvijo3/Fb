package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Puvidata {
	@Test(dataProvider = "puvi")
	public void puvi(String papa, String partner) {
		System.out.println("child1:" + papa);
		System.out.println("child1:" + partner);
	}

	@DataProvider(name = "puvi")
	public Object[][] puvipapa() {
		return new Object[][] { { "hari" ,"puvi" }, { "puvi", "hari" },{"chelama","alagii"} };

	}

}
