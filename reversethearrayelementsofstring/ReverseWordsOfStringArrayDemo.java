package reversethearrayelementsofstring;

import java.util.Scanner;

public class ReverseWordsOfStringArrayDemo {

	public static void main(String[] args) {
		///Input String from User.
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter A String");
				String inputString=scan.nextLine();
				
			// Create an object of class ReverseWordsOfStringArray
				ReverseWordsOfStringArray reverseWord= new ReverseWordsOfStringArray();
				String outputString=reverseWord.reverseWord(inputString);
				
				System.out.println("Reversed String :"+outputString);
				
			

	}

}
