/*Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */


import java.util.*;

public class WithoutTen {
	public static void main(String[] args) {

		int [] arr=new int[]{1,10,10,2};
		int []temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {   
			if(arr[i]==10)
				arr[i]=0;
		}	
		int h=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {
				temp[h]=arr[j];
		       	h++;  
			}
		    	
		}
		System.out.println(Arrays.toString(temp));
		
	}
}

