package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "Welcome To Chennai";
		int i = 0;
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		// convert the string into char array
		char[] charArray = str.toCharArray();
		
		// traverse from 0 till the array length 
		for (i = 0; i < charArray.length; i++) {
			// Check the char array has the particular char in it 
			if (charArray[i] == 'e') {
				// if is has increment the count	
				count = count + 1;
			}

		}
		// print the count out of the loop
		System.out.println("Character count of e is:"+count);
	}

}
