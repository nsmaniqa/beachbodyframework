package test;

import org.testng.annotations.Test;

import pages.ForgetPasswordPage;
import common.TestCaseConfiguration;

public class ForgetPasswordTestcase extends TestCaseConfiguration{
	
ForgetPasswordPage oForgetPasswordPage;
@Test
public void verifyforgetpasswordfunction() throws InterruptedException{
	Reports.startTest("forget pasword verification");
	oForgetPasswordPage = new ForgetPasswordPage();
	oForgetPasswordPage.forgetpasswordlink();
	Reports.endTest();
}

}
