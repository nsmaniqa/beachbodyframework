
package seleniumdays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DAY3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://www.britishairways.com/travel/home/public/en_us");
WebElement flighttype=driver.findElement(By.id("cabin"));
List<WebElement> flighttypes=flighttype.findElements(By.tagName("option"));
for(int i=0;i<flighttypes.size();i++)
{
	System.out.println(flighttypes.get(i).getText());
}
	}

}
