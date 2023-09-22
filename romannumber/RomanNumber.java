package romannumber;

public class RomanNumber {

	public String romanNumber(int input) {
		
		String[] srr={"M",	"CM",	"D",	"CD",	"C",	"XC",	"L",	"XL",	"X",	"IX",  "V",	"IV",	"I"};
		int [] crr= { 1000,	900,	500,	400,	100,	90,		50,		40,		10,		 9, 	5,	 4,      1};
		
		StringBuffer res=new StringBuffer();
		for (int i=0;i<=crr.length-1;i++) {
			while(input>=crr[i]) {
				input=input-crr[i];
				res.append(srr[i]);
			}
		}
		
		return res.toString();
		
		
		
		
	}

}
