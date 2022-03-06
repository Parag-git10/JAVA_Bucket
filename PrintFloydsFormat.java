/* Write a program to print * in Floyds format (using for loop)
Input :-> 3
Output:->
          *
          *  * 
          *  *  *
 */

import java.util.*;

public class PrintFloydsFormat {
	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.print("Please enter an integer number");
		}
		else {
			for(int i=1; i<=Integer.parseInt(args[0]) ; i++ ) {
				for(int j=1; j<=i ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}