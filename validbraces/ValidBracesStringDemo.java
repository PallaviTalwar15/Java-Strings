package validbraces;

import java.util.Scanner;

public class ValidBracesStringDemo {

	public static void main(String[] args) {
		///Input String from User.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter A String");
		String inputString=scan.nextLine();
		
	// Create an object of class LetterCaseChanging
		ValidBracesString bracesCount =new ValidBracesString();
		//String outputString=
				bracesCount.bracesCount(inputString);
		
		

	}

}
