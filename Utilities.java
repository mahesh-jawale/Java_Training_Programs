package com.generic;

import java.util.Random;

public class Utilities {

	Random objRandom=new Random();
	
	public String generateRandomFirstName()
	{
		String strFirstNames[]={"Mahesh","Sagar","Pooja","Nikhil","Jay"};
		String strFirstName=strFirstNames[objRandom.nextInt(strFirstNames.length)];
		return strFirstName;
	}
	
	
	public String generateRandomSurname()
	{
		String strSurNames[]={"Jawale","Khade","Patel","Jadhav","Patil"};
		String strSurName=strSurNames[objRandom.nextInt(strSurNames.length)];
		return strSurName;
		 
	}
	
	public String generateMobileNumOrEmailAdd()
	{
		String strEmailIdsOrMobNums[]={"xyz@gmail.com","8888877777","ghy@gamil.com","kkk@gmail.com","7777788888"};
		String strEmailIdOrMobNum=strEmailIdsOrMobNums[objRandom.nextInt(strEmailIdsOrMobNums.length)];
		return strEmailIdOrMobNum;
	}
	
	public char[] generatePassword()
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

		return charPassword;
		
	}
	
	
	public int generateDate()
	{
		int intMaxDate=33;
		int intMinDate=1;
		int intDate=objRandom.nextInt(intMaxDate-intMinDate)+intMinDate;
		return intDate;
	}
	
	public String generateMonth()
	{
		String strMonths[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String strMonth=strMonths[objRandom.nextInt(strMonths.length)];
		return strMonth;
	}
	
	public int generateYear()
	{
		int intMaxYear=2021;
		int intMinYear=1905;
		int intYear=objRandom.nextInt(intMaxYear-intMinYear)+intMinYear;
		return intYear;
	}
	
	public String generateGender()
	{
		String strGenders[]={"Male","Female"};
		String strGender=strGenders[objRandom.nextInt(strGenders.length)];
		return strGender;
	}
	
}
