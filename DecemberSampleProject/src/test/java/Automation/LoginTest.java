package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
	 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String Ex_Title= "Facebook – log in or sign ";
		if (Ex_Title.equals(driver.getTitle())==true) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("failed");
		}
		WebElement Login=driver.findElement(By.xpath("//*[contains (@id,'u_0_5_')]"));
		Login.click();
		driver.close();
		
		

		

	}

}
