package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTagname {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gokul");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dukre");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("986574746");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Gokul@gmail.com");
		//input[@name='address1']
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("AT post mangrul tq: Kallam");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Kallam");
		//input[@name='state']
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		//input[@name='postalCode']
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("413507");
		
		//select[@name='country']
		WebElement 	Country_drp=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(Country_drp);
		sel.selectByIndex(3);
		//input[@id='email']
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Gokuldukare");
		//input[@name='password']
		String pass1="2672376";
		WebElement Pass=driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("pass1");
		//input[@name='confirmPassword']
		String pass2="2672376";
		WebElement PassNew=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		PassNew.sendKeys("pass2");
		if (pass1.equals(pass2)==true) {
			driver.findElement(By.xpath("//input[@name='submit']")).click();
		}
		else {
			System.out.println("Not equal");
		}
		//Assert.assertEquals(pass1, pass2);
		
	}

}
