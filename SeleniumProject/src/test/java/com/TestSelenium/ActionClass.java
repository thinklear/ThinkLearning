package com.TestSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	public static void main(String[] args) {
		//Actions class is used for mouse movement and keyboard actions
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Actions act=new  Actions(driver);
		 act.moveToElement(null).click().build().perform();
		 act.doubleClick();
		 act.contextClick();
		 driver.close();
		 
	}

}


