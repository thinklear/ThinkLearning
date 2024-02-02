package com.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
    @BeforeMethod
    public void BM() {
   	 WebDriverManager.chromedriver().setup();
   	 driver =new ChromeDriver();
   	 driver.get("https://www.facebook.com/");
   	 
    }
    @AfterMethod
    public void AM() {
   	 driver.close();
    }


}
