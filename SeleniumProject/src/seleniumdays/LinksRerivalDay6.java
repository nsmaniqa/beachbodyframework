package seleniumdays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksRerivalDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub http://www.barnesandnoble.com/
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.barnesandnoble.com/");
		// start with a means links(anchor tag)
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getAttribute("target"));
			System.out.println(links.get(i).getAttribute("class"));
			System.out.println(links.get(i).getAttribute("id"));
			System.out.println("------------------------------------------------------------");
		}

	}

}
