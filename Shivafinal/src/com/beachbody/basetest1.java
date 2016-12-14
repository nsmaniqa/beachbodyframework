package com.beachbody;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class basetest1 {
public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
	
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.teambeachbody.com/");
			
			
		

}
	//@AfterClass
	//public void tearDown(){
		//driver.quit();
	//}	
}
