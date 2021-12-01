package com.fb.signup.pagefactory;

public class SignUpPage {

	public void setFirstNameInFBSignUpPage(String strFirstName) {
		System.out.println("First Name is : " + strFirstName);
	}

	public void setSurnameInFBSignUpPage(String strSurname) {
		System.out.println("Surname is : " + strSurname);
	}

	public void setMobileNumInFbSignUpPage(String strMobileNum) {

		System.out.println("Mobile Number is : " + strMobileNum);
	}

	public void setEmailAddInFbSignUpPage(String strEmailAdd) {

		System.out.println("Email Address is : " + strEmailAdd);
	}

	public void setPasswordInFBSignUpPage(char charPasssword[]) {
		System.out.println("Password is : " + String.valueOf(charPasssword));
	}

	public void selectDate(int intDate) {
		System.out.println("Date is : " + intDate);
	}

	public void selectMonth(String strMonth) {
		System.out.println("Month is : " + strMonth);
	}

	public void selectYear(int intYear) {
		System.out.println("Year is : " + intYear);
	}

	public void selectGender(String strGender) {
		System.out.println("Gender is : " + strGender);
	}

	public void clickOnSignUpButton() {
		System.out.println("SignUp button is clicked");
	}

}
