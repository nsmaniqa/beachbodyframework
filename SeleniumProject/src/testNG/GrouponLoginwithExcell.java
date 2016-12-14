package testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GrouponLoginwithExcell extends Grouponbase1Test{
	@Test(priority=0,enabled=true,dataProvider="getdata") 
	public void login(String username,String password)
	{
		 
		driver.findElement(By.id("ls-user-signin")).click();
		driver.findElement(By.id("email-input")).sendKeys(username);
		driver.findElement(By.id("password-input")).sendKeys(password);
		driver.findElement(By.id("signin-button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		new WebDriverWait(driver,20)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='user-name']")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='user-name']")).isDisplayed());
		}
	@DataProvider
public Object [][] getdata() throws BiffException, IOException
{
		Workbook execl=Workbook.getWorkbook(new File("C:\\Users\\DHAKSHAN\\Desktop\\selenium\\testing.xls"));
		Sheet sh=execl.getSheet("durai");	
	Object [][] data =new Object[sh.getRows()-1][sh.getColumns()];
	for(int i=1;i<sh.getRows();i++)
	{
		for(int j=0;j<sh.getColumns();j++)
		{
			data[i-1][j] =sh.getCell(j,i).getContents();
		}
	}
	return data;
}
}
