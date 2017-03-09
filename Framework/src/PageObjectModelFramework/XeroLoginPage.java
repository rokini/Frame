package PageObjectModelFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

public class XeroLoginPage  extends ReusableMethods_Pom_xero {
	/*Functional Methods or components*/
	
	public static void enterUserName(String username) throws IOException
	{
		WebElement user=  driver.findElement(By.cssSelector("input#email")); 	
		enterText(user,username,"UserName");
}
	
	public static void enterPassword(String password) throws IOException
	{
		WebElement pwd=  driver.findElement(By.cssSelector("input#password")); 	
		enterText(pwd,password,"PassWord");	
	}
	
	public static void clickLogin() throws IOException
	{
		WebElement loginbutton=driver.findElement(By.cssSelector("button#submitButton"));	
	clickButton(loginbutton,"Login");
		
	}
	
	
	public static void validate_errormsg()
	{
		
	}
	
	
	
	public static void launchApp(String Url)
	{
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void clickXero() throws IOException
	{
		WebElement link=driver.findElement(By.cssSelector("a.logo"));
		clicklink(link,"Xero Link");
	}
	
	public static void clickForgotPwd(String s,String b,String u) throws IOException
	{//a.forgot-password-advert
		WebElement forgotlink=driver.findElement(By.cssSelector("a.forgot-password-advert"));
		clicklink(forgotlink,"ForgotPassword Link");
	}
	
	public static void clickTryXerofree(String s,String b,String u) throws IOException
	{//p.center.try-xero a
		WebElement TryXero=driver.findElement(By.cssSelector("p.center.try-xero a"));
		clicklink(TryXero,"Try Xero Free");
	}
	
}
