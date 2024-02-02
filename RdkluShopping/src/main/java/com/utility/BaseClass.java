package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	  protected WebDriver driver;
	@BeforeMethod
	 public void BM() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		getDriver().get("https://www.rdklu.com/");
		getDriver().manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterMethod 
	 public void AF() {
		getDriver().close();

	}
	public WebDriver getDriver() {
		return driver;
	}

}
