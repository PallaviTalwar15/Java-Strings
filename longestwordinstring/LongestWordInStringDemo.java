package longestwordinstring;

import java.util.Scanner;

public class LongestWordInStringDemo {

	public static void main(String[] args) {
		
		//Input String from User.
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter A String");
				String inputString=scan.nextLine();
				
			// Create an object of class LongestWordInString
				LongestWordInString longWord=new LongestWordInString();
				
				// calling the method 
				String outputString=longWord.longestWord(inputString);
				
				System.out.println("Longest word:"+outputString);
				
	}
}
