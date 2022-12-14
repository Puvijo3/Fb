package TestNg;


import org.testng.annotations.Test;

import com.BaseClassFacebook.BaseClassFb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class TestNg extends BaseClassFb{
public WebDriver m = null;
	
@Test(priority = -1,groups = "Puvana sri Harish")
public void browserLaunch() {
//	System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Facebook/Driver/chromedriver");
//	m = new ChromeDriver();
	browserLaunch("chrome");
	//m.manage().window().maximize();
	maxi();
	//m.get("https://www.facebook.com/");
	currentUrl("https://www.facebook.com/");
}

@Test(dependsOnMethods ="browserLaunch", timeOut = 5000, groups = "Puvana sri Harish" )
	public void getText() throws InterruptedException {
	Thread.sleep(3000);
	String text = m.findElement(By.xpath("//h2[@class='_8eso']")).getText();
	System.out.println(text);
		
	}

@Test(priority = 0, groups = "Puvana sri Harish")
	public void userName() {
		WebElement email = m.findElement(By.xpath("//input[@id='email']"));
		//sendKeys("harish@123");	
		sendKeys(email, "harish@123");
	}
	@Test(dependsOnMethods="userName")
	public void passWord() {
		WebElement pass = m.findElement(By.xpath("//input[@id='pass']"));
		//sendKeys("harish3445");
		sendKeys(pass,"harish3445");
	}
	
	@Test(timeOut = 6000, invocationCount = 1, priority = 1, groups={"Puvana sri Harish","HP"})
	public void logIn() throws InterruptedException {
		WebElement login = m.findElement(By.xpath("//button[@name='login']"));
		//click();
		click(login);
		Thread.sleep(5000);
	}
	
	
	
	@Test(priority= 2, groups="Puvana sri Harish")
	public void navigateBack() throws InterruptedException {
		//m.navigate().back();
		navigate();
	
		
	}
	@Test(dependsOnMethods = "navigateBack", timeOut = 6000, dependsOnGroups = "Puvana sri Harish",groups="HP")
	public void createAccount() throws InterruptedException {
		WebElement button = m.findElement(By.xpath("(//a[@role='button'])[2]"));
		//click();
		click(button);
		Thread.sleep(4000);
	}
	@Test(dependsOnMethods="createAccount",timeOut = 15000, groups="HP")
	public void userDetails() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement findElement = m.findElement(By.xpath("//input[@name='firstname']"));
		//sendKeys("Harish");
		sendKeys(findElement, "Harish");
		WebElement findElement2 = m.findElement(By.xpath("//input[@name='lastname']"));
		//sendKeys("R");
		sendKeys(findElement2, "R");
		WebElement findElement3 = m.findElement(By.xpath("//input[@name='reg_email__']"));
		//sendKeys("misti@123");
	   sendKeys(findElement3, "misti@123");
		WebElement findElement4 = m.findElement(By.xpath("//input[@name='reg_passwd__']"));
		//sendKeys("1234567");
		sendKeys(findElement4, "1234567");
	}
	
	@Test(enabled = false, groups="HP")
	public void checkBox() throws InterruptedException {
		WebElement day = m.findElement(By.id("day"));
//		Select g = new Select(day);
//		g.selectByIndex(10);
		selectindex(day,10 );
		Thread.sleep(3000);

		WebElement month = m.findElement(By.id("month"));
//		Select M = new Select(month);
//		M.selectByVisibleText("Nov");
		selecttext(month, "Nov");
		Thread.sleep(3000);

		WebElement year = m.findElement(By.name("birthday_year"));
//		Select h = new Select(year);
//		h.selectByValue("2011");
		selectvalue(year, "2011");
		Thread.sleep(3000);
		
	}
	
	@Test(enabled = false, timeOut = 5000, groups="HP")
	public void radioButton() throws InterruptedException {
		WebElement radio = m.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//click();
		click(radio);
		Thread.sleep(3000);


		
	}
	@Test(invocationCount = 1,timeOut = 4000, priority = 3,dependsOnGroups = "HP")
	public void submit() throws InterruptedException {
		WebElement submit = m.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//click();
		click(submit);
		Thread.sleep(3000);
	}
	@Test(enabled = false)
	public void takeScreenshot() throws IOException {
//		TakesScreenshot r = (TakesScreenshot) m;
//		File v = r.getScreenshotAs(OutputType.FILE);
//		File b = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot.facebook.png");
//		FileUtils.copyFile(v, b);
		screenshot("facebook");
	}
	
	
	
	
	
	
	
	
}
