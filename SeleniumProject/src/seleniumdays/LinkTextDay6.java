package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextDay6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.blsindia-usa.com/passport/index.php");
		driver.findElement(By.linkText("Click here to Close")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/table/tbody/tr/td/ul/li[10]/a")).click();
	}

}
