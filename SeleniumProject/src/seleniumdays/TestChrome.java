package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("durai.me72@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys("r7_london*");
		driver.findElement(By.id("signIn")).click();
		
	}

}
