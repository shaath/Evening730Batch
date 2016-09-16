package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Autofillers 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.className("modalCloseSmall")).click();
		driver.findElement(By.id("txtSource")).sendKeys("H");
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
		System.out.println(auto.size());
		for (int i = 0; i < auto.size(); i++)
		{
			String text=auto.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Hyderabad"))
			{
				auto.get(i).click();
				break;
			}
		}
		
		
	}

}
