//Write a program to convert the uppercase character to lowercase and lowercase character to uppercase.


import java.util.*;

public class ConvertCase {

	public static void main(String[] args) {
		
		char var = 'a';
		if (var >= 'a' && var <= 'z')
			System.out.println((char)(var-32));				
	    else
		 	System.out.println((char)(var+32)); 			
	}

}
