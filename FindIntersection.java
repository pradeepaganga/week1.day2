package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare An array for {3,2,11,4,6,7};
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		// b) Declare another array for {1,2,8,4,9,7};
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		int i, j;
		System.out.println("Intersection of arr1 and arr2 is:");
		// c) Declare for loop iterator from 0 to array length
		for (i = 0; i < arr1.length; i++) {
			// d) Declare a nested for another array from 0 to array length
			for (j = 0; j < arr2.length; j++) {
				// Compare Both the arrays using a condition statement
				if (arr1[i] == arr2[j]) {
					// f) Print the first array (shoud match item in both arrays)
					System.out.println(arr1[i]);

				}

			}
		}

	}

}
