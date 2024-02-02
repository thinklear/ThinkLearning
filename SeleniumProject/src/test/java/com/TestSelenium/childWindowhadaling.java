package com.TestSelenium;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class childWindowhadaling {
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		String prtAdd=driver.getWindowHandle();
		System.out.println(prtAdd);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 14 (128 GB) - Blue']")).click();
		
		//input[@id='nav-search-submit-button']
		Set<String> allAdd=driver.getWindowHandles();
		System.out.println(allAdd);
		Iterator<String>it=allAdd.iterator();
		while(it.hasNext()) {
			String childAdd=it.next();
			if (!prtAdd.equals(childAdd));
			driver.switchTo().window(childAdd);
			
		}
		WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCart.click();
		Thread.sleep(3000);
		String path="C:\\Users\\gokul.s.dukre\\eclipse-workspace\\SeleniumProject\\SRCtest";
		TakesScreenshot ts =(TakesScreenshot) driver;
		String rm=RandomString.make(5);
				
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File (path+"\\"+ rm +"test.png");
		FileUtils.copyFile(src, destn);
		driver.quit();
		
	}

}


