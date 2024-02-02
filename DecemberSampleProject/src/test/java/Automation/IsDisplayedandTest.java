package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		if (Email.isDisplayed()&& Email.isEnabled()) {
			Email.sendKeys("Gokul@gmail.com");
		} else {
			System.out.println("Not Enabled");
		}
		if (pass.isDisplayed()&& pass.isEnabled()) {
			pass.sendKeys("gokul");
		} else {
			System.out.println("Pass field is not enabled");
		}
		WebElement Login=driver.findElement(By.xpath("//*[contains(@id,'u_0_5_')]"));
		Login.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//a[@role='button']")).click();
//		Alert alt=driver.switchTo().alert();
//		alt.dismiss();

	}

}
