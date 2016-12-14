package testNG;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class gmaillogin2 extends BaseTest {

	@Test(priority=0,dataProvider="getData")
	public void loginTest(String username, String password){
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(password);
		driver.findElement(By.id("signIn")).click();
   	new WebDriverWait(driver,10)
	.until(ExpectedConditions.elementToBeClickable(By.className("gbii")));
		Assert.assertTrue(driver.getTitle().contains(username),"Home Page titile verification failed");
	}
	
	@Test(priority=1,dependsOnMethods="loginTest")
	public void verifyCreateAccountLink()
	{
		driver.findElement(By.id("link-signup")).click();
	}
	
	@Test(priority=2)
	public void verifyNeedHelpLink()
	{
		driver.findElement(By.id("link-forgot-passwd")).click();
	}
	
	@DataProvider
	public Object[][] getData() throws BiffException, IOException
	{
		Workbook excell=	Workbook.getWorkbook(new File("C:\\Users\\DHAKSHAN\\Desktop\\selenium\\testing.xls"));
		Sheet sh=excell.getSheet("durai")	;
	
	Object[][] data=new Object[sh.getRows()-1][sh.getColumns()];
	for(int i=1;i<sh.getRows();i++)
	{
		for(int j=0;j<sh.getColumns();j++)
		{
			data[i-1][j] =sh.getCell(j,i).getContents();
		}
		
	}
	return data;}}
