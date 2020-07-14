package com.hiver.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hiver.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//*[@id=\"identifierId\"]")
	WebElement username;
	
	@FindBy(id="identifierNext")
	WebElement usernamebtn;
	
	@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
	WebElement password;
	
	@FindBy(id="passwordNext")
	WebElement passwordbtn;
	
public LoginPage() {
	PageFactory.initElements(driver, this);
	
}
   
    
    /*public String validateTitle()
    
    {
    	return driver.getTitle();
    }*/
    
    public HomePage login(String usrname, String passwrd) throws InterruptedException
    {
    	username.sendKeys(usrname);
    	Thread.sleep(5000);
    	usernamebtn.click();
    	Thread.sleep(5000);
    	password.sendKeys(passwrd);
    	Thread.sleep(5000);
    	passwordbtn.click();
    	Thread.sleep(5000);
        return new HomePage();
    }
    
    
    
    
    
    
    
    
    
    
}