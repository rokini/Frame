package ModularFramework;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_modFram  {
	public static WebDriver driver;
	public static int reportflag = 0;

	public static void main(String[] args) throws InterruptedException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {

		String dataPath = "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/TestSuite/TestSuite_Mod.xls";

		String[][] recData = ReusableMethos_modFram.readSheet(dataPath, "Sheet1");
		for(int i = 1; i <recData.length; i++){

			if(recData[i][1].equalsIgnoreCase("Y"))
			{
				
				/*Firefox*/
           if(recData[i][3].equalsIgnoreCase("Y")) 
				{{
					driver = new FirefoxDriver();
					reportflag = 0;  // Reset
					String testScript = recData[i][2];
					ReusableMethos_modFram.startReport(testScript, "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/Firefox/Report/","Firefox");

					/*Java Reflection or Reflexive API*/
					Method ts = Automation_modFram.class.getMethod(testScript);
					ts.invoke(ts);

					driver.close();
					if(reportflag == 0){
						ReusableMethos_modFram.writeExcel(dataPath, "Sheet1", i, 3, "Pass");
					}else{
						ReusableMethos_modFram.writeExcel(dataPath, "Sheet1", i, 3, "Fail");
					}
				}

				ReusableMethos_modFram.bw.close();
				}
			}
			if(recData[i][1].equalsIgnoreCase("Y"))
			{

				// Chrome..
				if(recData[i][4].equalsIgnoreCase("Y")){
					{
						System.setProperty("webdriver.chrome.driver", "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/Lib/chromedriver.exe");
						driver = new ChromeDriver();

						reportflag = 0;  // Reset
						String testScript = recData[i][2];
						ReusableMethos_modFram.startReport(testScript, "C:/RokiniQA/Selenium_materials_tekarch/Selenium_Framework/ModularDrivenFramework/Chrome/Report/","Chrome");

						/*Java Reflection or Reflexive API*/
						Method ts = Automation_modFram.class.getMethod(testScript);
						ts.invoke(ts);

						driver.close();
						if(reportflag == 0){
							ReusableMethos_modFram.writeExcel(dataPath, "Sheet1", i, 4, "Pass");
						}else{
							ReusableMethos_modFram.writeExcel(dataPath, "Sheet1", i, 4, "Fail");
						}
					}
				}
				ReusableMethos_modFram.bw.close();
			}

			if(recData[i][1].equalsIgnoreCase("N"))
			{
				System.out.println("Row number :" +i+ " script is not executed..");
				System.out.println();
				ReusableMethos_modFram.writeExcel(dataPath, "Sheet1", i, 3, "NA");

			}


			//		AutomationScripts.LoginErrorMessage();
			//		AutomationScripts.CheckRemeberMe();
			//		AutomationScripts.LoginToSalesForce();

		}}

}
