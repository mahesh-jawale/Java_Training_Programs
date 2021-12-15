package com.finalkeyword;

public class TestFinalkeyword {

	public static void main(String[] args) {
		Finalkeyword objFinalVariable=new Finalkeyword("https://www.flipkart.com/");
		BaseTest objBaseTest=new BaseTest();
		
		objBaseTest.initializeWebEnvironment(objFinalVariable.getURL());
		
	}

}
