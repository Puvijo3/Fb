package com.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClassFacebook.BaseClassFb;
import com.Singleton_Design_Pattern.Sdp;
import com.facebook.property.ConfigurationHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/r.harish/eclipse-workspace/Facebook/src/test/java/com/feature/Facebook.feature",
glue="com.StepDefintion",monochrome = true,
plugin= {"pretty",
		"html:Report/htmlReport.html",
		"json:Report/jsonreport.json",
		"junit:Report/junitReport.xml"}
		//"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
		)

public class FacebookRunner extends BaseClassFb {
	public static WebDriver m ;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/r.harish/eclipse-workspace/Facebook/Driver/chromedriver");
//		 m = new ChromeDriver();
		String browser=ConfigurationHelper.getInstance().getBrowser();
		m=browserLaunch(browser);
		//Sdp facebook = new Sdp(m);

	}
	@AfterClass
	public static void teaDown() {
    // m.close();
     close();
	}

}
