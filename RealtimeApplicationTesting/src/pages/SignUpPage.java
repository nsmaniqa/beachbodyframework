package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.TestCaseConfiguration;

public class SignUpPage extends TestCaseConfiguration {
	
	
@FindBy(id="loginForm.firstName")
	WebElement firstname_textbox ;


@FindBy(xpath="//input[@id='loginForm.lastName']")
	WebElement lastname_textbox ;


@FindBy(xpath="//input[@id='emailForm.email']")
	WebElement email_textbox ;


@FindBy(xpath="//input[@id='emailForm.confirmEmail']")
	WebElement confirmemail_textbox ;


@FindBy(xpath="//input[@id='<portlet:namespace />password']")
	WebElement password_textbox ;



@FindBy(xpath="//input[@id='<portlet:namespace />confirmPassword2']")
	WebElement confirmpassword_textbox ;


@FindBy(xpath="//input[@id='screenName']")
	WebElement screenname_textbox ;


@FindBy(xpath="//span[contains(.,'Check Availability')]")
	WebElement checkavilability_button ;

@FindBy(xpath="//select[@id='_TBBSIGNUP_WAR_signuprefactorportlet_birthdayMonth']")
	WebElement dateofbirth_month_dropdownbox;
@FindBy(xpath="//select[@id='_TBBSIGNUP_WAR_signuprefactorportlet_birthdayDay']")
WebElement dateofbirth_date_dropdownbox;
@FindBy(xpath="//select[@id='_TBBSIGNUP_WAR_signuprefactorportlet_birthdayYear']")
WebElement dateofbirth_year_dropdownbox;

@FindBy(xpath="//select[@id='gender']")
WebElement gender_dropdownbox;


@FindBy(xpath="//input[@id='phone']")
	WebElement phone_textbox ;

@FindBy(id="shippingAddressForm.street1")  
	WebElement address_texbox ;


@FindBy(xpath="//input[@id='shippingAddressForm.street2']")
	WebElement apt_textbox ;


@FindBy(xpath="//input[@id='shippingAddressForm.city']")
	WebElement city_textbox;
@FindBy(xpath="//select[@id='addressRegionId']")
WebElement state_dropdownbox;

@FindBy(xpath="//select[@id='addressCountryId']")
WebElement country_dropdownbox;

@FindBy(xpath="//input[@id='shippingAddressForm.postalCode']")
WebElement zipcode_textbox;


@FindBy(xpath="//input[@id='defaultCoach']")
WebElement coach_radiobutton;
@FindBy(xpath="//input[@id='termsAndConditionsForm.termsAndConditionsAgree1']")
WebElement termsandcontion_checkbox;
@FindBy(xpath="//input[@id='free_submit']")
WebElement signupsubmit_button;
@FindBy(xpath="//a[@id='mmlink0']")
WebElement homepage_link  ;



public SignUpPage ()
{
	PageFactory.initElements(driver, this);
}
public void Screennameavilability() throws InterruptedException
{
	firstname_textbox.sendKeys("durai");
	lastname_textbox.sendKeys("mani");
	email_textbox.sendKeys("kabali@yopmail.com");
	confirmemail_textbox.sendKeys("kabali@yopmail.com");
	password_textbox.sendKeys("12345");
	confirmpassword_textbox.sendKeys("12345");
	screenname_textbox.sendKeys("suchiag");
	checkavilability_button.click();
	Select month=new Select(dateofbirth_month_dropdownbox);
	month.selectByVisibleText("May");
	Select date=new Select(dateofbirth_date_dropdownbox);
	date.selectByVisibleText("10");
	Select year=new Select(dateofbirth_year_dropdownbox);
	year.selectByVisibleText("1980");
	Select gender=new Select(gender_dropdownbox);
	gender.selectByVisibleText("Male");
	phone_textbox.sendKeys("4233167863");
	Thread.sleep(10000);
	address_texbox.sendKeys("pembrooklane");
	apt_textbox.sendKeys("226");
	city_textbox.sendKeys("chattanooga");
	Select state=new Select(state_dropdownbox);
	state.selectByVisibleText("Tennessee");
	Select country=new Select(country_dropdownbox);
	country.selectByVisibleText("United States");
	zipcode_textbox.sendKeys("37421");
	coach_radiobutton.click();
	termsandcontion_checkbox.click();
	Thread.sleep(10000);
	signupsubmit_button.click();
	homepage_link.click();
	
	
}

	

	

}
