package com.kn.string;

public class StringComparision2 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2="Sita";
		
		//Reference Object will be Created inside the String Pool.
		//String s3="Ram"+"Sita"; //New Reference object is Created for RamSita.
		//String s4="Ram"+"Sita";
		
		//Reference will be created in the Heap Memory but Outside the String Pool
		//String s3= s1+s2; //Used Reference Variable.
		//String s4= s1+s2;
		
		//Reference will be be Cretaed Outside the String Pool in Heap Memory.
		//String s3=s1+"Sita"; // As s1 is Reference Variable is used, it will be Created in Heap Memory.
		//String s4=s1+"Sita";
		
		//Reference will be Created in the String Pool.
		String s3="Ram"; //object created in string Pool
		String s4=s3;	// Assigns the Address of s3 and refers to the Same object.
		
		if(s3==s4) {
			System.out.println("Reference are Same");
		}
		else {
			System.out.println("Reference are Different");
		}
		
		
		if(s3.equals(s4)) {
			System.out.println("String data are Equal");
		}
		else {
			System.out.println("String Data are UnEqual");
		}
	}
}
