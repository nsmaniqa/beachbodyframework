package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.AfterLoginPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ShopPage;
import pages.ThreeDayRefreshAddCart;
import common.TestCaseConfiguration;

public class ThreeDayRefreshTestcase extends TestCaseConfiguration{
	ShopPage oShopPage;
LoginPage oLoginPage;
AfterLoginPage oAfterLoginPage;
ThreeDayRefreshAddCart oThreeDayRefreshAddCart;
@Test
public  void addcartVerification() throws InterruptedException{
	oHomePage.clicksigninlink();
	oLoginPage=new LoginPage();
	oLoginPage.login();
	oShopPage=new ShopPage();
	//oHomePage.clickonshopmenu();
	oAfterLoginPage=new AfterLoginPage();
	oAfterLoginPage.clickonshopmenu();
	oAfterLoginPage.clickonthreedayrefreshmenu();
	oThreeDayRefreshAddCart=new ThreeDayRefreshAddCart();
	oThreeDayRefreshAddCart.clickonaddcartmenu();
	
}

}
