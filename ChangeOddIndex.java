package week1.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare String Input as Follow

		// String test = "changeme";
		String test = "changeme";
		// a) Convert the String to character array
		char[] charArray = test.toCharArray();
		int i = 0;
		// b) Traverse through each character (using loop)
		for (i = 0; i < charArray.length; i++) {
			// c)find the odd index within the loop (use mod operator)
			if (i % 2 != 0) {
				// within the loop, change the character to uppercase, if the index is odd else
				// don't change
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);

			}

			else {
				System.out.print(charArray[i]);
			}

		}

	}

}
