package driverTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HowtoCheckRTextIsHighlighted {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.barnesandnoble.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		
		
		driver.findElement(By.id("createAccountBtn")).click();
		String color=driver.findElement(By.xpath("//*[@id='createAccountForm']/fieldset/label[7]/div/a/span[1]")).getCssValue("color");
		 String backcolor = driver.findElement(By.xpath("//*[@id='createAccountForm']/fieldset/label[7]/div/a/span[1]")).getCssValue("background-color");
		 
		 System.out.println(color);
		 
		 System.out.println(backcolor);


	}

}
