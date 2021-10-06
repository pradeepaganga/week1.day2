package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		String test = "feeling good";
		//a) Convert the String to character array
		char[] charArray = test.toCharArray();
		//b) Traverse through each character (using loop in reverse direction)
		int length=charArray.length;
		//c) Print the character (without newline -> like below
		for(int i=length-1;i>=0;i--)
		{
			 System.out.print(charArray[i]);
		}
				
				

	}

}
