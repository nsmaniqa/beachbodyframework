package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GrouponDataProvider extends Grouponbase1Test  {
	
	@Test(priority=0,enabled=true,dataProvider="getdata") 
	public void login(String username,String password)
	{
		 
		driver.findElement(By.id("ls-user-signin")).click();
		driver.findElement(By.id("email-input")).sendKeys(username);
		driver.findElement(By.id("password-input")).sendKeys(password);
		driver.findElement(By.id("signin-button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.id("search")).sendKeys("Tv stand");
		//driver.findElement(By.id("ls-header-search-button")).click();
		
		//System.out.println(driver.getTitle());
		new WebDriverWait(driver,20)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='user-name']")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='user-name']")).isDisplayed());
	
	}
	@DataProvider
	public Object [] [] getdata()
	{
		Object data[][]= new Object [3][2];
		data[0][0]="durair7@yahoo.com";
		data[0][1]="r7_london*";
		data[1][0]="fdffdsdzfg";
		data[1][1]="rx7_london*";
		data[2][0]="r*";
		data[2][1]="r7_london*";
		return data;
		
	}
}
