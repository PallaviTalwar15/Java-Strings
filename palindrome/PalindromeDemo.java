package com.kn.palindrome;
import java.util.Scanner;
public class PalindromeDemo {

	public static void main(String[] args) {
		
		// Take the input String from user
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String = ");
		String inputString=scan.nextLine();
			
		//create a object to call method Palindrome
		Palindrome palindromeString = new Palindrome();
		
		//call the method 
		String outputString=palindromeString.palindromeString(inputString);
		
		//Release Resource
		scan.close();
		

	}

}
