//Write a program to check if a given number is prime or not.


import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int res = 0;
		
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				res++;
			}
			else {
				continue;
			}
		}
		if(res == 0) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is NOT prime");
		}
	}

}