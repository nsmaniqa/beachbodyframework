package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Configuration;

public class HomePage extends Configuration{
	
	@FindBy (xpath=("//a[contains(@href,'/c/portal/login?p_l_id=10305')]"))
	WebElement signin_Button;
	
	
	
	/*	
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}*/
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public void clickonsigninbutton(){
		signin_Button.click();
	}
	public void framecount(){
		System.out.println( driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
	}

}
