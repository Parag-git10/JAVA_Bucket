//Write a program to print prime numbers between 10 and 99.

public class PrintPrime {

	public static void main(String[] args) {
		
		int res;
		for(int i = 10; i <= 99; i++) {
			res = 1;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					res = 0;
					break;
				}
			}
			if(res == 1) {
				System.out.print(i+" ");
			}
		}
	}

}