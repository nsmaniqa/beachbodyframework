package seleniumdays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3Retivedatafrtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://content.icicidirect.com/newsiteContent/Home/Pricing.asp");
		
		WebElement table=driver.findElement(By.id("Table4"));
		WebElement tbody=table.findElement(By.tagName("tbody"));
		List <WebElement> row= tbody.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List <WebElement> col=row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText());
			}
		}
		

	}

}
