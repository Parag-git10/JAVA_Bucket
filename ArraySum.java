/*Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Consider,
Array Elements - 10,3,6,1,2,7,9
Output :-> 22   
[i.e 10+3+9]

Array Elements - 7,1,2,3,6
Output :-> 19

Array Elements - 1,6,4,7,9
Output :-> 10
 */

public class ArraySum {

	public static void main(String[] args) {
		
		int[] arr= {10, 3, 6, 1, 2, 7, 9};
		int sum = 0;
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 6)
				res = 1;
			else if(arr[i] == 7) {
				res = 0;
				i++;
			}
			if(res != 1)
				sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}

