package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groupon {
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
	@Test(priority=0) 
	public void login()
	{
		 
		driver.findElement(By.id("ls-user-signin")).click();
		driver.findElement(By.id("email-input")).sendKeys("durair7@yahoo.com");
		driver.findElement(By.id("password-input")).sendKeys("r7_london*");
		driver.findElement(By.id("signin-button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("search")).sendKeys("Tv stand");
		driver.findElement(By.id("ls-header-search-button")).click();
		
		//System.out.println(driver.getTitle());
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='user-name']")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='user-name']")).isDisplayed());
	
	}
@Test (priority=1) 
	public void hotthisweek()
	{
		driver.findElement(By.id("sls-aria-7")).click();
	}
@Test( priority=2) 
public void clearence()
{
	driver.findElement(By.id("sls-aria-5")).click();
}
@Test (priority=3) 
public void home()
{
	driver.findElement(By.id("sls-aria-1")).click();
}
}
