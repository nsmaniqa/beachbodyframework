package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions obj=new Actions(driver);
		obj.keyDown(Keys.CONTROL)
		.click(driver.findElement(By.xpath("//*[@id='selectable']/li[1]")))
		.click(driver.findElement(By.xpath("//*[@id='selectable']/li[2]")))
		.click(driver.findElement(By.xpath("//*[@id='selectable']/li[3]")))
		.keyUp(Keys.CONTROL)
		.build().perform();
		
	}

}
