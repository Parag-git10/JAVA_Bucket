/*Initialize two character variables in a program and display the characters in alphabetical order.

Consider, 
if the first character is 'p' and second character is 'a' then the output should be  a,p
*/


import java.util.*;

public class CharactersInAlphabeticalOrder {

	public static void main(String[] args) {
		
		char var1 = 'p';
		char var2 = 'a';
		
		if (var1 > var2)
            System.out.println(var2+" , "+var1);
        else
            System.out.println(var1+" , "+var2);
	}

}