package com.java.training.programs;

public class StringClassExample {

	public static void main(String[] args) {
	
		String strEmpName="Mahesh";//String literal
		String strEmpNameObj=new String("Mahesh");//using new keyword
		
		System.out.println(strEmpName.equals(strEmpNameObj));//true
		System.out.println(strEmpName==strEmpNameObj);//false
		
		System.out.println(strEmpName.charAt(0));//charAt method
		
		System.out.println(strEmpName.compareTo(strEmpNameObj));//CompareTo method
		
		System.out.println(strEmpName.endsWith("hesh"));//endwith method
		
		System.out.println(strEmpName.equalsIgnoreCase(strEmpNameObj));//equalsIgnoreCase method
		
		byte byteVar[]=strEmpName.getBytes();//getbytes() method
		
		for(int intI=0;intI<byteVar.length;intI++)
		{  
			System.out.println(byteVar[intI]);  
		} 
		
		System.out.println(strEmpName.indexOf("esh"));//intern() method
		
		strEmpNameObj=strEmpNameObj.intern();
		System.out.println(strEmpName==strEmpNameObj);
		
		
		System.out.println(strEmpName.isEmpty());//isEmpty() method
		
		 String strDate = String.join("/","25","06","2018");//join method    
	     System.out.println(strDate);  
		
	     System.out.println(strEmpName.lastIndexOf('e'));//lastIndexOf() method
	     
	     System.out.println(strEmpName.length());//length() method
	     
	     System.out.println(strEmpName.replace('M', 'G'));//replace method
	     
	     System.out.println(strEmpName.replaceAll("h", "m"));//replaceAll method
	     
	     //split() method
	     strEmpName="Mahesh Jawale";
	     String strArray[]=strEmpName.split("\\s");
	     System.out.println(strArray);
	     for(String strVar:strArray){  
	    	 System.out.println(strVar);  
	    	 }  
	     
	     System.out.println(strEmpName.startsWith("Ma"));//startsWith()
	     
	     System.out.println(strEmpName.substring(7));//substring
	     
	     char[] charArray=strEmpName.toCharArray();// charArray() method
	     for(int intI=0;intI<charArray.length;intI++){  
	    	 System.out.println(charArray[intI]);  
	    	 }
	     
	     System.out.println(strEmpName.toLowerCase());//toLowerCase() method
	     
	     System.out.println(strEmpName.toUpperCase());//toUpperCase() method
	     
	     strEmpName=" Mahesh Jawale ";//trim() method
	     System.out.println(strEmpName.trim());

	}

}
