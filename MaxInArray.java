/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Consider,
On Cmd :\> java Sample 1 2 3
Output :-> Please enter 9 integer numbers


On Cmd :\> java Sample 1 23 42 55 121 675 56 72 89
Output :-> 
            The given array is :
            1 23 42 
            55 121 675 
            56 72 89 
            The biggest number in the given array is 675
 */


import java.util.*;
public class MaxInArray {
	public static void main(String[] args) {
		int [][] arr=new int[3][3];
		int l=0;
		
		System.out.println("The given array is :");

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=Integer.parseInt(args[l++]);
				System.out.print(arr[i][j]+"\t");	
			}
			System.out.println();
		}
		
		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+"\t");	
			}
			System.out.println();
		}*/
		
		int max=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length ;j++) {
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		System.out.println("The biggest number in the given array is "+ max);
	}
}