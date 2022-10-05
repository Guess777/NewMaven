package Utility;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
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
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(opt);
		driver.get(config.getBaseUrl());
	}

	@AfterSuite
	public void endUp()
	{	
		driver.close();
		
		
		
	}
}
