package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *Declare a String

		String text1 = "posts";
		// *Declare another String
		String text2 = "stops";
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		// * a) Check length of the strings are same then (Use A Condition)
		if (text1.length() == text2.length())

		{

			// * b) Convert both Strings in to characters

			// * c) Sort Both the arrays
			// * c) Sort Both the arrays
			Arrays.sort(charArray);
			Arrays.sort(charArray2);

		}
		// * d) Check both the arrays has same value
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println(text1 + " and " + text2 + " are anagrams");
		} else {

			System.out.println(text1 + " and " + text2 + " are not anagrams");
		}

	}

}
	


