/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers.

Consider,
On cmd:\> java FileName 20 2
Output:-> The sum of 20 and 2 is 22
 */
import java.util.*;

public class SumArgs {

	public static void main(String[] args) {
	
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		
		System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
	}

}