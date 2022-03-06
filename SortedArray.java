// Write a program to initialize an array and print them in a sorted order.

import java.util.*;

public class SortedArray {

	public static void main(String[] args) {

		int[] arr = {22,33,44,77,55,88,99,11};
		
		Arrays.sort(arr);						

		System.out.print("Sorted Array : ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}