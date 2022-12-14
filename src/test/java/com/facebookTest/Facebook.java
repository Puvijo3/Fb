package com.facebookTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Facebook/Driver/chromedriver");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.facebook.com/");

		Thread.sleep(3000);
		String text = m.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println(text);

		m.findElement(By.xpath("//input[@id='email']")).sendKeys("harish@123");

		m.findElement(By.xpath("//input[@id='pass']")).sendKeys("harish3445");
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

		m.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harish");
		Thread.sleep(3000);
		m.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		Thread.sleep(3000);
		m.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("misti@123");
		Thread.sleep(3000);
		m.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234567");
		Thread.sleep(3000);

		WebElement day = m.findElement(By.id("day"));
		Select g = new Select(day);
		g.selectByIndex(10);
		Thread.sleep(3000);

		WebElement month = m.findElement(By.id("month"));
		Select M = new Select(month);
		M.selectByVisibleText("Nov");
		Thread.sleep(3000);

		WebElement year = m.findElement(By.name("birthday_year"));
		Select h = new Select(year);
		h.selectByValue("2011");
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
