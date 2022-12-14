package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
public WebDriver m;
	@FindBy(xpath = "//h2[@class='_8eso']")
	private WebElement text;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement button;
	
	
	public WebElement getText() {
		return text;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}

	public Login(WebDriver m) {
	    this.m = m;
	    PageFactory.initElements(m, this);
		}
		
	
	
	
	
	
}
