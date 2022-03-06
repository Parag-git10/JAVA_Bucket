// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class LargeTwoSmallTwoNo {

	public static void main(String[] args) {
		
		int[] arr= {19, 14, 20, 18, 2};										
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Largest two numbers are "+arr[arr.length-1]+", "+arr[arr.length-2]);

		System.out.println("Smallest two numbers are "+arr[0]+", "+arr[1]);
	}

}
