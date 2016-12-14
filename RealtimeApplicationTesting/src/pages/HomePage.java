package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tools.Utility;
import common.TestCaseConfiguration;

public class HomePage extends TestCaseConfiguration {
	
	@FindBy(xpath="//span[contains(.,'Shop')]")
	WebElement shop_menu;
	
	@FindBy(xpath="//span[contains(.,'Beachbody On Demand')]")
	WebElement beachbodyondemand_menu;
	@FindBy(xpath="//span[contains(.,'Get Fit')]")
	WebElement getfit_menu;
	@FindBy(xpath="//span[contains(.,'Eat Smart')]")
	WebElement eatsmart_menu;
	@FindBy(xpath="//a[@href='http://www.teambeachbody.com/connect']")
	WebElement connect_menu;
	@FindBy(xpath="//a[@href='http://www.teambeachbody.com/watch']")
	WebElement video_menu;
	@FindBy(xpath="//span[contains(.,'Beachbody Challenge')]")
	WebElement beachbodychallenge_menu;
	@FindBy(xpath="//a[contains(.,'Take the Challenge')]")
	WebElement takethechallenge_menu;
	@FindBy(xpath="//a[contains(.,'Challenge Packs')]")
	WebElement challengepacks_menu;
	@FindBy(xpath="//a[contains(.,'Challenge Contest')]")
	WebElement challengecontest_menu;
	@FindBy(xpath="//a[contains(.,'Shop All Products')]")
	WebElement shopallproducts_menu;
	@FindBy(xpath="//a[@href='http://www.teambeachbody.com/shop/fitness-programs']")
	WebElement shop_fitnessprogram_menu;
	@FindBy(xpath="//a[contains(@href,'http://www.teambeachbody.com/eat-smart/supplements/bbp')]")
	WebElement shop_beachbodyperformance_menu;
	@FindBy(xpath="//a[@href='http://www.teambeachbody.com/shop/shakeology']")
	WebElement shop_shakeology_menu;
	@FindBy(xpath="//a[contains(.,'Shakeology Boost')]")
	WebElement shop_shakeologyboost_menu;
	@FindBy(xpath="//a[contains(@href,'http://www.teambeachbody.com/cleanse-program/3-day-refresh-diet')]")
	WebElement shop_3dayrefresh_menu;
	@FindBy(xpath="//a[@href='http://www.teambeachbody.com/cleanse-program/ultimate-reset']")
	WebElement shop_ultimaterest_menu;
	@FindBy(xpath="//a[contains(.,'Derm Exclusive®')]")
	WebElement shop_dreamexcusive_menu;
	@FindBy(xpath="//a[@href='http://www.teambeachbody.com/shop/supplements']")
	WebElement shop_nutrition_supplement_menu;
	@FindBy(xpath="//a[contains(.,'Apparel & Accessories')]")
	WebElement shop_apparelandaccessories_menu;
	@FindBy(xpath="//a[@href='/en_US/signup']")
	WebElement notamember ;
	@FindBy(xpath="//*[@id='banner']/div/ul/li[2]/a")
	WebElement signin ;
	
	
	@FindBy(xpath="//a[contains(.,'Help/FAQs')]")
	WebElement helpfaq;
	@FindBy(xpath="//a[@href='/home']")
	WebElement home;
	
	@FindBy(xpath="//a[contains(.,'	Team Beachbody			')]")
	WebElement teambeachbody_logo;
	@FindBy(xpath="//a[contains(.,'	En español	')]")
	WebElement enespanol;
	@FindBy(xpath="//span[@class='fb_button_text']")
	WebElement facebook_sigin;
	@FindBy(xpath="//button[@id='u_0_2']")
	WebElement facebooklike;
	@FindBy(xpath="//input[@name='search']")
	WebElement searchhere_textbox;
	@FindBy(xpath="//input[contains(@value,'Search')]")
	WebElement search_button;
	@FindBy(xpath="//a[@href='/tbbsignup/-/tbbsignup/club']")
	WebElement jointheclub_menu;

	@FindBy(xpath="//a[@href='http://club.teambeachbody.com/']")
	WebElement beachbodyondemand_mainmenu;
	@FindBy(xpath="//a[@href='/cleanse-program/3-day-refresh-diet']")
	WebElement dayrefesh_mainmenu;
	@FindBy(xpath="//a[@href='/cleanse-program/ultimate-reset']")
	WebElement ultimatereset_mainmenu;
	@FindBy(xpath="//a[@class='nowrap']")
	WebElement beachbodychallenge_mainmenu;
	@FindBy(xpath="//a[@href='/get-fit/fitness-programs']")
	WebElement fitnessprogram_mainmenu;
	@FindBy(xpath="//a[@href='/get-fit/supergym']")
	WebElement supergym_menu;

@FindBy(xpath="//input[@id='submit_button']")
	WebElement signupbutton ;
@FindBy(xpath="//a[contains(.,'Sign Out')]")
WebElement signout_button ;
@FindBy(xpath="//*[@id='userdock-area-1']/div/table/tbody/tr/td[2]/div[1]")
WebElement userdisplay_name ;


	
	
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicksigninlink(){
	//	signupbutton.click();
		signin.click();
		
	}
	public void clickonshopmenu(){
		Utility.isElementPresent(signout_button, "signout button");
		shop_menu.click();
	}
	
	
	

	


	
	
	

	


		

	
	
	
	
	
	
}
