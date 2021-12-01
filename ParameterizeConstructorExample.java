package com.java.training.programs;

public class ParameterizeConstructorExample {

	//ChromeWebdriver Object Creation By Using Parameterize Constructor
	
	String strWebDriverRefVar;
	
	public ParameterizeConstructorExample(String strChromeDriverObject)
	{
		strWebDriverRefVar=strChromeDriverObject;
		System.out.println("Driver = "+strWebDriverRefVar);
	}
	
	public static void main(String[] args) {
 
		//1. Set the chrome driver property
		System.out.println("webdriver.chrome.driver is set to C:\\chromedriver.exe");
		
		//2. Initialize Webdriver reference variable with chrome driver object
		ParameterizeConstructorExample objParameterizeConstructorExample=new ParameterizeConstructorExample("ChromeDriver");

		//3. Open a url using chrome driver
		System.out.println("Opening the URL using chrome driver");
		
	}

}
