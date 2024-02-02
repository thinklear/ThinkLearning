package com.TestSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectSeprateClass {
	public static void countrydrp(WebElement element, String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		System.out.println(element);
		System.out.println(text);
	}


}
