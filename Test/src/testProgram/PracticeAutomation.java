package testProgram;

import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomation {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        String prtAdd = driver.getWindowHandle();
        System.out.println(prtAdd);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> allAdd = driver.getWindowHandles();
        System.out.println(allAdd);
        
        Iterator<String> it= allAdd.iterator();
        while (it.hasNext()) {
            String chAdd = it.next();
            if (!prtAdd.equals(chAdd)) {
                driver.switchTo().window(chAdd);
                driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gokul@gmail.com");
                driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
              
                
                driver.close();
                driver.quit();
            }
        }
    }

		

	}


