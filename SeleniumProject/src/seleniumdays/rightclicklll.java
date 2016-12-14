package seleniumdays;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclicklll {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com&#8221");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.id("gb_70");
		
	}

}
