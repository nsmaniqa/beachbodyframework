package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import bsh.UtilTargetError;

import com.relevantcodes.extentreports.LogStatus;

import tools.Utility;
import common.TestCaseConfiguration;

public class ShopPage extends TestCaseConfiguration{
	@FindBy(xpath="//a[@href='ShoppingCart.asp?Cat=Monthly Promotions|ALL']")
	WebElement monthlypromotion_menu ;
	@FindBy(xpath="//*[@id='csShoppingMenuCategory']/li[2]/a")
	WebElement challengepacks_menu  ;
	@FindBy(xpath="//a[@id='mmlink0']")
	WebElement homepage_link  ;
	@FindBy(xpath="//input[@id='ProductSearch']")
	WebElement search_textbox  ;
	@FindBy(xpath="//button[contains(.,'Search')]")
	WebElement search_buttoninshoppage  ;
	@FindBy(xpath="//*[@id='Table1']/tbody/tr[3]/td/button[1]")
	//@FindBy(className="SmallButton")
	
	WebElement checkout_buttoninshoppage  ;
	@FindBy(xpath="//*[@id='Table1']/tbody/tr[3]/td/button[2]")
	WebElement emptycart;
	@FindBy(className="AddToCartBottom")
	WebElement addtocart_buttoninshoppage  ;
	@FindBy(xpath="//button[contains(.,'Check Balance')]")
	WebElement checkbalance_button  ;
	
	@FindBy(xpath="//button[@id='btnClearBilling']")
	WebElement clearbilling_button  ;
	@FindBys({@FindBy(xpath="//td[@class='ItemDesc']")})
	List<WebElement> productlist;
	@FindBy(xpath="//*[@id='productCatContent']/table/tbody/tr[43]/td[1]/span[2]")
	WebElement ultimatepack_21dayprice ;
	@FindBy(xpath="//span[contains(.,'View Details')]")
	WebElement viewdetail_link ;
	@FindBy(xpath="//*[@id='593790_AddToCardTD']/a/span")
	WebElement addtocartfor_21dayultimatedvdpack ;
	@FindBy(xpath="//*[@id='productCatContent']/table/tbody/tr[52]/td[1]/span[2]")
	WebElement ultimatedvdpack_price;
	
	
	
	
	
	
	
	public ShopPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonchallengepacksmenu(){
		challengepacks_menu.click();
	}
public void clickonmonthlypromotionmenu(){
	monthlypromotion_menu.click();
}
public void clickonhompelink(){
	homepage_link.click();
	
	
	
}

public void clickonshoppagesearchbutton() throws InterruptedException, IOException{
	Utility.waitForAjaxToFinish(10000);
	
	search_textbox.sendKeys("21d");
	Utility.Screenshotnshot("C:/src1/src1scren1.png");
	//BBPEnergize
	search_buttoninshoppage.click();
	Utility.waitForAjaxToFinish(10000);

System.out.println(productlist.size());
for(int i=0;i<productlist.size();i++)
{
	System.out.println(productlist.get(i).getText());
	
}

//21 Day Fix Plyo Fix DVD

for (int i=0 ; i<productlist.size();i++)
{
	
	String sProductXpath=".//*[@id='productCatContent']/table/tbody/tr[" +((9*i)+3) +"]/td[2]";
	
	String sPriceXpath=".//*[@id='productCatContent']/table/tbody/tr[" +((9*i)+7) +"]/td[1]";
	String btnAddToCart=".//*[@id='productCatContent']/table/tbody/tr[" +((9*i)+8) +"]/td[1]/a/span";
	
	if(driver.findElement(By.xpath(sProductXpath)).getText().contains("21 Day Fix Plyo Fix DVD"))
	{
		System.out.println("price of item is" + driver.findElement(By.xpath(sPriceXpath)).getText() );
		Utility.isContain("19.95", driver.findElement(By.xpath(sPriceXpath)).getText());
		driver.findElement(By.xpath(btnAddToCart)).click();
		break;
	}
	

	
}
//wait.until(ExpectedConditions.elementToBeClickable(emptycart));
//checkout_buttoninshoppage.click();
/*if(Utility.isEqual("$119.70USD", ultimatepack_21dayprice.getText()))
{
	Reports.log(LogStatus.PASS, " 21 day ultimate price is matching");
	
}
else
	Reports.log(LogStatus.FAIL, " 21 day ultimate price is matching");
Utility.waitForAjaxToFinish(10000);*/




	
/*	addtocart_buttoninshoppage.click();
	Thread.sleep(10000);
	checkout_buttoninshoppage.click();
	Utility.waitForAjaxToFinish(10000);
	if(Utility.isElementPresent(clearbilling_button, "clear billing button is avilable"))
	{
		Reports.log(LogStatus.PASS, "bill clear button is avilable");
	}
	else
		Reports.log(LogStatus.FAIL, "bill clear button is not avilable");*/
	
	//addtocartfor_21dayultimatedvdpack.click();
}
public void clickoncheckoutbutton() throws InterruptedException{
	//wait.until(ExpectedConditions.elementToBeClickable(emptycart));
	checkout_buttoninshoppage.click();
}

public void priceofproduct(){
	

Utility.waitForAjaxToFinish(10000);
}
}
