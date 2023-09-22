package romannumber;

import java.util.Scanner;


public class RomanNumberDemo {

	public static void main(String[] args) {
		///Input String from User.
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter A number");
				int  inputString=scan.nextInt();
				
			// Create an object of class LetterCaseChanging
				RomanNumber romanNumber =new RomanNumber();
				String output=romanNumber.romanNumber(inputString);

	
				
				System.out.println("Roman Format= "+output);
	}

}
