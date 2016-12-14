package testNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browsername) {
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			}
		
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
