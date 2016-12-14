package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://nisum.com/");
		driver.manage().window().maximize();
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("//*[@id='mainNav']/li[1]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='mainNav']/li[1]/ul/li[2]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='mainNav']/li[1]/ul/li[2]/ul/li[1]/a")))
	    .click().build().perform();
	}}
