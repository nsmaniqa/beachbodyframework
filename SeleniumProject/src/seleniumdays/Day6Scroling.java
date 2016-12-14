package seleniumdays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//scrolling up and down
public class Day6Scroling {
   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.barnesandnoble.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		// for up scroll
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		//down scroll
		js.executeScript("window.scrollBy(0,-1000)");
		
		}
   }
