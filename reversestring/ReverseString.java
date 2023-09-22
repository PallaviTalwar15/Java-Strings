package com.kn.reversestring;

public class ReverseString {
 public String reverseString(String inputString) {
	 
	 StringBuffer outputString=new StringBuffer();
	 
	 char[] crr = inputString.toCharArray();
	 for(int i=crr.length-1;i>=0;i--) {
		 
		 outputString=outputString.append(crr[i]);
	 }
	 
	return outputString.toString();
	 
 }
}
