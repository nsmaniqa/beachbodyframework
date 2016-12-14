package driverTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScroinngDownandUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.groupon.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)");
js.executeScript("window.scrollBy(0,1000)");

	}

}
