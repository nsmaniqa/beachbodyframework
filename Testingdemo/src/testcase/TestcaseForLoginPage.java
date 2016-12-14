package testcase;

import org.testng.annotations.Test;

import common.Configuration;

public class TestcaseForLoginPage extends Configuration {
	@Test
	public void verifyloginpage(){
		//oHomePage.clickonsigninbutton();
		oHomePage.framecount();
	}

}
