package seleniumdays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SelniumDay2IEandChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//System.setProperty("webdriver.ie.driver", "C:\\selenium_download\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
//		//WebDriver driver =new InternetExplorerDriver();
//		//System.setProperty("webdriver.ie.driver system property", "C:\\selenium_download\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.gmail.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("durai.me72");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("r7_london*");
		driver.findElement(By.id("signIn")).click();
	}	   	

}
