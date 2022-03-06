/*Given an array of type int, print true if every element is 1 or 4. 

only1 and 4([1, 4, 1, 4]) → true
only1 and 4([1, 4, 8, 4]) → false
only1 and 4([1, 1]) → true
 */


import java.util.*;

public class OnlyOneAndFour {

	public static void main(String[] args) {
		int [] arr=new int[]{1,4,1,4};
		int h=0;
		for(int i=0;i<5;i++) {
			if(arr[i]==1 || arr[i]==4) {
				h++;
		    }
		}
		if(h==5)
		System.out.println("true");
		else
		System.out.println("false");
		
	}
}