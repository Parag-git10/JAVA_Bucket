/*Write a Program to accept a String as a command line argument and print a Welcome message.

Consider,
On cmd:\> java fileName Arceus
Output:-> Welcome Arceus
 */
import java.util.*;

public class OneArgs {

	public static void main(String[] args) {

		System.out.println("Welcome "+args[0]+" ...!!");

	}

}
