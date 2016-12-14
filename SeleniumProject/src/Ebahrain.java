import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Ebahrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://services.bahrain.bh/wps/portal/!ut/p/a1/jZDdboJAEEbfiBlhwfVyFhrAbUONEnBvDDbr-oOsobb4-CL3onM3yfkyZz5QUIJqqv-Dqa4H21T1Y1fBhpMfThhDGYeBQJIfYrH8Xk0w9npg3QM-d8NEcneeecxHYnIh8izxMMP38mFMCZt-IiLjLqaRSKLp7AsxDd7L45Ohl_eXuoEC1ICNfTEAY5oDMOIxB2Vqu-07LQSomuhP0sOemq3HDahW73SrW2dvf69Qdl3nGGtNrZ0fe4bLOc_LW3r0TwXdAdEjIT8!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/");
driver.manage().window().maximize();
Select bill=new Select(driver.findElement(By.id("viewns_Z7_8A5C1440KO3QE0AKU2LVCO2046_:form1:idList")));
bill.selectByValue("C	R");
driver.findElement(By.name("viewns_Z7_8A5C1440KO3QE0AKU2LVCO2046_:form1:identitynumber")).sendKeys("34311114");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("viewns_Z7_8A5C1440KO3QE0AKU2LVCO2046_:form1:accountnumber")).sendKeys("158791221");
driver.findElement(By.id("viewns_Z7_8A5C1440KO3QE0AKU2LVCO2046_:form1:submit")).click();
	}

}
