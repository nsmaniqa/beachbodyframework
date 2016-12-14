package testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmail {
	public WebDriver driver;
	@BeforeMethod
	public void start(){
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void end(){
		driver.quit();
	}
	@Test(priority=1)
	public void login(){
		driver.findElement(By.id("Email")).sendKeys("durai.me72@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("r7_london*");
		driver.findElement(By.id("signIn")).click();
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(By.className("gbii")));
	//	driver.getTitle().contains("durai.me72@gmail.com"),"verification failed"
		Assert.assertTrue(driver.getTitle().contains("durai.me72@gmail.com"),"verification failed");
		
	}
	@Test(priority=3)
	public void needhelp(){
		driver.findElement(By.className("need-help")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Account Recovery"),"verification failed for needelp");	}
	@Test (priority=2)
	public void createaccount(){
		driver.findElement(By.xpath("//*[@id='link-signup']/a")).click();
	//	driver.getTitle().contains("Create your Google Account"),"verification failed for Create your Google Account");
		Assert.assertTrue(driver.getTitle().contains("Create your Google Account"),"verification failed FOR Create your Google Account");
	}
}
