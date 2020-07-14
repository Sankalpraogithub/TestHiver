package com.hiver.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hiver.qa.base.TestBase;

public class AdminPanel extends TestBase{
	
	@FindBy(xpath="//*[@id=\"hq-accounts-icon\"]")
	WebElement clickhivericonagain;
	
	@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[2]/div[3]/div/div[5]/div/div[3]/div[1]/div[1]")
	WebElement clickonadminpanel;
	
	public AdminPanel() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickhivericon() {
		
		clickhivericonagain.click();
	}
	
	public Dashboard clickadminpanel() throws InterruptedException {
		
		Thread.sleep(5000);
		clickonadminpanel.click();
		return new Dashboard();
	}

}
