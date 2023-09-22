package lettercasechanging;

public class LetterCaseChanging {

	
	public String caseChanger(String inputString) {
		
		StringBuffer outputString=new StringBuffer();
		char[] crr= inputString.toCharArray();
		
		for(int i=0;i<crr.length;i++) {
			if(65<=crr[i] && crr[i]<=90) {
				crr[i]+=32;
				outputString=outputString.append(crr[i]);
			}
			else if(97<=crr[i] && crr[i]<=122) {
				crr[i]-=32;
				outputString=outputString.append(crr[i]);
			}
			outputString=outputString.append(" ");
		}
		
		
		
		return outputString.toString();
	}

}
