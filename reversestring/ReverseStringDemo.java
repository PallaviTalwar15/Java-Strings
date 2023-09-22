package com.kn.reversestring;
import java.util.Scanner;
public class ReverseStringDemo {

	public static void main(String[] args) {
		// Take the input String from user
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the String = ");
		String inputString=scan.nextLine();
			
		//create a object to call method reverseString
		ReverseString reverseString = new ReverseString();
		
		//call the method
		String outputString=reverseString.reverseString(inputString);
		
		System.out.println("The Reversed String = "+outputString);
		
		//Release Resource
		scan.close();
		

	}

}
