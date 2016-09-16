package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class RecordDelete 
{
	public static void main(String[] args) throws InterruptedException 
	{
		boolean flag=false;
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Sumitha");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://opensource.demo.orangehrmlive.com");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String id=cols.get(1).getText();
			System.out.println(id);
			if (id.equalsIgnoreCase("0009")) 
			{
				if (!cols.get(0).isSelected())
				{
					cols.get(0).click();
					driver.findElement(By.id("btnDelete")).click();
					driver.findElement(By.id("dialogDeleteBtn")).click();
					break;
				}
			}
		}
		Thread.sleep(3000);
		
		rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String id=cols.get(1).getText();
			System.out.println(id);
			if (id.equalsIgnoreCase("0009")) 
			{
				flag=true;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Fail");
			
		}
		else
		{
			System.out.println("PAss");
		}

	}
		
	

}
