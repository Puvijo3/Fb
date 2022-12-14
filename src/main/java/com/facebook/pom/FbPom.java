package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPom {
	public WebDriver m=null;
	
	@FindBy(xpath = "//h2[@class='_8eso']")
	private WebElement text;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement button;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement button1;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement surname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement email1;
	
	@FindBy(xpath= "//input[@name='reg_passwd__']")
	private WebElement pass1;
	
	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(name = "birthday_year")
	private WebElement year;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement radio;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit1;

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

	public WebElement getButton1() {
		return button1;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getEmail1() {
		return email1;
	}

	public WebElement getPass1() {
		return pass1;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSubmit1() {
		return submit1;
	}
	
	public FbPom(WebDriver m) {
    this.m = m;
    PageFactory.initElements(m, this);
	}
	
	

}
