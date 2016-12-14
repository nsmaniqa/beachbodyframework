package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class basetest {
public WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String typeofbrowser){
		if(typeofbrowser.equals("firefox")){
			driver=new FirefoxDriver();
		
		}
		else{

			System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.teambeachbody.com/");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
