package seleniumdays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tnstc.in/TNSTCOnline/");
driver.findElement(By.className("dboxheader")).click();
Alert a1=driver.switchTo().alert();
System.out.println(a1.getText());
a1.accept();
	}

}
