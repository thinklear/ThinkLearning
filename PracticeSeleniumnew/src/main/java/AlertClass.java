import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1233455");
		//input[@name='submit']
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt=	driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();
		System.out.println(alt.getText());
//		alt.dismiss();
		driver.quit();
	}

}
