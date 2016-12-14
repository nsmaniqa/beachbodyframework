import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tnstc.in/");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[3]/td/a/img")).click();
		Set <String> id=driver.getWindowHandles();
		Iterator <String> itr =id.iterator();
		while(itr.hasNext())
		{
			String handle=itr.next();
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if(driver.getTitle().equalsIgnoreCase("TNSTC."))
			{
				driver.findElement(By.name("txtUserLoginID")).sendKeys("durair7");
				driver.findElement(By.name("txtPassword")).sendKeys("ramya7");
				Thread.sleep(10000);
				driver.findElement(By.className("dboxheader")).click();
			}
			driver.findElement(By.xpath("html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[5]/td[2]/a")).click();
			
			driver.close();
		}
	
	}

}
