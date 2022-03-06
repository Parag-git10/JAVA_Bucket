//Write a program to initialize an integer array and print the sum and average of the array.

import java.util.*;

public class SumAndAvgOfArray {

	public static void main(String[] args) {
		
		int[] arr= {11,22,33,77,44,55,99,66};
		int sum = 0;
		
		System.out.println("Array: "+ Arrays.toString(arr)); 
		
		for(int i= 0; i < arr.length; i++) {					
			sum = sum + arr[i];
		}


		System.out.println("The sum of the array is: "+sum);
		double avg = (sum/arr.length);											
		System.out.println("The average of the array is: "+avg);	
	}

}