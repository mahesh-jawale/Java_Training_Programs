package com.fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FBlogin extends BaseTest {


	@BeforeClass
	public void beforeMethod()
	{
		this.initializeWebEnvironment();
		
	}


	
	@Test
	public void testFBlogin()
	{
		
		
		
		this.getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		this.getDriver().findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz@123");
		this.getDriver().findElement(By.xpath("//button[text()='Log In']")).click();
	
	}
	
	@AfterClass
	public void tearDown()
	{
	this.getDriver().close();
		
	}

}
