/* Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

 */


import java.util.*;

public class MiddleWay {
	
	public static void main(String[] args) {
		int [] arr=new int[2];
		int [] a=new int[]{1,2,3};
		int [] b=new int[]{4,5,6};
		
		arr[0]=a[1];
		arr[1]=b[1];
		
		System.out.print(Arrays.toString(arr));
		
	}
}}