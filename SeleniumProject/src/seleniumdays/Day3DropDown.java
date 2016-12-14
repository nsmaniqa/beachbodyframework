package seleniumdays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		/*driver.get("http://www.britishairways.com/travel/home/public/en_us");
		driver.manage().window().maximize();
	WebElement countrys=driver.findElement(By.id("depCountry"));
	Select country=new Select(countrys);
	country.selectByVisibleText("USA");
	Select country2= new Select(driver.findElement(By.id("from")));
	
	country2.selectByValue("ATL");
	driver.findElement(By.id("journeyTypeOW")).click();
driver.findElement(By.id("planTripFlightDestination")).sendKeys("Chennai, Chennai (MAA), India");*/
		driver.get("https://www.walgreens.com");
		driver.findElement(By.xpath("//a[contains(.,'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='signin-username']")).sendKeys("durai.me72@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dhakshan25");
		driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
 
	
	
		

	}

}
