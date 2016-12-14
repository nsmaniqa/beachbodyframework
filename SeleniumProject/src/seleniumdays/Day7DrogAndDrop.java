package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7DrogAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions obj= new Actions(driver);
		//obj.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable")))
//.release()
//.build().perform();
		obj.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
	.build().perform();
	}
	

}
