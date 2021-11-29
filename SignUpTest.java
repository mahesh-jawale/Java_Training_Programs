package com.fb.signup.test;

import com.fb.signup.pagefactory.SignUpPage;

public class SignUpTest {

	public static void main(String[] args) {
		SignUpPage.verifySignUpPageIsDisplayed();
		SignUpPage.verifyFirstNameTextBox();
		SignUpPage.verifySecondNameTextBox();
		SignUpPage.verifyMobileNumOrEmailAdd();
		SignUpPage.verifyPassword();
		SignUpPage.verifyDOB();
		SignUpPage.verifyGender();
		SignUpPage.verifySignUpButton();
	}

}
