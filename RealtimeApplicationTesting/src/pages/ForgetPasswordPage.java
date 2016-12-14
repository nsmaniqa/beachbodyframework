package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tools.Utility;
import common.TestCaseConfiguration;

public class ForgetPasswordPage extends TestCaseConfiguration {
	@FindBy(xpath="//*[@id='banner']/div/ul/li[2]/a")
	WebElement signin ;
	
	@FindBy(xpath="//a[contains(.,'Forgot your password?')]")
	WebElement forgetpasswordlink ;
	@FindBy(xpath="//input[@name='_58_emailAddress']")
	WebElement forgetpassword_emailtext ;
	@FindBy(xpath="//input[contains(@name,'captchaText')]")
	WebElement captchatext ;
	@FindBy(xpath="//input[@value='Send New Password']")
	WebElement sendnewpassword_link ;
	
	
	
	@FindBy(xpath="//input[@value='Sign Up']")
	WebElement signup_link ;
	@FindBy(xpath="//a[contains(.,'View Member Benefits')]")
	WebElement success_mesasge ;

	
	
	
	
	public ForgetPasswordPage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void forgetpasswordlink() throws InterruptedException{
		signin.click();
		Utility.isElementPresent(signup_link, "signup link");
		forgetpasswordlink.click();
		Utility.isElementPresent(sendnewpassword_link, "send new password link");
		forgetpassword_emailtext.sendKeys("dhakshan@yopmail.com");
		Thread.sleep(20000);
		captchatext.sendKeys("");
		sendnewpassword_link.click();
		Utility.isElementPresent(success_mesasge, "Your request processed successfully. ");
		signin.click();
		
		
	}
	
	

}
