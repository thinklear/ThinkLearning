package com.TestSelenium;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.loginPom.LoginPom;

public class VerifyLoginFacebook extends BaseClass {
	
	@Test
	
	public void test002() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.get_txt_email().sendKeys("Gamil@gmail.com");
		login.getTxt_pass().sendKeys("12345");
		login.getBtn_email().click();
		
	}

}
