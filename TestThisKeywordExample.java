package com.thiskeyword;

import java.util.Random;

public class TestThisKeywordExample extends ThisKeywordExample {
	
	
	
	
	public static void main(String[] args) {
		Random objRandom=new Random();
		ThisKeywordExample objThisKeywordExample=new ThisKeywordExample();
		
		String strFlavours[]={"Vanila","Strawberry","Blackberry","Blueberry","Chocolate"};
		String strFlavour=strFlavours[objRandom.nextInt(strFlavours.length)];
		objThisKeywordExample.setFlavourAndGetPrice(strFlavour);
		
	}
	

}
