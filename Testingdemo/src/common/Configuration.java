package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;



import page.HomePage;

public class Configuration {
	public static WebDriver driver;
	public static HomePage oHomePage;
	@BeforeSuite
	
	public void setup(){
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.teambeachbody.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		oHomePage=new HomePage();
		
		
	}
	

}
