//Write a program to initialize an integer array and find the maximum and minimum value of the array.

import java.util.*;

public class FindMinMax {

	public static void main(String[] args) {
		int[] arr= {11,22,33,77,44,55,99,66};		
		int max = arr[0];
		int min = arr[0];

		for(int i=0;i<5;i++) {   
			if(arr[i]>max)
	    			max=arr[i];
	    		if(arr[i]<min)
	    			min=arr[i];    
	        }
		System.out.println("The maximum value of Array is: "+max);	
		
		System.out.println("The minimum value of Array is: "+min);
	}

}
