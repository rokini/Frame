package PageObjectModelFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends ReusableMethods_Pom_xero{

	public static void validate_title() throws IOException{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		validate_page("Dashboard");
	}

	
	public static void validate_username(String user) throws IOException{
		
	WebElement uname=driver.findElement(By.cssSelector("a.username"));
		validate_errormsg(uname, user);
	}
	
	
	

	public static void logout() throws IOException{
		
		WebElement Logout=driver.findElement(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.logout>a"));
			clicklink(Logout, "Logout");
		}
		
	
public static void user_navigation() throws IOException{
	
		WebElement nav_arrow=driver.findElement(By.cssSelector("div.xn-h-user"));
			clicklink(nav_arrow, "UserName");
		}
//li.xn-h-profile-card-navigation-item.grid-3.profile>a

public static void profile() throws IOException{
	
	WebElement profile=driver.findElement(By.cssSelector("li.xn-h-profile-card-navigation-item.grid-3.profile>a"));
		clicklink(profile, "Profile");
	}


}
