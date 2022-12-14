package com.BaseClassFacebook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassFb {
	public static WebDriver m =null;
    public static void sendKeys(WebElement element, String values) {
	element.sendKeys(values);
}
	
	public static void click(WebElement element) {
        element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void selectvalue(WebElement element, String values) {
		Select p = new Select(element);
		p.selectByValue(values);
	}
	public static void selecttext(WebElement element, String values) {
		Select h = new Select(element);
		h.selectByVisibleText(values);
	}
	public static void selectindex(WebElement element, int values) {
		Select hp = new Select(element);
		hp.selectByIndex(values);
	}
	public static void currentUrl( String values) {
		m.get(values);
	}
	public static WebDriver browserLaunch(String value) {
		if(value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Selinum/chromedriver");
			m = new ChromeDriver();
			m.manage().window().maximize();
			
		}else if(value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/r.harish/eclipse-workspace/Selinum/edgedriver");
			m = new EdgeDriver();
			m.manage().window().maximize();
			
		}else if(value.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "/Users/r.harish/eclipse-workspace/Selinum/geckodriver");
			m = new FirefoxDriver();
			m.manage().window().maximize();
			
		}
		return m;
		
	}
	
	public static void close() {
		m.close();
	}
	public static void implictwait() {
		m.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static void alert() {
		m.switchTo().alert().accept();
	}
//	public static String  text(WebElement element) {
//		return text(null);
//	}
	public static void navigate() {
		m.navigate().back();
	}
	public static void maxi() {
		m.manage().window().maximize();
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot r = (TakesScreenshot) m;
		File source = r.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/r.harish/eclipse-workspace/Selinum/Screenshot"+ name+ ".png");
		FileUtils.copyFile(source, destination);
	}
	
	
	
	
	
	
}
