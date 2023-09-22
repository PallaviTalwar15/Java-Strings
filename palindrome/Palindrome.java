package com.kn.palindrome;

public class Palindrome {
	public String palindromeString(String inputString) {
		 
		 StringBuffer sb=new StringBuffer();
		 
		 char[] crr = inputString.toCharArray();
		 for(int i=crr.length-1;i>=0;i--) {
			 
			 sb=sb.append(crr[i]);
		 }
		 
		String outputString=sb.toString();
		
		if(outputString.equals(inputString))
		{
			System.out.println(outputString+"\nIts a Palindrome");
		}
		
		else {
			System.out.println(outputString+"\nIts not a Palindrome");
		}
		
		
		return outputString;
		 
	
}
}