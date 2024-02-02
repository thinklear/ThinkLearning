package com.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBy {
	public static void main(String[]args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement W3Footer=driver.findElement(By.xpath("//h1[normalize-space()='W3Schools Spaces']"));
		js.executeScript("arguments[0].scrollIntoView();", W3Footer);
		System.out.println(driver.getTitle());	
		driver.close();
	}


}
