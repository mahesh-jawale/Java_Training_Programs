package com.package2;

import java.util.Random;

public class Utilities {
	
	Random objRandom=new Random();
	
	public String generateEmailAdd()
	{
		String strEmailAddProviders[]={"@gmail.com","@yahoo.com","@rediffmail.com"};
		String strEmailAddProvider=strEmailAddProviders[objRandom.nextInt(strEmailAddProviders.length)];
		int length=6;
		String strLettersandNums="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String randomString="";
		for(int index=0;index<length;index++){
		int rnum= (int)((Math.random()*strLettersandNums.length()));
		randomString +=strLettersandNums.substring(rnum, rnum+1);
		}
		return randomString+strEmailAddProvider;
	}
	
	
	public String generatePassword()
	{
		String strCapitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strLowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String strSpecialCharacters = "!@#$";
		String strNumbers = "1234567890";

		String strCombinedChars = strCapitalCaseLetters + strLowerCaseLetters + strSpecialCharacters + strNumbers;

		char[] charPassword = new char[6];

		charPassword[0] = strLowerCaseLetters.charAt(objRandom.nextInt(strLowerCaseLetters.length()));
		charPassword[1] = strCapitalCaseLetters.charAt(objRandom.nextInt(strCapitalCaseLetters.length()));
		charPassword[2] = strSpecialCharacters.charAt(objRandom.nextInt(strSpecialCharacters.length()));
		charPassword[3] = strNumbers.charAt(objRandom.nextInt(strNumbers.length()));

		for (int i = 4; i < 6; i++) {
			charPassword[i] = strCombinedChars.charAt(objRandom.nextInt(strCombinedChars.length()));
		}

		return String.valueOf(charPassword);
		
	}

}
