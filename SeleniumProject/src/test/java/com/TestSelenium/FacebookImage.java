package com.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookImage {
	
		public static void main (String [] args) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
//	      WebElement facebookImg  =driver.findElement(By.xpath("//img[@alt='Facebook']"));
//	      facebookImg.click();
//	      String facebook=driver.getTitle();
//	      if ( driver.getTitle().equals("Facebook")) {
//	    	 System.out.println("Clicked on the Facebook IMG");
//	      }
//	      else {
//	    	  System.out.println("Not getting facebook IMG or may be we are not on the Login page");
//	      }
//	      driver.close();
//		}

}}
