package com.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions (driver);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		act.keyDown(email, Keys.SHIFT).sendKeys("goukl@gmail.com").keyUp(Keys.SHIFT).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//button [contains(@id,'u_0_5_')]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}


}
