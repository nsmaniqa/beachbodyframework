package test;

import java.io.IOException;

import org.testng.annotations.Test;

import common.TestCaseConfiguration;
import pages.AddToCartPage;
import pages.CheckOutpage;
import pages.LoginPage;
import pages.ShopPage;
import tools.Excel;

public class CheckoutTestcase extends TestCaseConfiguration {
	
	ShopPage oShopPage;
	LoginPage oLoginPage;
	CheckOutpage oCheckOutpage;
	AddToCartPage oAddToCartPage;
	@Test
	public void checkoutverification() throws InterruptedException, IOException{
		Reports.startTest("checkout verification");
		oHomePage.clicksigninlink();
		oLoginPage=new LoginPage();
		//oLoginPage.login("suchi@gmil.com","12345");
		excelDict=Excel.readfromExcelinDict("user_password");
		oLoginPage.login(excelDict.get("username"),excelDict.get("password"));
		oShopPage=new ShopPage();
		oHomePage.clickonshopmenu();
		oShopPage.clickonshoppagesearchbutton();
		oShopPage.clickoncheckoutbutton();
		                                              
		//oAddToCartPage =new AddToCartPage();
		//oAddToCartPage.priceverification();
		//oShopPage.countofproduct();
		/*//oShopPage.clickoncheckoutbutton();*/
		oCheckOutpage =new CheckOutpage();
		oCheckOutpage.checkoutflow();
		Reports.endTest();
		
	}

}
