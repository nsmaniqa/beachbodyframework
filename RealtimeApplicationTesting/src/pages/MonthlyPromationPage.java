package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.TestCaseConfiguration;

public class MonthlyPromationPage extends TestCaseConfiguration {
	
	@FindBy(xpath="//*[@id='csShoppingMenuCategory']/li[1]/ul/li[1]/a")
	WebElement julypromotin_submenu ;
	@FindBy(xpath="//input[@id='username']")
	WebElement emailtextbox ;
	
	@FindBy(xpath="//a[@id='mmlink0']")
	WebElement homepage_link  ;
	
	
	public MonthlyPromationPage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonjulypromotionsubmenu()
	{
	julypromotin_submenu.click();
	homepage_link.click();
	
		}

}

