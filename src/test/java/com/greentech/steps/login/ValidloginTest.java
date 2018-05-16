package com.greentech.steps.login;

import org.testng.annotations.Test;

import com.greentech.suitebase.SuiteBase;
import com.greentech.workflows.login.LoginFlows;

public class ValidloginTest extends SuiteBase {

	@Test(alwaysRun=true)
	public void signIn()
	{
		LoginFlows.switchToLoginW();
		LoginFlows.clickonSingin();
		LoginFlows.verifyTitle();
	}
	
}
