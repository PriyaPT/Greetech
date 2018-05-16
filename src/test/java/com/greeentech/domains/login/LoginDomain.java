package com.greeentech.domains.login;

import org.testng.annotations.DataProvider;

public class LoginDomain {

	/*Variable name should be self explanatory ex userPassword*/
	private static String userName;
	private static String pwd;
	
	/*instead of login you can use loginData*/
	private static String[][] login;
	
     @DataProvider(name = "LoginDomain")
     public static String[][] loginData()
     {
    	 login[0][0] = "vyawaharepriya@gmail.com";
    	 login[0][1] = "ruby491989";
    	
    	 
    	 return login;
     }
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		userName = login[0][0];
		/* instead of above line you can write line "this.userName =login[0][0];"*/
	}
	public static String getPwd() {
		return pwd;
	}
	//After each curly braces closing add one line space will help to read the code better
	public static void setPwd(String pwd) {
		pwd = login[0][1];
	}/*Always remove blank line it's not valid it will show you error in code analysis tool*/
	
	
	
}
