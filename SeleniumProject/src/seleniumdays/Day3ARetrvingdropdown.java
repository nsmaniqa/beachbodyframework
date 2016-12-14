package seleniumdays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3ARetrvingdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.britishairways.com/travel/home/public/en_us");
//WebElement country1=driver.findElement(By.id("depCountry"));
//WebElement countrys=driver.findElement(By.id("depCountry"));

//List <WebElement> country=driver.findElements(By.tagName("option"));
//for(int i=0;i<country.size();i++)
//{
//System.out.println(country.get(i).getText());

//}
WebElement flighttype=driver.findElement(By.id("cabin"));
List <WebElement> flighttypes=flighttype.findElements(By.tagName("option"));

for(int j=0;j<flighttypes.size();j++)
{
	System.out.println(flighttypes.get(j).getText());
}
	
	

	}

}
