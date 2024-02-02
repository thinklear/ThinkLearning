package com.TestSelenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assert  extends BaseClass{
	
	@Test
	public void test001 () {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Login ");
		System.out.println("pass ");
		System.out.println("email");
		String Expected="Test";
		String actual="No test";
		softAssert.assertEquals(actual, Expected);
		
		System.out.println("Sting");
		softAssert.assertAll();
		
		
	}

}
