package driverTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("https://www.yahoo.com/");
Thread.sleep(5000);
WebElement sport=driver.findElement(By.id("uh-signin"));
Actions rightclick=new Actions(driver);
rightclick.moveToElement(sport).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}