package Automation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfc.com");
		driver.manage().window().maximize();

		// Handling the Alert (if exists)
		try {
		    Alert alt = driver.switchTo().alert();
		    System.out.println(alt.getText());
		    alt.dismiss();
		} catch (NoAlertPresentException e) {
		    System.out.println("No Alert present.");
		}

		// Clicking on the dropdown
		WebElement dropdown = driver.findElement(By.xpath("//xpath-to-your-dropdown-element"));
		dropdown.click();

		// Retrieving list of elements in the dropdown
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='product-tab-list product-category-list dropdown-active']//li"));

		System.out.println("List of WebElements: " + list.size());	}

}
