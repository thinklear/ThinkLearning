package Automation;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.w3schools.com/");
		System.out.println(driver.getTitle());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open(https://www.w3schools.com/)");
		String prtAdd=driver.getWindowHandle();
		
		Set<String> allAdd=driver.getWindowHandles();
		//driver.navigate().to("https://www.w3schools.com/");
		java.util.Iterator<String> iterator=allAdd.iterator();
		System.out.println("Executed");
		
		while(iterator.hasNext()) {
			String nextAdd=iterator.next();
			if (!allAdd.equals(nextAdd)) {
				driver.switchTo().window(nextAdd);
				System.out.println("Executed1111");
				System.out.println(driver.getCurrentUrl());
			}
		}
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		//driver.close();
//		driver.quit();
		

	}

}
