package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	
	WebDriver driver;
	//@Parameters ({"BrowserName"})
	@BeforeMethod
	public void bM() {
		System.out.println("Base class started Execution ");
		//if (BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://qavbox.github.io/demo/signup/");
			driver.manage().window().maximize();
//		}
//		else {
//			System.out.println("Browser is not selected ");
//		}
	}
		@AfterMethod 
		public void aF() {
			driver.close();
		
		
	}

}
