package PageObjectModelFramework;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;
public class AutomationScript_Pom_xero extends ReusableMethods_Pom_xero{
	


		public static void LogoutFunctionality() throws IOException, InterruptedException{
			// Read test data
			String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/PageObjectModelFramework/TestData/LogoutFunctionality.xls";
			 String[][] recData = ReusableMethods_Pom_xero.readSheet(dt_path, "Sheet1");
			//recData.length--->gives no of rows ,to access more than one row we could use forloop
			 String URL=recData[1][1];
			 String uname=recData[1][2];
			 String pwd=recData[1][3];
			String Expect=recData[1][4].trim();
			
			 XeroLoginPage xlpage=new XeroLoginPage();	 
			 
			 
			 xlpage.launchApp(URL);
			 xlpage.enterUserName(uname);
			 xlpage.enterPassword(pwd);
			 xlpage.clickLogin();
			 
			 
			DashboardPage dbpage=new DashboardPage();
			
			dbpage.validate_title();
			dbpage.validate_username(Expect);
			dbpage.user_navigation();
		    dbpage.logout();
		 
		 
	//validate_page(Expect);
		}
		

		public static void UploadProfileImage() throws IOException, InterruptedException{
			
			// Read test data
					String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/PageObjectModelFramework/TestData/UploadProfileImage.xls";
					 String[][] recData = ReusableMethods_Pom_xero.readSheet(dt_path, "Sheet1");
					
					 String URL=recData[1][1];
					 String uname=recData[1][2];
					 String pwd=recData[1][3];
					 String Image=recData[1][4].trim();
					 XeroLoginPage xlpage=new XeroLoginPage();			 
					 xlpage.launchApp(URL);
					 xlpage.enterUserName(uname);
					 xlpage.enterPassword(pwd);
					 xlpage.clickLogin(); 
					 
					 DashboardPage dbpage=new DashboardPage();
						
						dbpage.validate_title();	
					    dbpage.user_navigation();
					    dbpage.profile();
					
					 ProfileSettingPage pf=new ProfileSettingPage();
					 
					 pf.UploadImage();
					 pf.Browse(Image);
					 
					 
			
		}
		
		public static void CreateAccount() throws IOException, InterruptedException{
			
	/*		// Read test data
			String dt_path = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/PageObjectModelFramework/TestData/CreateAccount.xls";
			 String[][] recData = ReusableMethods_Pom_xero.readSheet(dt_path, "Sheet1");
			
			 String URL=recData[1][1];
			 String uname=recData[1][2];
			 String pwd=recData[1][3];
			 String Expect=recData[1][4].trim();
			 
			 //XeroLoginPage.login(URL,uname,pwd);
			 Thread.sleep(2000);
			 
			 WebElement actlobj	=driver.findElement(By.xpath(".//div[@id='contentTop']//div[@class='x-boxed warning']/p"));

			 validate_errormsg(actlobj, Expect);
		
			*/
		} 
		
	}


