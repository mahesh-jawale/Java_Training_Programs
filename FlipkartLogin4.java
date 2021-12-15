package com.package1;

import com.package2.Utilities;

public class FlipkartLogin4 {

	public String strEmailID;
	public String strPassword;
	 Utilities objUtilities=new Utilities();
	 
	public void setStrEmailID() {
		strEmailID = objUtilities.generateEmailAdd();
	}

	public void setStrPassword() {
		strPassword = objUtilities.generatePassword();;
	}
}
