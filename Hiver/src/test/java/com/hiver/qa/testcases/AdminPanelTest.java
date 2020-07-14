package com.hiver.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hiver.qa.base.TestBase;
import com.hiver.qa.pages.AdminPanel;
import com.hiver.qa.pages.HomePage;
import com.hiver.qa.pages.LoginPage;
import com.hiver.qa.pages.LogintoHiver;

public class AdminPanelTest extends TestBase{
	
	LoginPage lp;
	HomePage homepage;
	LogintoHiver logintohiver;
	AdminPanel adminpanel;
	
	
	public AdminPanelTest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		initialize();
		lp=new LoginPage();
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		logintohiver=new LogintoHiver();
		Thread.sleep(5000);
		logintohiver=homepage.hiverlinkclick();
		Thread.sleep(5000);
		adminpanel=new AdminPanel();
		Thread.sleep(5000);
		adminpanel=logintohiver.logintohiverclick();
		
	}
	
	@Test(priority=1)
	public void clickhivericonagain() {
		
		adminpanel.clickhivericon();	
		
	}
	
	@Test(priority=2)
	public void Clickadminpanel() throws InterruptedException {
		
		adminpanel.clickadminpanel();
		
	}

}
