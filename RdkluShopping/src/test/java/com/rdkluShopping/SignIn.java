package com.rdkluShopping;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rdklu.Create_AccountPom;
import com.utility.BaseClass;

public class SignIn extends BaseClass{
	@Test
	public void test2() {

		SignIn signIn= PageFactory.initElements(driver, SignIn.class);
		
	}
	
}
