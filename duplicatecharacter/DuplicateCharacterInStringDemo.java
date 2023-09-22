package com.kn.duplicatecharacter;
import java.util.Scanner;
public class DuplicateCharacterInStringDemo {

	public static void main(String [] args) {

		 //iNPUT sTRING FROM USER.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString=scan.nextLine();
		
		RemoveDuplicateInString removeDuplicate=new RemoveDuplicateInString();
		String outputString = removeDuplicate.removeDuplicate(inputString);
		
		System.out.println("The String: "+outputString);
		
		scan.close();
		
	}

}

