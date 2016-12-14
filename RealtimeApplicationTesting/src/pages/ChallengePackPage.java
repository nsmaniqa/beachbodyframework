package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.TestCaseConfiguration;

public class ChallengePackPage extends TestCaseConfiguration {
	@FindBy(xpath="//*[@id='csShoppingMenuCategory']/li[2]/ul/li[1]/a")
	WebElement challengepack_submenu ;
	
	public ChallengePackPage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonchallagepacksubmenu(){
		challengepack_submenu.click();
	}
}
