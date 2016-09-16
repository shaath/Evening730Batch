package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testngmaster 
{
	public static WebDriver driver;
	public static String expval,actval;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="admin";
	public static String f="QEdge123456",l="Tech";
	public static String ename=f+" "+l,uname="QEdge122222",pswd="QEdge1234567";
	public static String cpswd="QEdge1234567";
	@BeforeSuite
	public void org_launch()
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"App Launch Failed");
	}
	
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"App Login Failed");
	}
	@AfterTest
	public void org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"App Logout Failed");
	}
	

}
