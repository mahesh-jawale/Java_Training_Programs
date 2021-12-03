package com.fb.signup.pagefactory;

import com.generic.SeleniumWrapperFunctions;

public class SignUpPage extends SeleniumWrapperFunctions {

	
	public void setFirstNameInFBSignUpPage(String strFirstName) {
		
		System.out.println("First Name is : " + this.setText(strFirstName));
	}

	public void setSurnameInFBSignUpPage(String strSurname) {
		System.out.println("Surname is : " + this.setText(strSurname));
	}

	public void setMobileNumInFbSignUpPage(String strMobileNum) {

		System.out.println("Mobile Number is : " + this.setText(strMobileNum));
	}

	public void setEmailAddInFbSignUpPage(String strEmailAdd) {

		System.out.println("Email Address is : " + this.setText(strEmailAdd));
	}

	public void setPasswordInFBSignUpPage(char charPasssword[]) {
		System.out.println("Password is : " +this.setText(String.valueOf(charPasssword)));
	}

	public void selectDate(int intDate) {
		System.out.println("Date is : " + this.setText(Integer.toString(intDate)));
	}

	public void selectMonth(String strMonth) {
		System.out.println("Month is : " + this.setText(strMonth));
	}

	public void selectYear(int intYear) {
		System.out.println("Year is : " + this.setText(Integer.toString(intYear)));
	}

	public void selectGender(String strGender) {
		System.out.println("Gender is : " + this.setText(strGender));
	}

	public void clickOnSignUpButton() {
		System.out.println("SignUp button is clicked");
	}

}
