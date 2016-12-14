package seleniumdays;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_download\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://convertonlinefree.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("MainContent_fu")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\DHAKSHAN\\Desktop\\selenium\\durai.exe");
		driver.findElement(By.xpath("//*[@id='MainContent_btnConvert']")).click();
		tblgblmkt
		tblgblmkt
		
	}

}
