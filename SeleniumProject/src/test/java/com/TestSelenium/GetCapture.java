package com.TestSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.RandomString;

public class GetCapture {
	public static void getCapture (WebDriver driver) throws Exception {
		String path="C:\\Users\\gokul.s.dukre\\eclipse-workspace\\PracticeSeleniumnew\\Screenshot";
		TakesScreenshot ts =(TakesScreenshot) driver;
		String rm=RandomString.make(5);
				
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File (path+"\\"+ rm +"test.png");
		FileUtils.copyFile(src, destn);
		
		}		


}
