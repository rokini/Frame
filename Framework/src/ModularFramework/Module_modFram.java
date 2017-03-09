package ModularFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Module_modFram extends ReusableMethos_modFram {

	
public static void login(String URL,String username,String password) throws IOException{
	launch(URL);	
//driver.get(URL);
//driver.manage().window().maximize();
WebElement user=  driver.findElement(By.xpath(".//input[@id='email']")); 	
enterText(user,username,"UserName");
		
WebElement pwd=  driver.findElement(By.xpath(".//input[@id='password']")); 	
enterText(pwd,password,"PassWord");		
		
WebElement loginbutton=driver.findElement(By.xpath(".//button[@id='submitButton']"));	
clickButton(loginbutton,"Login");


	}
	
	
public static void logout(){
	
		}

public static void createAccount(){
	
	
	
}
	
}
