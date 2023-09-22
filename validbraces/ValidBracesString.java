package validbraces;

public class ValidBracesString {

	public void bracesCount(String inputString) {

		char[] crr=inputString.toCharArray();

		int para_count=0,cur_count=0,sq_count=0;

		for (int i=0;i<=crr.length-1;i++) {
			if(crr[i]=='(')  {
				para_count++;
			}
			else if(crr[i]=='{') {
				cur_count++;
			}

			else if(crr[i]=='[') {
				sq_count++;
			}
			
			if(crr[i]==')')  {
				para_count--;
			}
			else if(crr[i]=='}') {
				cur_count--;
			}

			else if(crr[i]==']') {
				sq_count--;
			}
		}
		
		if(cur_count==0 && sq_count==0 && para_count==0) {
			System.out.println("Valid String");
		}
		else {
			System.out.println("Not a Valid String");
		}

	}

}
