package tools;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.TestCaseConfiguration;

public class TakeScreenshot  extends TestCaseConfiguration{
	public void Screenshotnshot(){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getPath());
		
	}

}
