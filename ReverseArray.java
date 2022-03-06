/* Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Consider, 

On Cmd :\> java filename 1 2 3
Output :-> Please enter 4 integer numbers


On Cmd :\> java filename 1 2 3 4
Output :->
            The given array is :
            1 2 
            3 4 

            The reverse of the array is :
            4 3 
            2 1
 */


public class  ReverseArray {

	public static void main(String[] args) {
		
		if(args.length != 4) {
			System.out.println("Please enter 4 integer numbers");
		}
		else {
			int[][] arr = new int[2][2];
			int x = 0;
			
			System.out.println("The given array is :");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = Integer.parseInt(args[x++]);
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
			/*System.out.println("The given array is :");				
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}*/

			System.out.println("The reverse of the array is :");
			for(int i = arr.length-1; i >= 0; i--) {
				for(int j = arr.length-1; j >= 0; j--) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

}