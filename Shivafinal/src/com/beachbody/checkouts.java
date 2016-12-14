package com.beachbody;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.testng.basetest;

public class checkouts extends basetest {
	@Test(priority=2)
	public void checkout() throws InterruptedException{
		Thread.sleep(1000);
	  	driver.findElement(By.className("AddToCartBottom")).click();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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


