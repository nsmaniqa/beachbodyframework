package seleniumdays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Wallmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.groupon.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.id("ls-user-signin")).click();	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.id("email-input")).sendKeys("durair7@yahoo.com");
driver.findElement(By.id("password-input")).sendKeys("r7_london*");
driver.findElement(By.id("signin-button")).click();
//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
Actions obj=new Actions(driver);
//obj.moveToElement(driver.findElement(By.id("user-name"))).moveToElement(By.id("sign-out")).click().build().perfom();
obj.moveToElement(driver.findElement(By.id("user-name"))).moveToElement(driver.findElement(By.id("sign-out"))).click().build().perform();
	}

}
