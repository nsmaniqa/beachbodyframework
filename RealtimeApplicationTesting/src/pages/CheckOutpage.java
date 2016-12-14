package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tools.Utility;
import common.TestCaseConfiguration;

public class CheckOutpage extends TestCaseConfiguration{
	
	
	@FindBy(xpath="//input[@name='CCNumber']")
	WebElement creditcard_text;

	@FindBy(xpath="//input[@name='CVV']")
	WebElement cvv2_textbox;
	@FindBy(xpath="//select[@id='CCExp_Month']")
	WebElement cardmonth_dropdownbox;

	@FindBy(xpath="//select[@id='CCExp_Year']")
	WebElement cardyear_dropdownbox;
	@FindBy(xpath="//input[@id='CartAgreeTerms']")
	WebElement termsandcondition_checkbox;
	

	@FindBy(xpath="//button[@id='ProcessButton']")
	WebElement processorder_button;
	@FindBy(xpath="//h1[contains(.,'Checkout')]")
	WebElement checkout_text;
	

	
	
	
	public CheckOutpage ()
	{
		PageFactory.initElements(driver, this);
	}
public void checkoutflow(){
	Utility.waitForAjaxToFinish(10000);
	Utility.isElementPresent(checkout_text, "checkoutext");
	creditcard_text.sendKeys("411111111111111");
	cvv2_textbox.sendKeys("123");
	Select month=new Select(cardmonth_dropdownbox);
	month.selectByIndex(5);
	Select year=new Select( cardyear_dropdownbox);
	year.selectByVisibleText("2020");
	termsandcondition_checkbox.click();
	processorder_button.click();
	
	
}
}
