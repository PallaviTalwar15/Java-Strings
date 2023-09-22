package com.kn.string;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s1=scan.nextLine();
		s1.toLowerCase();
		
		char characterArray[]=s1.toCharArray();
		String rev="";
		
		for(int i=characterArray.length-1;i>=0;i--) {
			
			rev=rev+characterArray[i];
		}
		System.out.println(rev);
		
	}
}
