package PageObjectModelFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

public class XeroHomePage extends ReusableMethods_Pom_xero {

	
	public static void launchhome(String Url)
	{
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void FreeTrial() throws IOException
	{
		WebElement Freetrial =driver.findElement(By.cssSelector("span.glh-mainlink-cta-wrapper"));
		clickButton(Freetrial, "Free Trial");
	}
	
	
	
	
}
