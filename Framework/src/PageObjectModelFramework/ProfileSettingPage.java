package PageObjectModelFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfileSettingPage extends ReusableMethods_Pom_xero {

public static void validate_title() throws IOException{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		validate_page("Profile");
	}

	//span#button-1041-btnInnerEl

public static void UploadImage() throws IOException
{
	WebElement Uploadimgbutton=driver.findElement(By.cssSelector("span#button-1041-btnInnerEl"));	
clickButton(Uploadimgbutton,"UploadImageButton");
	
}

//input#filefield-1230-button-fileInputEl
//
public static void Browse(String img) throws IOException
{
	
//this is nt sending image to browse button
	
	WebElement Browsebutton=driver.findElement(By.cssSelector("div#filefield-1174-button input.file"));	
	Actions act=new Actions(driver);
	act.moveToElement(Browsebutton);
	act.sendKeys(img).perform();
	//actions_enterText(Browsebutton, img, "Browse Button");
	//enterText((WebElement) act, img, "Browse Button");
	
}



}
