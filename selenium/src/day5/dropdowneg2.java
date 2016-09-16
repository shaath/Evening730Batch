package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg2 {

	public static void main(String[] args)
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://khuranatravel.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("g-popup-close")).click();
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select s=new Select(fdrop);
		Select t=new Select(tdrop);
		List<WebElement> flist=s.getOptions();
		System.out.println(flist.size());
		for (int i = 0; i < flist.size(); i++) 
		{
			s.selectByIndex(i);
			String fText=flist.get(i).getText();
			System.out.println(fText);
			
			List<WebElement> tlist=t.getOptions();
			for (int j = 0; j < tlist.size(); j++)
			{
				t.selectByIndex(j);
				String tText=tlist.get(i).getText();
				if (fText.equalsIgnoreCase(tText))
				{
					flag=true;
					break;
				}
			}
			if (flag)
			{
				break;
			}
			
		}
		if (flag)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}

}
