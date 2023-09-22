package charactercount;

public class CharacterCountInString {

	public void characterCount(String inputString) {


		char[] crr= inputString.toCharArray();

		//Call the sort method
		crr=sortCharacterArray(crr);

		System.out.println(crr);


		int count=1;
		for(int i=0;i<crr.length;i++)

			for(int j=0;j<crr.length-1;j++)
			{

				if(crr[j]==crr[j+1]) {
					count++;

				}

				if(crr[j+1]==crr[crr.length-1]) {
					count++;

				}

				else {
					System.out.println(crr[j]+ " "+ count);
					count=1;

				}


			}


	}



	//Method to sort elements[BubbleSort]
	public char[] sortCharacterArray(char[] crr) {

		char temp=0;
		// Loop for Pass 
		for(int i=0;i<crr.length;i++)
		{
			boolean swapped=false;

			// Comparing Values in array
			for(int j=0;j<crr.length-1-i;j++) {

				//Swapping of Elements
				if(crr[j]>crr[j+1]) {
					temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;

				}

				swapped=true;


			}

			if(swapped==false)
			{
				break;
			}

		}

		return crr;

	}
}

