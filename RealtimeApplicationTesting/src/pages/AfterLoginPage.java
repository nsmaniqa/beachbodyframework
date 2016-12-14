package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import tools.Utility;

public class AfterLoginPage extends LoginPage{
	
	@FindBy(xpath="//*[@id='banner']/div/ul/li[2]/a")
	WebElement signout_button;
	@FindBy(xpath="//a[@id='mmlink0']")
	WebElement homepage_link  ;
	@FindBy(xpath="//a[@href='ShoppingCart.asp?Cat=3-Day Refresh|ALL']")
	//ShoppingCart.asp?Cat=3-Day Refresh|ALL
	//*[@id='article_10137_273921026_1.2']/div/ul/li[6]/a
	
	WebElement threedayrefresh_link  ;

	@FindBy(xpath="//span[contains(.,'Shop')]")
	WebElement shop_menu;


	@FindBy(xpath="//a[contains(.,'Shop All Products')]")
	WebElement allprductshop_menu;
@FindBy(xpath="//a[contains(@href,'US/shop/fitness-programs')]")
	WebElement fitnessprogram_menu;
@FindBy(xpath="//a[contains(@href,'US/eat-smart/supplements/bbp')]")
	WebElement beachbodyperformance_menu;
@FindBy(xpath="//a[contains(@href,'US/shop/shakeology')]")
	WebElement shakeology_menu;
@FindBy(xpath="//a[contains(.,'Shakeology Boost')]")
	WebElement shakeologyboost_menu;
@FindBy(xpath="//*[@id='navigation']/ul/li[9]/ul/li[6]/a")
	WebElement threedayrefresh_menu;
@FindBy(xpath="//*[@id='navigation']/ul/li[9]/ul/li[7]/a")
	WebElement ultimatereset_menu;
@FindBy(xpath="//a[contains(.,'Derm Exclusive®')]")
	WebElement dreamexclisive_menu;
@FindBy(xpath="//*[@id='navigation']/ul/li[9]/ul/li[9]/a")
	WebElement nutrionandsupplement_menu;
	
	@FindBy(xpath="//a[contains(.,'Apparel & Accessories')]")
	WebElement apparelandaccessories_menu;
	@FindBy(xpath="//*[@id='navigation']/ul/li[9]/ul/li[10]/a")
	WebElement apparelandaccessories_heading;
	
	
	
	public AfterLoginPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
		
	
	public void clicksignoutbutton(){
		signout_button.click();
	}
	
	
public void clickonthreedayrefreshmenu(){
	Utility.explicitlyWait(20000);
	threedayrefresh_link.click();
}
public void clickonshopmenu(){
	shop_menu.click();
	//driver.getTitle();
	
	if(Utility.isEqual("Team Beachbody - Home",driver.getTitle())){
		Reports.log(LogStatus.PASS, "shop page title is matching");
	}
	else
		Reports.log(LogStatus.FAIL, "shop page title is not matching");
	}

	
		public void clickonapprallandacc(){
			
			Utility.explicitlyWait(10000);
			Actions act=new Actions(driver);
			
			
			act.moveToElement(shop_menu).moveToElement(apparelandaccessories_menu).click().build().perform();
			Utility.waitForAjaxToFinish(10000);
			if(Utility.isContain("Beachbody Apparel", apparelandaccessories_heading.getText())){
				Reports.log(LogStatus.PASS, "Appareal heading is displayed");
			}
			else
				Reports.log(LogStatus.FAIL, "Appareal heading is not displayed");
		}
		
		
	
	
}

