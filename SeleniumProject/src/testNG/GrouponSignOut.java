package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GrouponSignOut extends GrouponBaseTest {
	@Test(priority=4)
	public void signout()
	{
		driver.findElement(By.id("ls-user-signin")).click();
		driver.findElement(By.id("email-input")).sendKeys("durair7@yahoo.com");
		driver.findElement(By.id("password-input")).sendKeys("r7_london*");
		driver.findElement(By.id("signin-button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//System.out.println(driver.getTitle());
		new WebDriverWait(driver,20)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='user-name']")));
	//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='user-name']")).isDisplayed());
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("//*[@id='user-name']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='sign-out']")))
		
	    .click().build().perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ls-user-signin']")).isDisplayed());
	}

}
