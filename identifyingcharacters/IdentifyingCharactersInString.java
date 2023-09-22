package com.kn.identifyingcharacters;

public class IdentifyingCharactersInString {

	public void characterInString(String inputString) {

		// Convert the String to character array
		char [] crr=inputString.toCharArray();

		StringBuffer outputString=new StringBuffer();
		int vucount=0,cucount=0,dcount=0,sccount=0,vlcount=0,clcount=0,scount=0;

		for (int i=0;i<crr.length;i++) {

			if(65<=crr[i] && crr[i]<=90) {
				if(crr[i]=='A' || crr[i]=='E'|| crr[i]=='I'|| crr[i]=='O'|| crr[i]=='U') {
					vucount++;

				}
				else {

					cucount++;

				}



			}
			else if(97<=crr[i] && crr[i]<=122) {
				if(crr[i]=='a' || crr[i]=='e'|| crr[i]=='i'|| crr[i]=='o'|| crr[i]=='u') {
					
					vlcount++;

				}
				else {
					clcount++;


				}

			}

			else if(48<=crr[i] && crr[i]<=57) {
				dcount++;


			}
			else if(crr[i]==32) {
				scount++;


			}
			else {
				sccount++;

			}


		}
		System.out.println("UpperCase");
		System.out.println("Vowels="+ vucount);
		System.out.println("Consonant="+ cucount);

		System.out.println("\nLower Case");
		System.out.println("Vowels="+ vlcount);
		System.out.println("Consonant="+ clcount);

		System.out.println("\nDigit:");
		System.out.println("Digit="+dcount);

		
		System.out.println("\nSpace="+scount);

		System.out.println("\nSpecial character="+sccount);
	}
}



