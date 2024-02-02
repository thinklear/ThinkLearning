package com.loginPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom  {
	@FindBy(how=How.XPATH, using="//input[@id='email']") private WebElement _txt_email;
	@FindBy(how=How.XPATH, using="//input[@id='pass']") private WebElement txt_pass;
	@FindBy(how=How.XPATH, using="//button[@name='login']") private WebElement Btn_login;
	public WebElement get_txt_email() {
		return _txt_email;
	}
	
	public WebElement getTxt_pass() {
		return txt_pass;
	}
	
	public WebElement getBtn_email() {
		return Btn_login;
	}
	
	

}
