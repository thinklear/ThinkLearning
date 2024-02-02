package com.TestSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeforSRCt {
public static void main(String [] args) throws Exception
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		

			String path="C:\\Users\\gokul.s.dukre\\eclipse-workspace\\SeleniumProject\\SRCtest";
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File destn=new File (path+"\\"+".png");
			FileUtils.copyFile(src, destn);
			System.out.println("Completed");
			
		
	}


}
