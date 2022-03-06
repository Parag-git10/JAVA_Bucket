/*Write a program to determine colour using colour code as input.

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code"
 */


import java.util.*;

public class DetermineColor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter color code :");
		char color = sc.next().charAt(0);
		
		switch(color){
			case 'R' :
			
				System.out.println("Red");
				break;
				
			case 'B' :
		
				System.out.println("Blue");
				break;
				
			case 'G' :
		
				System.out.println("Green");
				break;
				
			case 'O' :
		
				System.out.println("Orange");
				break;
				
			case 'Y' :
			
				System.out.println("Yellow");
				break;
				
			case 'W' :
			
				System.out.println("White");
				break;
				
			default :
				System.out.println("Invalid Code");
		}
	}

}