//Write a program to remove the duplicate elements in an array and print the same.

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		int[] arr = {12, 34, 12, 45, 67, 89};
		
		Arrays.sort(arr);								
		int[] temp = new int[arr.length];
		int j = 0;											
		for (int i = 0; i < arr.length-1; i++){
			if (arr[i] != arr[i+1]){
				temp[j++] = arr[i];  
			}
		}
		temp[j++] = arr[arr.length-1];
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+" ");  			
		}
	}
	
}