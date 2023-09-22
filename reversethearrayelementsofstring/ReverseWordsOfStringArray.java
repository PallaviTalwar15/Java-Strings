package reversethearrayelementsofstring;

public class ReverseWordsOfStringArray {

	public String reverseWord(String inputString) {

		//converting the String to string array
		String [] s1=inputString.split(" ");

		
		// Traversing the String array
		StringBuffer outputString=new StringBuffer();

		for(int i=0;i<s1.length;i++)
		{
			char[] crr= s1[i].toCharArray();//converting String Array Element to character array 
			for(int j=crr.length-1;j>=0;j--) {

				outputString=outputString.append(crr[j]);
				
				
			}
			outputString=outputString.append(" ");
		}
		return outputString.toString();
	}
}









