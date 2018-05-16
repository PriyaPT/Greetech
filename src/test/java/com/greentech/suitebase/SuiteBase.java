package com.greentech.suitebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

/*Remove unused imports it will not impact your code but as per code standard line there should not be 
unwanted import because  some time it will create collision issue */
import com.greeentech.domains.login.LoginDomain;
import com.greentech.utility.LoadProperties;
import com.greentech.workflows.login.LoginFlows;

public class SuiteBase {
	
	/*1.Add AfterSuite method to close the browser and release the resources*/
	/*2.push this code on your remote repo*/
	
	/*Every declared object should assigned first as null for standard practice e.g WebDriver driver =null*/
	public static WebDriver driver ;
	public static Actions action ;
	public static LoadProperties propertyf = new LoadProperties();
	
	@Parameters({"browsertype"})
	@BeforeSuite
	public void selectBrowser(String browsertype) {
		
		String timeOut = System.getProperty("timeout");
		String env = System.getProperty("env");
		switch(browsertype) {
		
		case "ff":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeOut), TimeUnit.SECONDS);
			driver.get(propertyf.readProperty().get("appUrl"));
		    action = new Actions(driver);
		    
		    
		    /*While pushing code to your remote remote repository commented code should be removed
		    if it is required specify valid comment there*/	
		    /*if(env.contains("test")) {
					driver.get("http://fb.com");
				}else {
				driver.get("http://google.com");
			}*/
			break;

		case "ie":
			System.setProperty("WebDriver.ie.driver", "path");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			action = new Actions(driver);
			break;

		case "chrome":
			System.setProperty("WebDriver.chrome.driver", "path");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			action = new Actions(driver);

		}
	}

}
/*It's always better to remove blank line after your class closing braces it does not affect but it's make your code better for look*/

