package testProgram;

import java.io.File;
import com.google.common.io.Files;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandaling {
	public static void main (String []args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String path="/Test/Screenshot";
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File src= scrShot.getScreenshotAs(OutputType.FILE);
		File dstn= new File(path+"test.png");
		Files.copy(src,dstn);
		
	
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("2345");
		////input[@name='submit']
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.getText();
		alt.accept();
		alt.getText();
		alt.accept();
		driver.quit();
		
		
		
		
	}

}
