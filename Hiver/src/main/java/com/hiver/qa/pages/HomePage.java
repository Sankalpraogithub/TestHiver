package com.hiver.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hiver.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[2]/div[3]/div/div[1]")
	
     WebElement hiverlink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public boolean hivervalidate() {
	 * 
	 * return hiverlink.isDisplayed(); }
	 */
	
	public LogintoHiver hiverlinkclick() {
		
		hiverlink.click();
		return new LogintoHiver();
	}
	
	
	}
	


