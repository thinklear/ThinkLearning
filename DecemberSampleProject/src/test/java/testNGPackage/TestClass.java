package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	WebElement search;
	
	@BeforeSuite
	public void bS() {
		System.out.println("Before usite");
	}
	@BeforeTest
	public void bT() {
		System.out.println("Before Test");
		}
	
	@BeforeClass
	public void bC() {
		System.out.println("Before Class");
		}
	
	@Parameters ({"BrowserName"})
	@BeforeMethod
	public void bM(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Before method Executed");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		}else if (BrowserName.equalsIgnoreCase("Edge")){
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.amazon.com/");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
	
	@Test 
	public void testTest() {
		
		System.out.println("Test");
		 search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Apple Mobile");
		WebElement submit= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		if (submit.isDisplayed()&& (submit.isEnabled())==true)
		submit.click();
		System.out.println("Submit button clicked");
	
	}
	@Test (enabled=false)
	public void test2() {
		System.out.println("Second test started");
		WebElement todays_offer= driver.findElement(By.xpath("//a[contains(@href,'/gp/goldbox?ref_=nav_cs_gb')]"));
		todays_offer.click();
		search.sendKeys("Samsung");
		
	}
	@Test (priority=0,dependsOnMethods= {"testTest"}, invocationCount=2)
	public void test3() throws Exception{
			search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			search.sendKeys("Apple Mobile");
			WebElement submit= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			if (submit.isDisplayed()&& (submit.isEnabled())==true)
				submit.click();
			System.out.println("Submit button clicked");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='New Simple Mobile Prepaid - Apple iPhone SE (64GB) - (Product) RED [Locked to Carrier - Simple Mobile]']")).click();
			System.out.println("3 testcase executed ");
		    WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		    addToCart.click();
		    WebElement proceedToCheckout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		    proceedToCheckout.click();
		    WebElement Email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		    Email.sendKeys("dukaregokul");
		    WebElement countinue_BTN=driver.findElement(By.xpath("//input[@id='continue']"));
		    countinue_BTN.click();
		    
	}
	@AfterMethod
	public void aF() throws Exception {
		
		System.out.println("After method started..... ");
		Thread.sleep(2000);
		driver.close();
	}
	

}
