package Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	public static void getclick(WebElement element)
	{
		
		element.click();
		
	}
	
	
}
