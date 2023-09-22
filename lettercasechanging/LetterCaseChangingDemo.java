package lettercasechanging;

import java.util.Scanner;

public class LetterCaseChangingDemo {
	public static void main(String[] args) {
		///Input String from User.
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter A String");
				String inputString=scan.nextLine();
				
			// Create an object of class LetterCaseChanging
				LetterCaseChanging caseChanger =new LetterCaseChanging();
				String outputString=caseChanger.caseChanger(inputString);
				
				System.out.println("Changed String :"+outputString);
}
}
