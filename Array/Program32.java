/*
	============= Java Language =============
	
	Taking 2D Array from User.
*/
import java.util.Scanner;
class TwoDArray{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Rows : ");
		int row = sc.nextInt();

		System.out.print("Enter No of Column : ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.print("Enter Array Elements : ");
		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++){

				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array Elements : ");
		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++){

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}
}

/* Output ->
 	
   	Enter No of Rows : 2
	Enter No of Column : 2
	Enter Array Elements : 1 2 3 4
	Array Elements :
	1 2
	3 4
*/

