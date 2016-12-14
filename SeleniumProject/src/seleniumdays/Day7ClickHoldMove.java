-iumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7ClickHoldMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		//driver.get("http://draggabilly.desandro.com/");
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.className("demo__positioner")));
		Actions obj=new Actions(driver);
		obj.clickAndHold(driver.findElement(By.id("draggable")))
		.moveByOffset(100,200).release()
		.build().perform();
	//driver.switchTo().defaultContent();
		}}
