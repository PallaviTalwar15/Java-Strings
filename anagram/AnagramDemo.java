package com.kn.anagram;

import java.util.Scanner;

public class AnagramDemo {

	public static void main(String[] args) {
		
			 //2 Input string from user .
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first String");
			String s1=scan.nextLine();

			System.out.println("Enter second String");
			String s2=scan.nextLine();
			
			// creating object of Anagram 
			Anagram anagram= new Anagram();
			
			// calling the object
			boolean isAnagram=anagram.anagram(s1,s2);
			
			//Print output
			if(isAnagram) {
			System.out.println("Is Anagram");
			}
			
			else {
				System.out.println("Is not Anagram");
			}
	}

}
