package com.basic.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClassMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.close();

	}

}
