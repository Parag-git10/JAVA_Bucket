//Write a program to check if a given integer number is odd or even.


import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("Number is Odd");
		}
		else {
			System.out.println("Number is Even");
		}
	}

}