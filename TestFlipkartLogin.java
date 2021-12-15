package com.privateaccessmodifier;

public class TestFlipkartLogin {

	public static void main(String[] args) {
	Utilities objUtilities=new Utilities();
	FlipkartLogin objFlipkartLogin=new FlipkartLogin();
	
	objFlipkartLogin.setStrEmailID(objUtilities.generateEmailAdd());
	System.out.println(objFlipkartLogin.getStrEmailID());
	
	objFlipkartLogin.setStrPassword(objUtilities.generatePassword());
	System.out.println(objFlipkartLogin.getStrPassword());
	

	}

}
