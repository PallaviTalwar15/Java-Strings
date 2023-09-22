package com.kn.duplicatecharacter;

public class RemoveDuplicateInString {

	
public String removeDuplicate(String inputString) {
	StringBuffer outputString= new StringBuffer();
	char[] crr= new char[inputString.length()];
			int k=0;
	for(int i=0;i<inputString.length();i++) {
		boolean isPresent=false;
		for(int j=0;j<crr.length;j++) {
			if(inputString.charAt(i)==crr[j]) {
				isPresent=true;
			}
		}
			if(!isPresent) {
				crr[k]=inputString.charAt(i);
				k++;
				
			}
			
		}
	
		
		return outputString.toString();
	}
}

