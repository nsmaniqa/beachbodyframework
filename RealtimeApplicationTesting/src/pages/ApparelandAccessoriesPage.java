package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tools.Utility;

import com.relevantcodes.extentreports.LogStatus;

import common.TestCaseConfiguration;

public class ApparelandAccessoriesPage extends TestCaseConfiguration{
	
	@FindBy(xpath="//a[@id='mens']")
	
			WebElement mensapparellink;
	@FindBy(xpath="//h1[contains(.,'Shop')]")
	WebElement shopheading_text;
	
	public ApparelandAccessoriesPage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonmensapparellink(){
		Utility.explicitlyWait(10000);
		mensapparellink.click();
		Utility.waitForAjaxToFinish(10000);
		if(Utility.isContain("Shop", shopheading_text.getText())){
			Reports.log(LogStatus.PASS, "Appareal heading is displayed");
		}
		else
			Reports.log(LogStatus.FAIL, "Appareal heading is not displayed");
	}
	}


