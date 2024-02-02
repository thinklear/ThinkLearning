package testNGPackage;



import static org.junit.Assert.assertArrayEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTesting {
	WebDriver driver;
	WebElement search;
	@BeforeMethod 
	public void bM() {
		System.out.println("Before method Executed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	@Test
	public void testAssertion() throws Exception {
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Assertion testing started");
		search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Apple Mobile");
		WebElement submit= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		if (submit.isDisplayed()&& (submit.isEnabled())==true)
			submit.click();
		System.out.println("Submit button clicked");
		Thread.sleep(2000);
		
		WebElement apple_SE64_GB=driver.findElement(By.xpath("//span[normalize-space()='New Simple Mobile Prepaid - Apple iPhone SE (64GB) - (Product) RED [Locked to Carrier - Simple Mobile]']"));
		apple_SE64_GB.click();
		String exp_Title="New Simple Mobile Prepaid - Apple iPhone SE (64GB) - (Product) RED [Locked to Carrier - Simple Mobile]";
		String act_Title=driver.getTitle();
		soft.assertEquals(exp_Title, act_Title);
		System.out.println("3 testcase executed ");
		
	    WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	    addToCart.click();
		System.out.println("Assertion testing Ended");
		soft.assertAll();
	}

}
