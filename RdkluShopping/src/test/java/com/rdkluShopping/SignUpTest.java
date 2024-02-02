package com.rdkluShopping;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rdklu.Create_AccountPom;
import com.utility.BaseClass;

public class SignUpTest extends BaseClass {
	
		@Test
		
		public void signUpTest() {
			Create_AccountPom sign_up=PageFactory.initElements(driver, Create_AccountPom.class );
			sign_up.sign_up().click();
			sign_up.getCreateAccount().click();
			sign_up.getFirst_Name().sendKeys("rahul");
			sign_up.getLast_Name().sendKeys("shelke");
			sign_up.getPassword().sendKeys("Gokul@12");
		}
}
