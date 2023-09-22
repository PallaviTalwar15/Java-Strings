package com.kn.string;

public class StringMethods {
public static void main(String[] args) {
	String s1="Raja Ram Mohan Roy";
	
	// To Convert String to UpperCase.
	System.out.println("\nUpperCase: "+s1.toUpperCase());
	
	// To Convert String to LowerCase.
	System.out.println("\nLowerCase: "+s1.toLowerCase());
	
	// Returns the Character at specified Index.
	System.out.println("\nCharacterAt: "+s1.charAt(5));
	
	// Returns the first index value of the specified character.
	System.out.println("\nFirst index of Character: "+s1.indexOf('a'));
	
	// Returns the last index of the specified Character.
	System.out.println("\nLast index of the Character: "+s1.lastIndexOf('a'));
	
	// Returns the Substring of the main string only with Start index.
	System.out.println("\nSubstring[Start index] : "+s1.substring(5));
	
	// Returns the Substring with both Starting and Ending Index values.
	System.out.println("\nSubstring: "+s1.substring(5,12));
	
	// Returns the true if the substring contains or present in the Main String else returns False.
	System.out.println("\nContains: "+s1.contains("Ram"));
	
	//Returns the Length of String.
	System.out.println("\nLength of String:"+ s1.length());
	
	//Returns the true if the MainString starts with specified Substring.
		System.out.println("\nStarts With:"+ s1.startsWith("Raja"));
		
	//Returns the true if the MainString ends with specified Substring.
	System.out.println("\nEnds With:"+ s1.endsWith("Roy"));
	
	//Returns the true if the MainString starts with specified Substring.
	System.out.println("\nCharacter Array:");
	char[] crr = s1.toCharArray();
	
		System.out.println(crr);
	
	
	//Returns the String with no spaces.
	System.out.println("\nTrim:"+ s1.trim());
	
	//Splits the String with Specified index values.
	System.out.println("\nSplit:"+ s1.split("R"));
	
	//Replace values with Specified Charaters.
	System.out.println("\nReplace:"+ s1.replace("R","O"));
	
	//Replaces all with a Specified Character.
	System.out.println("\nReplace All:"+ s1.replaceAll("a","A"));
	
}

}
