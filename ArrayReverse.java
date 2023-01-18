package arrays;

import java.util.Scanner;

public class ArrayReverse {
	private static void printArray(int []arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	// reverse array at given position.
	public static void reverseArrayGivenPosition(int[]arr, int m) {
		int s = m + 1; 
		int e = arr.length-1;
		while(s <= e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	
	// Reverse array
	public static void reverseArray(int []arr) {
		int s = 0, e = arr.length-1;
		while(s <= e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
//		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {11,7,3,12,4,6};
		reverseArrayGivenPosition(arr, 2);
		printArray(arr);
		

	}

}
