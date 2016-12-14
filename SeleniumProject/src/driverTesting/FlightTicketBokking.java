package driverTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightTicketBokking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.carltonleisure.com/travel/flights/");
driver.findElement(By.id("FlightSearchEngine1_drpAdults"));
Select adult= new Select(driver.findElement(By.id("FlightSearchEngine1_drpAdults")));
	}

}
