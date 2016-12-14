package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.TestCaseConfiguration;

public class ThreeDayRefreshAddCart extends TestCaseConfiguration{
	
	@FindBy(xpath="//*[@id='1462171_AddToCardTD']/a/span")
	WebElement addcart_button ;
	
	
	
	
	public ThreeDayRefreshAddCart ()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonaddcartmenu(){
		addcart_button.click();
		

}
	
}
