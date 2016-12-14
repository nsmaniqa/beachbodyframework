package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.ChallengePackPage;
import pages.HomePage;
import pages.ShopPage;
import common.TestCaseConfiguration;

public class ChallengePackTestcase extends TestCaseConfiguration{
	

	ShopPage oShopPage;
	ChallengePackPage oChallengePackPage;
	@Test
	public void clickonchallengepacksubmenu() throws InterruptedException{
		Reports.startTest("ChallengePackTestcase");
		
		Reports.log(LogStatus.PASS, "user naviagated to homepage successfully");
		oHomePage.clickonshopmenu();
		Reports.log(LogStatus.PASS, "user naviagated to shopmenu successfully");
		Thread.sleep(10000);
		oShopPage=new ShopPage();
		oShopPage.clickonchallengepacksmenu();
		oChallengePackPage=new ChallengePackPage();
		oChallengePackPage.clickonchallagepacksubmenu();
		Reports.endTest();
		
	}

}
