package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin extends BaseTest {
	@Test(priority=0,dataProvider="getData")
	public void loginTest(String username,String password) {
		//driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys(password);
		driver.findElement(By.id("signIn")).click();
   	new WebDriverWait(driver,10)
	.until(ExpectedConditions.elementToBeClickable(By.className("gbii")));
		Assert.assertTrue(driver.getTitle().contains(username),"Home Page titile verification failed");
	}
	
	@Test(priority=1)
	public void verifyCreateAccountLink()
	{
		driver.findElement(By.id("link-signup")).click();
	}
	
	@Test(priority=2)
	public void verifyNeedHelpLink()
	{
		driver.findElement(By.id("link-forgot-passwd")).click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data =new Object[3][2];
		data[0][0]="durai.me72@gmail.com";
		data[0][1]="r7_london*";	
		data[1][0]="durai";
		data[1][2]="r7_london*";
		data[2][0]="durai.me72@gmail.com";
		data[2][1]="r7london*";
		return data;
	}
	
}
