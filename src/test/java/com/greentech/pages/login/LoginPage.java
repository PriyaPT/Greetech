package com.greentech.pages.login;

import org.openqa.selenium.By;

public class LoginPage {
	
	//Try to use css selector if possible if not then xpath is okay, Convert pages into page factory 
	public static By luserName = By.xpath("//*[@id='session_key-login']");
	public static By lpwd = By.xpath(".//*[@id='session_password-login']");
	public static By signInbutton = By.xpath(".//*[@id='btn-primary']");
	

}
