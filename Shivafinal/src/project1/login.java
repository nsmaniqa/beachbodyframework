package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class login {
	   WebDriver driver=null;
  
  @Parameters({"browser","appURL"})
  @BeforeTest
  public void beforeTest(String Browser,String url) {
	  if(Browser.equals("firefox"))
	   {
	    driver=new FirefoxDriver();
	    
	   }
	   else if(Browser.equals("ie"))
	   { 
	    System.setProperty("webdriver.ie.driver", "C:/selenium_download/IEDriverServer_x64_2.39.0/IEDriverServer.exe");
	    driver=new InternetExplorerDriver();
	    
   }	  
	   else if(Browser.equals("chrome"))
	   { 
	    System.setProperty("webdriver.chrome.driver", "C:/selenium_download/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	   }	  
//driver.get("http://www.google.com");	
	  driver.get(url);
	  driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.id("ap_email")).sendKeys("durair7@yahoo.com");
	  driver.findElement(By.id("ap_password")).sendKeys("ramya7");
	  driver.findElement(By.id("signInSubmit-input")).click();
	  
  }
  @Test
  @Parameters({"appurl"})
  public void login(String url) {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
