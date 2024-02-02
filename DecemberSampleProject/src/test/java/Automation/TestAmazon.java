package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAmazon {
	public static void main(String [] args) throws Exception {
	WebDriver driver;
	WebElement search;
	
	
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	
		
		System.out.println("Test");
		 search= driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		search.sendKeys("Apple Mobile");
		
		//button[@type='submit']//*[name()='svg']
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		//div[normalize-space()='APPLE iPhone 15 (Black, 128 GB)']
		driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 15 (Black, 128 GB)']")).click();
		String prtAdd=driver.getWindowHandle();
		System.out.println(prtAdd);
		Set<String> allAdd=driver.getWindowHandles();
		System.out.println(allAdd);
		
		Iterator <String>it=allAdd.iterator();
		while (it.hasNext()) {
			String childAdd=it.next();
			if(!prtAdd.equals(childAdd)) {
			
			}
			driver.switchTo().window(childAdd);
		}
		
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
