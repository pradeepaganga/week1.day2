package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] data = {3,2,11,14,6,7};	
		 //1) Arrange the array in ascending order
		Arrays.sort(data);
		int length=data.length;
		int i;
		for(i=0;i<length-1;i++)
		{
		
		}
		//2) Pick the 2nd element from the last and print it
		System.out.println("Second Larest Element of the Array is: "+data[i-1]);

	}

}
