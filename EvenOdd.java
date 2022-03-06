/*Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
 */


import java.util.*;

public class EvenOdd {
	
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};//{2,4 1,3,5}

		
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i]%2!=0) {
				/*if(arr[i+1]%2!=0) {
					continue;
				}*/
				for(int j=i+1; j<arr.length; j++ ) {
					if(arr[j]%2==0 || arr[j]==0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
				
			}
							
		}
		System.out.println(Arrays.toString(arr));
	}
}
