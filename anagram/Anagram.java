package com.kn.anagram;

public class Anagram {

	public boolean anagram(String s1, String s2) {
		
		
		boolean isAnagram=false;
		//Checks the length of Strings
		if(s1.length()==(s2.length()))
				{
			
			//Converts string to Character Array
			char [] crr1=s1.toCharArray();
			char [] crr2=s2.toCharArray();
			
			//calling the sort method.
			 crr1=sortCharacterArray(crr1);
			 crr2=sortCharacterArray(crr2);
			 
			 
			
			for(int i=0;i<crr1.length;i++) {
				
				// comparing elements of both arrays
				if(crr1[i]==crr2[i]) {
					isAnagram=true;
				}
				else {
					isAnagram=false;
				}

			}

		}
		
		return isAnagram;
		
	}
	
	
//Method to sort elements[BubbleSort]
	public char[] sortCharacterArray(char[] crr) {
		
		char temp=0;
		// Loop for Pass 
				for(int i=0;i<crr.length;i++)
				{
					boolean swapped=false;
					
					// Comparing Values in array
					for(int j=0;j<crr.length-1-i;j++) {
						
						//Swapping of Elements
						if(crr[j]>crr[j+1]) {
							temp=crr[j];
							crr[j]=crr[j+1];
							crr[j+1]=temp;
							
						}
						 
						swapped=true;
						
						
					}
					
					if(swapped==false)
					{
						break;
					}
					
				}
				
				return crr;
		
	}

}
