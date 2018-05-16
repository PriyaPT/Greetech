package com.greentech.workflows.login;

import org.testng.Reporter;
import com.greeentech.domains.login.LoginDomain;
import com.greentech.pages.login.LoginPage;
import com.greentech.suitebase.SuiteBase;

import junit.framework.Assert;

public class LoginFlows extends SuiteBase {

	public static void switchToLoginW()
	{
		driver.switchTo().frame("login");
	}
	
	public static void clickonSingin()
	{
		/*Develop the wrapper for common activity on page will explain you how to create wrapper */
	   driver.findElement(LoginPage.luserName).sendKeys(LoginDomain.getUserName());
	   driver.findElement(LoginPage.lpwd).sendKeys(LoginDomain.getPwd());
	   driver.findElement(LoginPage.signInbutton).click();
	}

    public static void verifyTitle()
    {
    	String lTitle = driver.getTitle();
        //Assert.assertTrue("", true);
        Assert.assertEquals("7) LinkedIn", lTitle);
        Reporter.log("Login title verified");
    }
}
