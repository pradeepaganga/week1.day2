package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the input as Follow
		String test = "I am a software tester"; 
		//a) split the words and have it in an array
		String[] word = test.split(" ");
		String str="";
		int j=0;
		int length=word.length;
		int i;
		//b) Traverse through each word (using loop)
		for(i=0;i<length;i++) {
			
			//c) find the odd index within the loop (use mod operator)
			
			if(i%2!=0)
			{
				
				
				str=word[i];
				//	d)split the words and have it in an array
				
				char[] charArray = str.toCharArray();
				int length1=charArray.length;
				//e)print the even position words in reverse order using another loop (nested loop)
				for(j=length1-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
				}
				//	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			}
			else
				System.out.print(word[i]);
			System.out.print(" ");
			}
		}

	}
	
		
			
	




	


	