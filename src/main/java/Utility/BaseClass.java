package Utility;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void SetUp() throws IOException {
		config =new ConfigDataProvider();
	}
	
	
	@BeforeTest
	public void StartUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(config.getBaseUrl());
	}

}
