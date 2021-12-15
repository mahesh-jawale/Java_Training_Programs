package com.defaultaccessmodifier;

public class FlipkartLogin2 {
	 String strEmailID;
	 String strPassword;
	 Utilities objUtilities=new Utilities(); 
	 
	public void setStrEmailID() {
		strEmailID = objUtilities.generateEmailAdd();
	}

	public void setStrPassword() {
		strPassword = objUtilities.generatePassword();;
	}

	
	
	



	



}
