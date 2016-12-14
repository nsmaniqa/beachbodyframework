package common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import tools.Excel;

import com.relevantcodes.extentreports.ExtentReports;

import pages.HomePage;
import tools.ReportManager;



public class TestCaseConfiguration {
public static WebDriver driver;
public static WebDriverWait wait;
public static HomePage oHomePage;
public static ExtentReports Reports;
public static String sExcelPath;
public static Dictionary<String, String> excelDict;
@BeforeSuite(alwaysRun=true)
public void setup()

{
	File file = new File(System.getProperty("user.dir")+"\\Resources\\" + "chromedriver.exe");
System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
String timestamp = new SimpleDateFormat("yyyyMMddhhmm'.html'").format(new Date());
Reports=ReportManager.getReporter(System.getProperty("user.dir")+"\\Reports\\"+"Report"+timestamp);
driver =new ChromeDriver();
wait=new WebDriverWait(driver,20);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
sExcelPath=System.getProperty("user.dir")+"\\Resources\\" +"Test_data.xls";


driver.get("https://teambeachbody.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
oHomePage=new HomePage();

}
@AfterSuite
public void closethebrowser()
{
	//driver.close();
	//driver.quit();
}


}
