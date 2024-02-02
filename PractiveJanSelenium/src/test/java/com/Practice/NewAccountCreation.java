package com.Practice;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccountCreation  {
	 public static String generateRandomName() {
	        String[] firstNames = {"John", "Alice", "Bob", "Emma", "David", "Sophia", "Michael", "Olivia"};
	        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};

	        Random rand = new Random();
	        String randomFirstName = firstNames[rand.nextInt(firstNames.length)];
	        String randomLastName = lastNames[rand.nextInt(lastNames.length)];

	        return randomFirstName + " " + randomLastName;
	    }
	  
	 public static void selectDropdownByVisibleText(WebElement Element, String visibleText) {
	        Select sel =new Select(Element);
	        sel.selectByValue("Broker");
	        
	    }

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://truckstop--staging.sandbox.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Ftruckstop--staging.sandbox.lightning.force.com%252Flightning%252Fpage%252Fhome");
		//UserName-gokulshahajidukre@truckstop.com.staging
		//Maharashtra@123
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("gokulshahajidukre@truckstop.com.staging");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Maharashtra@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement dropdownLead=driver.findElement(By.xpath("//button[@title='Show Navigation Menu']//lightning-primitive-icon[@variant='bare']//*[name()='svg']"));
		
		//span[text()='Leads']
		Thread.sleep(4000);
		WebElement svgObj = driver.findElement(By.xpath("//button[@title='Show Navigation Menu']//lightning-primitive-icon[@variant='bare']//*[name()='svg']"));
		Actions actionBuilder = new Actions(driver);
		actionBuilder.click(svgObj).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);
		
		String randomName = generateRandomName();
        System.out.println("Generated Name: " + randomName);
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys(randomName);
		WebElement businessType=driver.findElement(By.xpath("(//button[contains(@id,'combobox-button')])[2]"));
		//businessType.click();
		actionBuilder.click(businessType).build().perform();
		NewAccountCreation.selectDropdownByVisibleText(businessType, "Broker");
		driver.findElement(By.xpath("(//(//span[@class='slds-media__body'])[3]"));
		//(//span[@class='slds-media__body'])[3]
		WebElement leadStatus=driver.findElement(By.xpath("//button[@id='combobox-button-1222']"));
		leadStatus.click();
		NewAccountCreation.selectDropdownByVisibleText(leadStatus, "Qualified");
		//input[@id='combobox-input-1832']
		driver.findElement(By.xpath("//input[@id='combobox-input-1832']")).sendKeys("912, Northwest Hwy");
		driver.findElement(By.xpath("//textarea[@id='input-1422']")).sendKeys("912, Northwest Hwy");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Fox River Grove");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Fox River Grove");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("//input[@name='province']");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("60021");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("US");
		Thread.sleep(2000);
		WebElement Salutation=driver.findElement(By.xpath("//button[@name='salutation']"));
		Salutation.click();
		NewAccountCreation.selectDropdownByVisibleText(Salutation, "Mr");
		//button[@name='firstName']
		driver.findElement(By.xpath("//button[@name='firstName']")).sendKeys(randomName);
		
		
		//button[@name='salutation']
		driver.close();
	}

}
