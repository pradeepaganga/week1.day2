package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] arr = {1,2,3,4,8,6,5};
		// Sort the array
		Arrays.sort(arr);
		int count=0;
		
	
		// loop through the array (start i from arr[0] till the length of the array)
	
		for(int i=0;i<arr.length;i++)
			
		{
			// check if the iterator variable is not equal to the array values respectively
		
			if(i!=arr[i])
			{
				count=i;
			}
			
				
							
		
		}
		// print the number
		System.out.println(count);
	
			}

}
