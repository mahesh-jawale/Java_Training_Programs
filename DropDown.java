package com.basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement testDropDown=driver.findElement(By.xpath("//Select[@id='dropdown']"));
		Select objSelect=new Select(testDropDown);
		
		//Select By Index
		objSelect.selectByIndex(2);
		//Select By Value
		objSelect.selectByValue("1");
		//Select By Visible text
		objSelect.selectByVisibleText("Option 1");
	}

}
