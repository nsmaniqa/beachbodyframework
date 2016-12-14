package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailHomepageTest extends BaseTest  {

	@Test(priority=3)
	public void signOutTest(){
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("durai.me72@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys("r7_london*");
		driver.findElement(By.id("signIn")).click();
   	new WebDriverWait(driver,20)
	.until(ExpectedConditions.elementToBeClickable(By.className("gbii")));
		Assert.assertTrue(driver.getTitle().contains("durai.me72@gmail.com"),"Home Page titile verification failed");
	driver.findElement(By.className("gbii")).click();
	driver.findElement(By.id("gb_71")).click();
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.elementToBeClickable(By.id("signIn")));
	
	Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/h2")).getText(),"Sign in to continue to Gmail");
		
	}

}
