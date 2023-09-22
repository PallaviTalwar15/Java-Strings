package com.kn.identifyingcharacters;

import java.util.Scanner;

public class IdentifyingCharactersInStringDmeo {

	public static void main(String[] args) {
		
		// Take the input String from user
				Scanner scan=new Scanner(System.in);
				System.out.println(" Enter the String = ");
				String inputString=scan.nextLine();
					
				//create a object to call method
				IdentifyingCharactersInString characterInString=new IdentifyingCharactersInString();
				
				
				//call the method
				characterInString.characterInString(inputString);
				
				
				//Release Resource
				scan.close();
	}

}
