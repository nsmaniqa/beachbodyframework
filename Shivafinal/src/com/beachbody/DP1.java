package com.beachbody;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP1 extends basetest1  {
	
	@Test(priority=0,dataProvider="getData")
	public void loginTest(String username, String password){
	
		
		driver.findElement(By.className("sign-in")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("_58_password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='login-container']/form/fieldset/div[3]/span/input")).click();
		//driver.findElement(By.id("signIn")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		
  	new WebDriverWait(driver,10)
.until(ExpectedConditions.elementToBeClickable(By.className("sign-out")));
  	Assert.assertTrue(driver.findElement(By.className("sign-out")).isDisplayed());
  	driver.findElement(By.className("sign-out")).click();
	
	
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0] ="suchi@gmil.com";
		data[0][1] = "12345";

		// 2nd row
		data[1][0] ="tbbwebopsclub@beachbodytest.com";
		data[1][1] = "woclub";

		// 3rd row
		data[2][0] ="tbbwocoach@beachbodytest.com";
		data[2][1] = "wocoach";

		return data;
}
}