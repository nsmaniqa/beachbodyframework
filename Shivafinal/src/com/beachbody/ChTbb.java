package com.beachbody;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChTbb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.teambeachbody.com/");
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.elementToBeClickable(By.className("sign-in")));
	driver.findElement(By.className("sign-in")).click();
	driver.findElement(By.id("username")).sendKeys("suchi@gmil.com");
	driver.findElement(By.id("_58_password")).sendKeys("12345");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id='login-container']/form/fieldset/div[3]/span/input")).click();
	//driver.findElement(By.id("signIn")).click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Thread.sleep(10000);
	
	new WebDriverWait(driver,10)
.until(ExpectedConditions.elementToBeClickable(By.className("sign-out")));
	//
	
	
	
	
	
	Assert.assertTrue(driver.findElement(By.className("sign-out")).isDisplayed());
	driver.findElement(By.xpath("//*[@id='navigation']/ul/li[9]/a/span")).click();
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	//driver.findElement(By.xpath("//*[@id='ProductSearch']")).click();
  	driver.findElement(By.id("ProductSearch")).sendKeys("GlassShkrCup");
  	driver.findElement(By.className("SmallButton")).click();
  	new WebDriverWait(driver,10)
  	.until(ExpectedConditions.elementToBeClickable(By.className("AddToCartBottom")));
  	driver.findElement(By.className("AddToCartBottom")).click();
  	new WebDriverWait(driver,10)
  	.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Table1']/tbody/tr[3]/td/button[1]")));
  	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	driver.findElement(By.xpath("//*[@id='Table1']/tbody/tr[3]/td/button[1]")).click();
  	driver.findElement(By.name("CCNumber")).sendKeys("411111111111111111111");
	driver.findElement(By.name("CVV")).sendKeys("123");
	Select month=new Select(driver.findElement(By.id("CCExp_Month")));
	month.selectByIndex(2);
	Select year=new Select(driver.findElement(By.id("CCExp_Year")));
	year.selectByValue("2021");
	driver.findElement(By.id("CartAgreeTerms")).click();
	driver.findElement(By.id("ProcessButton")).click();
	}
	

}
