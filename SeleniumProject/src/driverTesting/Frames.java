package driverTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.barnesandnoble.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(2000);
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		System.out.println(frameList.size());
		


	}

}
