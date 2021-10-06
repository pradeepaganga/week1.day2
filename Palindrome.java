package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //* a) Declare A String value as"madam"
		String str = "madam";
		// * b) Declare another String rev value as ""
		String rev = "";
		int i;
		int length = str.length();
		 //* c) Iterate over the String in reverse order
		 //* d) Add the char into rev
		for (i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		
		 //* e) Compare the original String with the reversed String, if it is same then print palinDrome 
		if (str.equals(rev)) {

			System.out.println("Entered string "+str+" is a palindrome.");
		}

		else

		{
			System.out.println("Entered string "+str+" is a palindrome.");
		}

	}
}
