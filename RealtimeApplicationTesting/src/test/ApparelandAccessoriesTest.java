package test;

import org.testng.annotations.Test;

import pages.AfterLoginPage;
import pages.ApparelandAccessoriesPage;
import pages.CheckOutpage;
import pages.LoginPage;
import pages.ShopPage;
import common.TestCaseConfiguration;

public class ApparelandAccessoriesTest extends TestCaseConfiguration {
	
	ShopPage oShopPage;
	LoginPage oLoginPage;
	AfterLoginPage oAfterLoginPage;
	CheckOutpage oCheckOutpage;
	ApparelandAccessoriesPage oApparelandAccessoriesPage;
	@Test
	public void menapparelverification() throws InterruptedException{
		Reports.startTest("mens apparel");
		oHomePage.clicksigninlink();
		oLoginPage =new LoginPage();
		oLoginPage.login();
		oAfterLoginPage =new AfterLoginPage();
		//oAfterLoginPage.clickonshopmenu();
		oAfterLoginPage =new AfterLoginPage();
		oAfterLoginPage.clickonapprallandacc();
		/*oApparelandAccessoriesPage=new ApparelandAccessoriesPage();
		oApparelandAccessoriesPage.clickonmensapparellink();
		
		oShopPage =new ShopPage();
		oShopPage.clickonshoppagesearchbutton();
		oCheckOutpage =new CheckOutpage();
		oCheckOutpage.checkoutflow(); */
		Reports.endTest();
		
	}

}
