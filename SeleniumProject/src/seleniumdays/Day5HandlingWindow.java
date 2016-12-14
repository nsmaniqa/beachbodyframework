package seleniumdays;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://www.indeed.com/q-Manual-Testing-l-Chattanooga,-TN-jobs.html");
driver.manage().window().maximize();
//String Pareentwindow=driver.getWindowHandle();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("sja3")).click();
driver.findElement(By.id("sja2")).click();
driver.findElement(By.id("sja1")).click();
Set <String> uniqueid=driver.getWindowHandles();
Iterator <String>itr=uniqueid.iterator();
while(itr.hasNext())
{
	
	String handle=itr.next();
	driver.switchTo().window(handle);
	System.out.println(handle);
	System.out.println(driver.getTitle());
	
	if(driver.getTitle().equalsIgnoreCase("Healthcare Professional Careers | Symphony Corporation"))
	{
		driver.findElement(By.xpath("//*[@id='left_area']/article/div/div/div/div[2]/p[2]/a")).click();
	}
//	driver.close();
}



	}

}
