package com.fb.signup.test;

import com.fb.signup.pagefactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class SignUpTest extends BaseTest
{
	
	public void beforeMainMethod()
	{
		this.initializeWebEnvironment("https://www.facebook.com/reg/");
	}
	
	public static void main(String[] args) {
		
		SignUpPage objSignUpPage = new SignUpPage();
		Utilities objUtilities = new Utilities();
		SignUpTest objSignUpTest=new SignUpTest();
		
		objSignUpTest.beforeMainMethod();
		
		String strFirstName = objUtilities.generateRandomFirstName();
		objSignUpPage.setFirstNameInFBSignUpPage(strFirstName);

		String strSurname = objUtilities.generateRandomSurname();
		objSignUpPage.setSurnameInFBSignUpPage(strSurname);
		
		String strMobileNum=objUtilities.generateMobileNum();
		objSignUpPage.setMobileNumInFbSignUpPage(strMobileNum);
		
		String strEmailAdd=objUtilities.generateEmailAdd();
		objSignUpPage.setEmailAddInFbSignUpPage(strEmailAdd);
				
		char charPassword[]= objUtilities.generatePassword();
		objSignUpPage.setPasswordInFBSignUpPage(charPassword);
		
		String strGender=objUtilities.generateGender();
		objSignUpPage.selectGender(strGender);
		
		int intDate=objUtilities.generateDate();
		objSignUpPage.selectDate(intDate);
		
		String strMonth=objUtilities.generateMonth();
		objSignUpPage.selectMonth(strMonth);
		
		int intYear=objUtilities.generateYear();
		objSignUpPage.selectYear(intYear);
		
		objSignUpPage.clickOnSignUpButton();
		
		objSignUpTest.afterMainMethod();
		
	}

	public void afterMainMethod()
	{
		tearDown();
	}
}
