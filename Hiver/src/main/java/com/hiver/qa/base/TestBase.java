package com.hiver.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.hiver.qa.utils.Utility;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	
	public TestBase() 
	{
		try {
		     prop= new Properties();
		
	
			FileInputStream fis = new FileInputStream("C:\\Users\\Preeti\\eclipse-workspace\\Hiver\\src\\main\\java\\com\\hiver\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           catch(IOException e) {
	        e.printStackTrace();
        }
	}

	public static void initialize()
	   {
		   
		   
		   prop.getProperty("browser");
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeti\\eclipse-workspace\\Hiver\\chromedriver.exe");
		   //driver= new ChromeDriver();
		   
		   ChromeOptions cop=new ChromeOptions();
		    cop.addExtensions(new File("C:\\Users\\Preeti\\eclipse-workspace\\Hiver\\extension_5_6_0_0.crx"));
		    DesiredCapabilities dc=DesiredCapabilities.chrome();
		    dc.setCapability(cop.CAPABILITY, cop);

		   driver= new ChromeDriver(dc);
	 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(Utility.page_load, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(Utility.implicit_wait, TimeUnit.SECONDS);
		   
		   //driver.get(prop.getProperty("url"));  
		  
		   
	
}}