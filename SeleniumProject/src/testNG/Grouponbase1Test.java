package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Grouponbase1Test {
	
	public WebDriver driver;
	@BeforeMethod
	
public void setup()
{
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.groupon.com/");
}
@AfterMethod
public void close()
{
	driver.close();
}

}
