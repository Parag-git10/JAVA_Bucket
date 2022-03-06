/* Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)
*/


import java.util.*;

public class CheckArgsPresentOrNot {

	public static void main(String[] args) {
	
		if(args.length == 0) {
			System.out.println("No values");
		}
		else {
			for(String name : args) {
				System.out.print(name + " ");
			}
		}
	}

}