package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GrouponBaseTest {

	public WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
public void setup(String browser)
{
	if(browser.equals("firefox"))
			{
		driver =new FirefoxDriver();
			}
	else
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		driver.manage().window().maximize();
		driver.get("https://www.groupon.com/");
}
@AfterMethod
public void close()
{
	driver.close();
}
}
