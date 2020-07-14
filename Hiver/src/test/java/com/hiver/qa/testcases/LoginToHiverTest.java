package com.hiver.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hiver.qa.base.TestBase;
import com.hiver.qa.pages.HomePage;
import com.hiver.qa.pages.LoginPage;
import com.hiver.qa.pages.LogintoHiver;

public class LoginToHiverTest extends TestBase{
	
	LogintoHiver logintohiver;
	HomePage homepage;
	LoginPage lp;
	
	public LoginToHiverTest() {
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
		
		
	}
	
	@Test
	public void clicklogintohiver() {
		
		logintohiver.logintohiverclick();
		
	}

}
