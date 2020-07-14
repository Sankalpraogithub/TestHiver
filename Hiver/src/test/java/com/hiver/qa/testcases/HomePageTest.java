package com.hiver.qa.testcases;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hiver.qa.base.TestBase;

import com.hiver.qa.pages.HomePage;
import com.hiver.qa.pages.LoginPage;
import com.hiver.qa.pages.LogintoHiver;

public class HomePageTest extends TestBase{
	
	LoginPage lp;
	HomePage homepage;
	LogintoHiver hiverloginpage;
	
	public HomePageTest() {
		super();
		
	}
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		initialize();
		hiverloginpage =new LogintoHiver();
		lp=new LoginPage();
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(10000);
		
	}
	
	
	
	/*
	 * @Test public void hiverValidateLogo() { boolean
	 * flag=homepage.hivervalidate(); Assert.assertTrue(flag);
	 * 
	 * System.out.println("Hi"); }
	 */
	
	@Test
	public void clickHiver() {
		
		hiverloginpage=homepage.hiverlinkclick();
	}
	/*
	 * @AfterTest public void closeDriver() { driver.quit();
	 * 
	 * }
	 */
	  
}
