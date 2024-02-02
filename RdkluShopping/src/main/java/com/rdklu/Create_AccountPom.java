package com.rdklu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Create_AccountPom {
	//*[name()='path' and contains(@d,'M35 39.84v')]
	@FindBy(how=How.XPATH,using="//a[@class='site-nav__link site-nav__link--icon small--hide']//*[name()='svg']")private WebElement sign_up;
	@FindBy(how=How.XPATH,using="//a[@id='customer_register_link']")private WebElement createAccount;

	@FindBy(how=How.XPATH,using="//input[@id='FirstName']")private WebElement first_Name;
	@FindBy(how=How.XPATH,using="//input[@id='LastName']")private WebElement last_Name;
	@FindBy(how=How.XPATH,using="//input[@id='Email']")private WebElement email;
	@FindBy(how=How.XPATH,using="//input[@id='CreatePassword']")private WebElement password;
	@FindBy(how=How.XPATH,using="//input[@id='register-submit']")private WebElement create_Button;
	
	
	public WebElement sign_up() {
		return sign_up;
	}
	
	public WebElement getCreateAccount() {
	
		return createAccount;
	}
	
	public WebElement getFirst_Name() {
		return first_Name;
	}
	
	public WebElement getLast_Name() {
		return last_Name;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getCreate_Button() {
		return create_Button;
	}
	
}
