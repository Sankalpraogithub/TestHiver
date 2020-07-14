package com.hiver.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hiver.qa.base.TestBase;
import com.hiver.qa.pages.HomePage;
import com.hiver.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage lp;
    HomePage homepage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		
		initialize();
		
		lp=new LoginPage();
		
	}
	
	/*
	 * @Test(priority=1) public void loginpagetitletest() { String
	 * title=lp.validateTitle();
	 * 
	 * Assert.assertEquals(title, "Gmail");
	 *}
	 */
		
	
	
	@Test
	public void loginpagetest() throws InterruptedException {
		
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	/*
	 * @AfterTest public void driverclose() {
	 * 
	 * driver.close(); }
	 */
}
