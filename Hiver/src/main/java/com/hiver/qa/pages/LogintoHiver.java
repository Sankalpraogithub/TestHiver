package com.hiver.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hiver.qa.base.TestBase;
public class LogintoHiver extends TestBase{
	
	@FindBy(xpath="//a[@class='hiver-loginTohiver-btn limbo-login-link']")
	WebElement hiverlogin;
	
	public LogintoHiver() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public AdminPanel logintohiverclick() {
		
		hiverlogin.click();
		return new AdminPanel();
		
	}

}
