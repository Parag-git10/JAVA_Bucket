/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
*/

public class PrintIndex {

	public static void main(String[] args) {

		int[] arr = {1, 4, 34, 56, 7};
		int num = 90;
		int i, res = 0;
		
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				res = 1;
				break;
			}
		}
		if(res == 1) {
			System.out.println(i);
		}
		else {
			System.out.println("-1");
		}
	}

}