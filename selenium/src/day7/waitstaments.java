package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitstaments
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[3]/div/a")));
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[3]/div/a")).click();
	}

}
