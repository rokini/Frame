package ModularFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

public class Automation_modFram extends ReusableMethos_modFram{

	public static void ValidUserDetails() throws IOException, InterruptedException{
		// Read test data
		String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/TestData/ValidUserDetails.xls";
		 String[][] recData = ReusableMethos_modFram.readSheet(dt_path, "Sheet1");
		
		 String URL=recData[1][1];
		 String uname=recData[1][2];
		 String pwd=recData[1][3];
		 String Expect=recData[1][4];
		 
		 Module_modFram.login(URL,uname,pwd);
		 Thread.sleep(2000);
validate_page(Expect);
	}
	

	public static void IncorrectPwd() throws IOException, InterruptedException{
		
		// Read test data
				String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/TestData/IncorrectPwd.xls";
				 String[][] recData = ReusableMethos_modFram.readSheet(dt_path, "Sheet1");
				
				 String URL=recData[1][1];
				 String uname=recData[1][2];
				 String pwd=recData[1][3];
				 String Expect=recData[1][4].trim();
				 
				 Module_modFram.login(URL,uname,pwd);
				 Thread.sleep(2000);
				 
				 WebElement actlobj	=driver.findElement(By.xpath(".//div[@id='contentTop']//div[@class='x-boxed warning']/p"));
	validate_errormsg(actlobj, Expect);
		
	}
	
	public static void IncorrectEmail() throws IOException, InterruptedException{
		
		// Read test data
		String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/TestData/IncorrectEmail.xls";
		 String[][] recData = ReusableMethos_modFram.readSheet(dt_path, "Sheet1");
		
		 String URL=recData[1][1];
		 String uname=recData[1][2];
		 String pwd=recData[1][3];
		 String Expect=recData[1][4].trim();
		 
		 Module_modFram.login(URL,uname,pwd);
		 Thread.sleep(2000);
		 
		 WebElement actlobj	=driver.findElement(By.xpath(".//div[@id='contentTop']//div[@class='x-boxed warning']/p"));

		 validate_errormsg(actlobj, Expect);
	
		
	}
	public static void ForgotPwd() throws IOException, InterruptedException{
		String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/TestData/ForgotPwd.xls";
		 String[][] recData = ReusableMethos_modFram.readSheet(dt_path, "Sheet1");	

		 String URL=recData[1][1];
		 String uname=recData[1][2];
		 String Expected=recData[1][3];
		 launch(URL);
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	/*	 Thread.sleep(3000);
		 String page =driver.getPageSource(); //entire code of this page
		// System.out.println("Page Source ="+page);
		 String title =driver.getTitle();
		 System.out.println("Title = "+title);
		 String currurl=driver.getCurrentUrl();
		 System.out.println("Curr url = "+currurl );
		 String window=driver.getWindowHandle().toString();
		 System.out.println("Window = "+window);
	*/	 
		 WebElement linkobj=driver.findElement(By.xpath(".//div[@id='contentTop']//div/a[@class='forgot-password-advert']"));
			
		 clicklink(linkobj, "Forgot Password");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// String forgotpg=driver.getTitle();
		 //System.out.println("Forgot = "+forgotpg);
		 
		 
		 WebElement user=driver.findElement(By.xpath(".//input[@id='UserName']"));
		 enterText(user, uname, "Email");
		 WebElement sendlink=driver.findElement(By.xpath(".//div[@id='submitButton']/a"));
		 clickButton(sendlink, "sendlink");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// String ver=driver.getTitle();
		// Navigate_page(forgotpg, ver);
		 
		 WebElement act=driver.findElement(By.xpath(".//div[@id='contentTop']/div/p[1]"));
		 validate_errormsg(act, Expected);
		 
		 
	}
	public static void ValidSignUp(){
		
		
		
	}
	public static void InValidSignUp(){
		
	
		
	}
	public static void PrivacyPolicy(){
		
		
		
		
	}
	public static void OfferDetails(){
		
		
		
	}
	public static void AcctBookkeeperlink(){
		
		
		
	}
	public static void AllMenu(){
		
		
		
	}
}
