/*Write a program to print the sum of all the digits of a given number.

Consider,
Input :-> 2345
Output:-> 14
 */

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num= 1234;
	    int sum=0;
	    for(int i=num; i>0; i/=10) {

	    	int h=i % 10;
	    	sum=sum+h;	
	  
	    }
	    System.out.println(sum);
	}

}