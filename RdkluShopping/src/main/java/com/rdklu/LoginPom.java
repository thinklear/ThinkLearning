package com.rdklu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='CustomerEmail']")private WebElement email;
	@FindBy(how=How.XPATH,using="//input[@id='CustomerPassword']")private WebElement password;
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Sign In']")private WebElement signIn;
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getSign_In() {
		return signIn;
	}
	
}
