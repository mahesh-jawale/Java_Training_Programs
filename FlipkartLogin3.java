package com.package1;

import com.package2.Utilities;

public class FlipkartLogin3 {
	
	protected String strEmailID;
	protected String strPassword;
	 Utilities objUtilities=new Utilities();
	 
	public void setStrEmailID() {
		strEmailID = objUtilities.generateEmailAdd();
	}

	public void setStrPassword() {
		strPassword = objUtilities.generatePassword();;
	}

}
