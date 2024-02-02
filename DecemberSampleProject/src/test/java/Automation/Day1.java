package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		//input[@id='email']
		driver.findElement(By.xpath("//a [contains(@id,'u_0_0_')]")).click();
		//input[@id='pass']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='u_18_s_Ox']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
