package com.beachbody;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testng.basetest;

public class Tbb_ordercreation extends basetest{
	@Test(priority=0,dataProvider="getData")
	public void login(String username, String password){
		
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
	}
//@Test 
//public void searchitem(){
//	driver.findElement(By.xpath("//*[@id='navigation']/ul/li[9]/a/span")).click();
//  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//  	//driver.findElement(By.xpath("//*[@id='csShoppingMenuCategory']/li[5]/a")).click();
//  	driver.findElement(By.id("ProductSearch")).sendKeys("GlassShkrCup");
//  	driver.findElement(By.className("SmallButton")).click();	
//}
//@Test(priority=2)
//public void checkout() throws InterruptedException{
//	Thread.sleep(1000);
//  	driver.findElement(By.className("AddToCartBottom")).click();
//  	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//  	new WebDriverWait(driver,20)
//  	.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Table1']/tbody/tr[3]/td/button[1]")));
//  	driver.findElement(By.xpath("//*[@id='Table1']/tbody/tr[3]/td/button[1]")).click();
//  	driver.findElement(By.name("CCNumber")).sendKeys("411111111111111111111");
//	driver.findElement(By.name("CVV")).sendKeys("123");
//	Select month=new Select(driver.findElement(By.id("CCExp_Month")));
//	month.selectByIndex(2);
//	Select year=new Select(driver.findElement(By.id("CCExp_Year")));
//	year.selectByValue("2021");
//	driver.findElement(By.id("CartAgreeTerms")).click();
//	driver.findElement(By.id("ProcessButton")).click();
//	}
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
