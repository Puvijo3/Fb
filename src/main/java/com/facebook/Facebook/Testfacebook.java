package com.facebook.Facebook;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Testfacebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Facebook/Driver/chromedriver");

		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.facebook.com/");

		Thread.sleep(3000);
		WebElement text= m.findElement(By.xpath("//h2[@class='_8eso']"));
		String text2 = text.getText();
		System.out.println(text2);

		WebElement email = m.findElement(By.xpath("//input[@id='email']"));
		String allData = Facebook.allData("Facebook", 1, 0);
        email.sendKeys(allData);
        
		WebElement pass = m.findElement(By.xpath("//input[@id='pass']"));
		String allData2 = Facebook.allData("Facebook", 3, 1);
		pass.sendKeys(allData2);
		
		
		Thread.sleep(3000);
		m.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);

		TakesScreenshot t = (TakesScreenshot) m;
		File v1 = t.getScreenshotAs(OutputType.FILE);
		File b1 = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot.facebook.png");
		FileUtils.copyFile(v1, b1);

		m.navigate().back();

		Thread.sleep(3000);

		m.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);

		WebElement name = m.findElement(By.xpath("//input[@name='firstname']"));
		String allData3 = Facebook.allData("Facebook", 5, 0);
		name.sendKeys(allData3);
		Thread.sleep(3000);
		
		WebElement surname = m.findElement(By.xpath("//input[@name='lastname']"));
		String allData4 = Facebook.allData("Facebook", 2, 0);
		surname.sendKeys(allData4);
		Thread.sleep(3000);
		
		WebElement email1 = m.findElement(By.xpath("//input[@name='reg_email__']"));
		String allData5 = Facebook.allData("Facebook", 0, 0);
		email1.sendKeys(allData5);
		
		Thread.sleep(3000);
		WebElement pass1 = m.findElement(By.xpath("//input[@name='reg_passwd__']"));
		String allData6 = Facebook.allData("Facebook", 3, 0);
		pass1.sendKeys(allData6);
		Thread.sleep(3000);

		WebElement day = m.findElement(By.id("day"));
		Select g = new Select(day);
		String allData7 = Facebook.allData("Facebook", 4, 0);
		g.selectByValue(allData7);
		Thread.sleep(3000);

		WebElement month = m.findElement(By.id("month"));
		Select M = new Select(month);
		String allData8 = Facebook.allData("Facebook", 5, 1);
		M.selectByValue(allData8);
		Thread.sleep(3000);

		WebElement year = m.findElement(By.name("birthday_year"));
		Select h = new Select(year);
		String allData9 = Facebook.allData("Facebook", 6, 0);
		h.selectByValue(allData9);
		Thread.sleep(3000);

		m.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(3000);

		m.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);

		TakesScreenshot r = (TakesScreenshot) m;
		File v = r.getScreenshotAs(OutputType.FILE);
		File b = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot.facebook.png");
		FileUtils.copyFile(v, b);
		Thread.sleep(3000);
		m.quit();
	}

}
