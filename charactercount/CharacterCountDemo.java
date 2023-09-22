package com.kn.charactercount;

public class CharacterCountDemo {

	public static void main(String[] args) {

		//Input String
		String s1="AABCCD";
		//Converting String to Array.
		char [] crr=s1.toCharArray();

		//Character to Counted in the given String. 
		char ch = 0;
		int count=0;

		for(int i=0;i<crr.length;i++) {
			ch=crr[i];
			for(int j=i+1;j<crr.length;j++) {
				if(crr[i]== ch) {
					count++;
				}

			}


			System.out.println("Count of "+ch +"="+count);

		}
	}

}





