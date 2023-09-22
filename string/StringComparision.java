package com.kn.string;

public class StringComparision {

	public static void main(String[] args) {
		String s1 = new String("Sita");
		String s2="Ram";
		
		if(s1==s2) {
			System.out.println("Reference are Same");
		}
		else {
			System.out.println("Reference are Different");
		}
		
		
		if(s1.equals(s2)) {
			System.out.println("String data are Same");
		}
		else {
			System.out.println("String Data are Different");
		}
	}
}
