package driverTesting;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingcombobox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.barnesandnoble.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("signInLink")).click();
	driver.findElement(By.xpath("//*[@id='signInLink']/b")).click();
	Thread.sleep(200000);
//		
	driver.switchTo().frame(3);
	
	driver.findElement(By.id("createAccountBtn")).click();
	

	}

}
