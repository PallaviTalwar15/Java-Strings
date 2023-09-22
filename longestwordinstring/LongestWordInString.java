package longestwordinstring;

public class LongestWordInString {

	public String longestWord(String inputString) {
		
		//converting the String to string array
		String [] s1=inputString.split(" ");
		String temp="";
		
		//Traversing the string array
		//for(int i=0;i<s1.length;i++)
		//{
		//System.out.println(s1[i]);
		//}
		
		// Finding the Largest word.
		for(int i=0;i<s1.length-1;i++)
		{
			if(s1[i].length()<s1[i+1].length()) {
				temp=s1[i+1];
			}
			
		}
		return temp;
	}

	
		
	
}
