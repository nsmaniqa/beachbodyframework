package tools;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

import com.relevantcodes.extentreports.LogStatus;

import common.TestCaseConfiguration;

public class Utility extends TestCaseConfiguration {
	public static boolean isElementPresent(WebElement w,String msg){
		try{
			boolean b=w.isDisplayed();
			Reports.log(LogStatus.PASS, "element: "+msg+" is displayed in the page");
			return b;
		}
		catch (NoSuchElementException ex){
			System.out.println("ElementNotDisplayed"+ex.getMessage());
			Reports.log(LogStatus.FAIL, "element: "+msg+" is not displayed in the page");
			return false;
			
		}
	}
public static boolean isContain(String expected,String actual){
	try{
		
		if(actual.toLowerCase().contains(expected.toLowerCase())){
			Reports.log(LogStatus.PASS, "expected: "+expected+" and actual :"+actual);
			return true;
		}
		else{
			Reports.log(LogStatus.FAIL, "expected: "+expected+" and actual :"+actual);
			return false;
		
		}
		
	}
	catch(Exception ex){
		
	
		Reports.log(LogStatus.FAIL, ex.getMessage());
		return false;
	}
}
public static boolean isEqual(String expected,String actual){
	try{
		if(actual.equalsIgnoreCase(expected)){
			Reports.log(LogStatus.PASS, "expected: "+expected+" and actual :"+actual);
			return true;
		}
		else{
			Reports.log(LogStatus.FAIL, "expected: "+expected+" and actual :"+actual);
			UUID uuid = UUID.randomUUID();
            String randomUUIDString = uuid.toString();
			Screenshotnshot("C:/src1/img"+ randomUUIDString+".png");
			return false;
		
		}
		
	}
	catch(Exception ex){
		
		Reports.log(LogStatus.FAIL, ex.getMessage());
		return false;
	}
}
public static void waitForAjaxToFinish(final int timeToWait) {
	int timeout = 0;
	 
	while(timeout < timeToWait) {
	    boolean ajaxFinished = (boolean) ((JavascriptExecutor) driver)
	            .executeScript("return !!jQuery && jQuery.active == 0");
	    
	    if(ajaxFinished) 
	        return;
	    
	    timeout++;
	    explicitlyWait(1000);
	}
	 
	throw new AssertionError("Ajax haven't finished its job in "+timeToWait+" sec");
}


public static void explicitlyWait(int timeoutmsec) 
{
try {
	Thread.sleep(timeoutmsec);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

public static void Screenshotnshot(String filename) throws IOException{
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(srcFile.getPath());
	FileUtils.copyFile(srcFile, new File (filename));
  
}
}