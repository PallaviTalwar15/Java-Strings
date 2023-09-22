package sentencecase;

import java.util.Scanner;



public class SentenceCaseDemo {

	public static void main(String[] args) {
		///Input String from User.
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter A String");
				String inputString=scan.nextLine();
				
			// Create an object of class LetterCaseChanging
				SentenceCase caseChanger =new SentenceCase();
				String outputString=caseChanger.caseChanger(inputString);
				
				System.out.println("Changed String :"+outputString);
}
}

