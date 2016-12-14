package seleniumdays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Setc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.tnstc.in/TNSTCOnline/");
//driver.findElement(By.xpath("html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[3]/td/a/img")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("txtUserLoginID")).sendKeys("durair7");
driver.findElement(By.name("txtPassword")).sendKeys("ramya7");
driver.findElement(By.className("dboxheader")).click();
driver.findElement(By.id("matchStartPlace")).sendKeys("TRICHY");
driver.findElement(By.id("matchEndPlace")).sendKeys("CHENNAI CMBT");
WebElement startloc= driver.findElement(By.id("selectOnwardTimeSlab"));

List<WebElement> all=startloc.findElements(By.tagName("option"));
for(int i=0;i<all.size();i++)
{
	System.out.println(all.get(i).getText());
}
	}

}
