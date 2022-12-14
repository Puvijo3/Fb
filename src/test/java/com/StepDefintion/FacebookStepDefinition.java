package com.StepDefintion;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClassFacebook.BaseClassFb;
import com.Runner.FacebookRunner;
import com.Singleton_Design_Pattern.Sdp;
import com.facebook.Facebook.Facebook;
import com.facebook.pom.FbPom;
import com.facebook.property.ConfigurationHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepDefinition extends BaseClassFb {
	public static WebDriver m = FacebookRunner.m; 
    Sdp facebook = new Sdp(m);
    
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
//		m.manage().window().maximize();
//		m.get("https://www.facebook.com/");
		//currentUrl("https://www.facebook.com/");
		String url=ConfigurationHelper.getInstance().getUrl();
		currentUrl(url);
	}

	@When("^user Get Text From The WebElement$")
	public void user_Get_Text_From_The_WebElement() throws Throwable {
		Thread.sleep(3000);
		//WebElement text= m.findElement(By.xpath("//h2[@class='_8eso']"));
		
		//String text2 = text.getText();
		
		//System.out.println(text2);
		System.out.println(facebook.getLogin().getText());
	}

	@When("^user Click The Sign-up$")
	public void user_Click_The_Sign_up() throws Throwable {
		Thread.sleep(3000);
//		WebElement email = m.findElement(By.xpath("//input[@id='email']"));
	  //  String allData = Facebook.allData("Facebook", 1, 0);
//        //email.sendKeys(allData);
//        sendKeys(email, allData);
        //sendKeys(facebook.getLogin().getEmail(), "gl@1436");
		String sheet = ConfigurationHelper.getInstance().getSheet();//------> properties framework
		String allData = Facebook.allData(sheet, 1, 0);
		sendKeys(facebook.getLogin().getEmail(), allData);
	
//		WebElement pass = m.findElement(By.xpath("//input[@id='pass']"));
//		String allData2 = Facebook.allData("Facebook", 3, 1);
//		//pass.sendKeys(allData2);
//		sendKeys(pass, allData2);
//		sendKeys(facebook.getLogin().getPass(),"HP1436");
		String sheet2 = ConfigurationHelper.getInstance().getSheet();
		String allData2 = Facebook.allData(sheet2, 3, 1);
        sendKeys(facebook.getLogin().getPass(),allData2);
		
		Thread.sleep(3000);
//		WebElement button = m.findElement(By.xpath("//button[@name='login']"));
//		click(button);
		click(facebook.getLogin().getButton());
		
		Thread.sleep(5000);
//		TakesScreenshot t = (TakesScreenshot) m;
//		File v1 = t.getScreenshotAs(OutputType.FILE);
//		File b1 = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot.facebook.png");
//		FileUtils.copyFile(v1, b1);
		screenshot("facebook1");

		//m.navigate().back();
        navigate();
	}

	@When("^user Enter The Required Information$")
	public void user_Enter_The_Required_Information() throws Throwable {
		Thread.sleep(3000);

//		WebElement button1 = m.findElement(By.xpath("(//a[@role='button'])[2]"));
//		//click();
//		click(button1);
		click(facebook.getCreate().getButton1());
		
		Thread.sleep(4000);

//		WebElement name = m.findElement(By.xpath("//input[@name='firstname']"));
//		String allData3 = Facebook.allData("Facebook", 5, 0);
//		//name.sendKeys(allData3);
//		sendKeys(name, allData3);
		implictwait();
		//sendKeys(facebook.getCreate().getName(),"hari");
		String sheet = ConfigurationHelper.getInstance().getSheet();
		String allData3 = Facebook.allData(sheet, 5, 0);
		sendKeys(facebook.getCreate().getName(),allData3);
		
		Thread.sleep(3000);
		
//		WebElement surname = m.findElement(By.xpath("//input[@name='lastname']"));
//		String allData4 = Facebook.allData("Facebook", 2, 0);
//		//surname.sendKeys(allData4);
//		sendKeys(surname, allData4);
//		sendKeys(facebook.getCreate().getSurname(),"p");
		String sheet2 = ConfigurationHelper.getInstance().getSheet();
		String allData4 = Facebook.allData(sheet2, 2, 0);
		sendKeys(facebook.getCreate().getSurname(),allData4);
		
		
		
		
		
		Thread.sleep(3000);
		
//		WebElement email1 = m.findElement(By.xpath("//input[@name='reg_email__']"));
//		String allData5 = Facebook.allData("Facebook", 0, 0);
//		//email1.sendKeys(allData5);
//		sendKeys(email1, allData5);
//		sendKeys(facebook.getCreate().getEmail1(), "hp1436@gmail.com");
		String sheet3 = ConfigurationHelper.getInstance().getSheet();
		String allData5 = Facebook.allData(sheet3, 0, 0);
		sendKeys(facebook.getCreate().getEmail1(), allData5);
		
		Thread.sleep(3000);
//		WebElement pass1 = m.findElement(By.xpath("//input[@name='reg_passwd__']"));
//		String allData6 = Facebook.allData("Facebook", 3, 0);
//		//pass1.sendKeys(allData6);
//		sendKeys(pass1, allData6);
	//	sendKeys(facebook.getCreate().getPass1(),"PH1436");
		String sheet4 = ConfigurationHelper.getInstance().getSheet();
		String allData6 = Facebook.allData(sheet4, 3, 0);
		sendKeys(facebook.getCreate().getPass1(),allData6);
		
		
		
		Thread.sleep(3000);

//		WebElement day = m.findElement(By.id("day"));
//		//Select g = new Select(day);
//		String allData7 = Facebook.allData("Facebook", 4, 0);
//		//g.selectByValue(allData7);
//		selectvalue(day, allData7);  
	//	selectvalue(facebook.getCreate().getDay(),"5");
		String sheet5 = ConfigurationHelper.getInstance().getSheet();
		String allData7 = Facebook.allData(sheet5, 4, 0);
		selectvalue(facebook.getCreate().getDay(),allData7);
		
		Thread.sleep(3000);

//		WebElement month = m.findElement(By.id("month"));
//		//Select M = new Select(month);
//		String allData8 = Facebook.allData("Facebook", 5, 1);
//		//M.selectByValue(allData8);
//		selectvalue(month, allData8);
//		selectvalue(facebook.getCreate().getMonth(), "6");
		String sheet6 = ConfigurationHelper.getInstance().getSheet();
		String allData8 = Facebook.allData(sheet6, 5, 1);
		selectvalue(facebook.getCreate().getMonth(), allData8);
		
		Thread.sleep(3000);

//		WebElement year = m.findElement(By.name("birthday_year"));
//		//Select h = new Select(year);
//		String allData9 = Facebook.allData("Facebook", 6, 0);
//		//h.selectByValue(allData9); 
//		selectvalue(year, allData9);
//		selectvalue(facebook.getCreate().getYear(), "1998");
		String sheet7 = ConfigurationHelper.getInstance().getSheet();
		String allData9 = Facebook.allData(sheet7, 6, 0);
		selectvalue(facebook.getCreate().getYear(), allData9);
		
	}

	@When("^user Get The Invalid Credential Input$")
	public void user_Get_The_Invalid_Credential_Input() throws Throwable {
		Thread.sleep(3000);

//		WebElement radio = m.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		//click();
//		click(radio);
		click(facebook.getCreate().getRadio());
		Thread.sleep(3000);

//		WebElement submit1 = m.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		//click();
//		click(submit1);
		click(facebook.getCreate().getSubmit1());
		Thread.sleep(3000);

	}

	@Then("^user Get The Screenshot Of The Current Page$")
	public void user_Get_The_Screenshot_Of_The_Current_Page() throws Throwable {
//		TakesScreenshot r = (TakesScreenshot) m;
//		File v = r.getScreenshotAs(OutputType.FILE);
//		File b = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot.facebook.png");
//		FileUtils.copyFile(v, b);
		screenshot("facebook");
		Thread.sleep(3000);
		
	


	}
}