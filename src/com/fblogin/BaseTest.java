package com.fblogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {
	public WebDriver driver=null;

	public void initializeWebEnvironment()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void tearDown()
	{
		System.out.println("Closing Browser");
		driver.close();
	}
}
