package com.basic.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//WebDriver class methods
		
		//driver.get("URL"); method
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		//driver.getTitle(); returns String
		System.out.println(driver.getTitle());
		
		//returns URL
		System.out.println(driver.getCurrentUrl());
		
		//returns HTML code of Page
		//System.out.println(driver.getPageSource());
		
		//closes current tab
		driver.close();
		
		//closes all tabs in browser
		driver.quit();

	}

}
