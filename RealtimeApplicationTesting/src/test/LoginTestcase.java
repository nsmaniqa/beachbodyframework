package test;

import org.testng.annotations.Test;

import pages.AfterLoginPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MonthlyPromationPage;
import pages.ShopPage;
import pages.SignUpPage;
import common.TestCaseConfiguration;

public class LoginTestcase extends TestCaseConfiguration {

LoginPage oLoginPage;
AfterLoginPage oAfterLoginPage;
SignUpPage oSignUpPage;
ShopPage oShopPage;
MonthlyPromationPage oMonthlyPromationPage;
	@Test(enabled=true,priority=0)
public void loginVerify () throws InterruptedException
{
		Reports.startTest("login verification");
	
		oHomePage.clicksigninlink();
	oLoginPage=new LoginPage();
	oLoginPage.login(excelDict.get("username"),excelDict.get("password"));
	
	Reports.endTest();
	
	
}
	@Test(enabled=false,priority=1)
	public void logoutVerication()
	{
		oAfterLoginPage=new AfterLoginPage();
	oAfterLoginPage.clicksignoutbutton();	
	}
@Test (enabled=false,priority=2)
public void Verification() throws InterruptedException

{
	Thread.sleep(10000);
	
	oHomePage.clicksigninlink();
	oLoginPage=new LoginPage();
	oLoginPage.navigatetobasicsignuppage();
	oSignUpPage=new SignUpPage();
	oSignUpPage.Screennameavilability();
	
	
	
	
}
@Test(enabled=false,priority=3)
public void monthlyPromotionpageVerification() throws InterruptedException{
	
	
	Thread.sleep(10000);
	oHomePage.clickonshopmenu();	
	Thread.sleep(10000);
	oShopPage=new ShopPage();
	
	oShopPage.clickonmonthlypromotionmenu();
	oMonthlyPromationPage=new MonthlyPromationPage();
	Thread.sleep(10000);
	oMonthlyPromationPage.clickonjulypromotionsubmenu();

}

}

