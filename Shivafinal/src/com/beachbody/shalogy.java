package com.beachbody;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testng.basetest;

public class shalogy extends basetest{
	@Test
	public void shkalogyboost(){
		driver.findElement(By.xpath("//*[@id='navigation']/ul/li[9]/a/span")).click();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
		driver.findElement(By.xpath("//*[@id='csShoppingMenuCategory']/li[6]/a")).click();
		
	}

}
