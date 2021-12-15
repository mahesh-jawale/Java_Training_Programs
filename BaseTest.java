package com.encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver=null;
	public void initializeWebEnvironment(String strURL) {
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(strURL);

	}
	public WebDriver getDriver()
	{
		return driver;
	}

}
