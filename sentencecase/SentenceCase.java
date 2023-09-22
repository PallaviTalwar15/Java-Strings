package sentencecase;

public class SentenceCase {

	public String caseChanger(String inputString) {

		//converting the String to string array
		String [] s1=inputString.split(" ");


		// Traversing the String array
		StringBuffer outputString=new StringBuffer();

		for(int i=0;i<s1.length;i++)
		{
			char[] crr= s1[i].toCharArray();//converting String Array Element to character array 

			for(int j=0;j<crr.length;j++) {
				if(97<=crr[0] && crr[0]<=122) {
					crr[0]-=32;
				}
					outputString=outputString.append(crr[j]);
				
			}
			outputString=outputString.append(" ");
		}
		return outputString.toString();
	}

}
