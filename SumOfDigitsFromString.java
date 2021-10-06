package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		 //* Declare a String text with the following value
		String text = "Tes12Le79af85";
		 //Declare a int variable sum
		int sum = 0;
		//* a) Iterate an  array over the String
		char[] charArray = text.toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			//* c) Now covert char to int using Character.getNumericValue() and add it to sum
			if(Character.isDigit(charArray[i]))
			{
				int p=Character.getNumericValue(charArray[i]);
				sum=sum+p;
			
				
			}
			
			
		}
		 //* d) Now Print the value
		System.out.println("Sum of digits from sum is:"+sum);
	}

}
