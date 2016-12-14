package seleniumdays;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com/");
		//driver.quit();
		driver.findElement(By.id("Email")).sendKeys("durai.me72");
		driver.findElement(By.id("next")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("Passwd")).sendKeys("r17_london*");
		driver.findElement(By.id("signIn")).click();
		driver.manage().window().maximize();
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("C:\\Users\\DHAKSHAN\\Desktop\\New folder\\gmail.jpg"));
	}

}
