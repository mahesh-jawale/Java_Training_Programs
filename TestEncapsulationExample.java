package com.encapsulation;

public class TestEncapsulationExample extends BaseTest  {

	public static void main(String[] args) {
	
		EncapsulationExample objEncapsulationExample=new EncapsulationExample();
		BaseTest objBaseTest=new BaseTest();
		objEncapsulationExample.setURL("https://www.flipkart.com/");
		objBaseTest.initializeWebEnvironment(objEncapsulationExample.getURL());
		

	}

}
