package seleniumdays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pagesource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.teambeachbody.com/en_US/");
		driver.manage().window().maximize();
		driver.findElement(By.className("sign-in")).click();
		//driver.findElement(By.id("username")).sendKeys("suchi@gmil.com");
		//driver.findElement(By.id("_58_password")).sendKeys("12345");
		//driver.findElement(By.xpath("//*[@id='login-container']/form/fieldset/div[3]/span/input")).click();
		//driver.findElement(By.id("signIn")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.getPageSource());
		driver.getTitle()
		driver.getCurrentUrl()
	}

}
