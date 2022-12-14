package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create {
public WebDriver m;
	
	
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

	
	public Create(WebDriver m) {
	    this.m = m;
	    PageFactory.initElements(m, this);
		}
		
	
	
	
	
}
