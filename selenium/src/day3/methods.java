package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class methods 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//getting title of the page
		System.out.println(driver.getTitle());
		
		//getting the url
		System.out.println(driver.getCurrentUrl());
		//getting the text
		
		String text=driver.findElement(By.linkText("Gmail")).getText();
		
		System.out.println(text);
		
		//getting the property value while run tme
		
		String Class=driver.findElement(By.linkText("Gmail")).getAttribute("class");
		System.out.println(Class);
		//getting the source code of the page
		
		System.out.println(driver.getPageSource());
		
	}

}
