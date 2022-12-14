package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {
	public WebDriver m;
	
	
	public Login lg;
	public Create cr;
	
	public Login getLogin() {
		if(lg==null) {
			lg= new Login(m);
			
		}
		return lg;
	}
	public Create getCreate() {
		if(cr==null) {
			cr= new Create(m);
		}
		return cr;
	}
	
	
	
	public Sdp(WebDriver m) {
		this.m=m;
		PageFactory.initElements(m,this);
	}
	

}
