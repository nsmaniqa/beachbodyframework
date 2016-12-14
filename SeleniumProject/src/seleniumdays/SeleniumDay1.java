package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDay1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//WebDriver driver=new FirefoxDriver();

WebDriver driver=new FirefoxDriver();
driver.get("http://www.gmail.com/");
//driver.quit();
driver.findElement(By.id("Email")).sendKeys("durai.me72");
driver.findElement(By.id("next")).click();
Thread.sleep(10000);
driver.findElement(By.id("Passwd")).sendKeys("r7_london*");

driver.findElement(By.id("signIn")).click();
driver.manage().window().maximize();
Thread.sleep(10000);
driver.findElement(By.className("gbii")).click();
driver.findElement(By.id("gb_71")).click();
driver.quit();
	}
	

	
}
