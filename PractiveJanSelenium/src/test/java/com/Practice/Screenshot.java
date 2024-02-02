package com.Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Screenshot {
	
	public static void takeScreenShot  (WebDriver driver ) throws Exception {
		String path ="C:\\Users\\gokul.s.dukre\\eclipse-workspace\\PractiveJanSelenium\\ScreenShot";
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src=scr.getScreenshotAs(OutputType.FILE);
		File destn= new File (path+"/"+".PNG");
		FileUtils.copyFile(src, destn);
		
		
	}
		
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Screenshot screenshot=new Screenshot();
		screenshot.takeScreenShot(driver );
		
		System.out.println("ScreenShot is captured and stored");
		System.out.println(driver.getTitle());
		
		driver.get("https://truckstop--agile.sandbox.lightning.force.com/lightning/n/agf__ADM_Kanban_Board");
		Screenshot screenshot1=new Screenshot();
		
		screenshot1.takeScreenShot(driver );
		System.out.println(driver.getTitle());
		
		

	}

}
