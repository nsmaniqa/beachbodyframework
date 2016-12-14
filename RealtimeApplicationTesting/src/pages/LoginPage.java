package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;

import tools.Utility;
import common.TestCaseConfiguration;

public class LoginPage extends TestCaseConfiguration{
	@FindBy(xpath="//a[@href='/c/portal/login?p_l_id=10305']")
	WebElement signin ;
	@FindBy(xpath="//input[@id='username']")
	WebElement emailtextbox ;

	@FindBy(xpath="//input[@id='_58_password']")
	WebElement passwordtextbox ;
	@FindBy(xpath="//input[@value='Sign In']")
	WebElement signinbutton ;
	@FindBy(xpath="//input[@id='basic_input']")
	WebElement basicmembershipradiobutton ;

	@FindBy(xpath="//input[@value='Sign In']")
	WebElement signupbutton ;
	@FindBy(xpath="//a[@id='mmlink0']")
	WebElement homepage_link  ;
	@FindBy(xpath="//*[@id='userdock-area-1']/div/table/tbody/tr/td[2]/div[1]")
	WebElement userdisplay_name ;
	@FindBy(xpath="//span[@class='portlet-msg-error']")
	WebElement loginerror_message ;
	



	public LoginPage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String username, String password) throws InterruptedException
	{
		//Utility.waitForAjaxToFinish(10000);
		wait.until(ExpectedConditions.elementToBeClickable(signinbutton));
		//wait.untilExpectedConditions.visibilityOf(signinbutton);
		//Utility.isElementPresent(signinbutton, "signin button");
		//emailtextbox.sendKeys("suchi@gmil.com");
		emailtextbox.sendKeys(username);
		//passwordtextbox.sendKeys("12345");
		passwordtextbox.sendKeys(password);
		signinbutton.click();
		Utility.waitForAjaxToFinish(10000);
		if(Utility.isContain("SUCHIAG", userdisplay_name.getText())){
			Reports.log(LogStatus.PASS, "login is successfull");


		}
		else
			Reports.log(LogStatus.FAIL, " login is not successful");
	}


	public void navigatetobasicsignuppage()
	{
		basicmembershipradiobutton.click();
		signupbutton.click();
		homepage_link.click();

	}
public void loginerrorverification(){
	Utility.waitForAjaxToFinish(10000);
	Utility.isElementPresent(signinbutton, "signin button");
	emailtextbox.sendKeys("suchi@gmil.com");
	passwordtextbox.sendKeys("123456");
	signinbutton.click();
	Utility.waitForAjaxToFinish(10000);
	if(Utility.isContain("Sorry, the password you entered does not match ", loginerror_message.getText()))
	{
		Reports.log(LogStatus.PASS, "login error verification pass");
		
			}
	else
		Reports.log(LogStatus.FAIL, "login error verification fail");
	
	
	
	
}
}


