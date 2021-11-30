package com.fb.signup.test;

import com.fb.signup.pagefactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class SignUpTest {

	public static void main(String[] args) {
		BaseTest objBaseTest=new BaseTest();
		SignUpPage objSignUpPage = new SignUpPage();
		Utilities objUtilities = new Utilities();
		
		objBaseTest.initializeWebEnvironment("https://www.facebook.com/reg/");
		
		String strFirstName = objUtilities.generateRandomFirstName();
		objSignUpPage.setFirstNameInFBSignUpPage(strFirstName);
		
		String strSurname = objUtilities.generateRandomSurname();
		objSignUpPage.setSurnameInFBSignUpPage(strSurname);
		
		String strMobileNumOrEmailAdd = objUtilities.generateMobileNumOrEmailAdd();
		objSignUpPage.setMobileNumOrEmailAddInFbSignUpPage(strMobileNumOrEmailAdd);
		
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
		
		objBaseTest.tearDown();
	}

}
