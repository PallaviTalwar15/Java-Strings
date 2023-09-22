package charactercount;

import java.util.Scanner;

public class CharacterCountInStringDemo {

	public static void main(String[] args) {
		 //iNPUT sTRING FROM USER.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString=scan.nextLine();
		
		// Creating the object 
		CharacterCountInString characterCount=new CharacterCountInString();
		 characterCount.characterCount(inputString);
		
		
	}

}
