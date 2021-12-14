package com.basic.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		
		WebElement destination=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions objAction=new Actions(driver);
		
		objAction.dragAndDrop(source, destination).build().perform();

	}

}
