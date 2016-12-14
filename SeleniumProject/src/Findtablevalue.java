import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Findtablevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.rbi.org.in/Scripts/Timlines.aspx");
	WebElement table=driver.findElement(By.xpath("//*[@id='example-min']/table[1]/tbody/tr[1]/th[2]"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement tbody=table.findElement(By.tagName("tbody"));
	List <WebElement> row=tbody.findElements(By.tagName("tr"));
	for (int i=0;i<row.size();i++)
	{
		List <WebElement>col=row.get(i).findElements(By.tagName("th"));
		for (int j=0;j<col.size();j++)
		{
			System.out.println(col.get(j).getText());
		}
	}
		

	}

}
