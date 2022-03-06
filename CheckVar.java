//Write a program to check the given variable is alphabet, digit or special character.

import java.util.*;

public class CheckVar {

	public static void main(String[] args) {
	
		char var = '@';
		
		if((var >= 65 && var <= 90) || (var >= 97 && var <= 122) ) {
			System.out.println("Alphabet");
		}
		else if(var >= 48 && var <= 57) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
	}

}