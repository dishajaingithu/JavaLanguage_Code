/*
	============= Java Language =============
	
	Q30.Write a program to display transpose of matrix entered by User.

	1 2 3		1 4 7
	4 5 6	->	2 5 8	
	7 8 9		3 6 9

	ans[i][j] = A[i][j]
*/
import java.util.Scanner;
class TransposeArray{

	static void transposeArray(int[][] matrix,int row,int col){
		int[][] ans = new int[col][row];
		for(int i=0; i<col; i++){

			for(int j=0; j<row; j++){

				ans[i][j] = matrix[j][i];
			}
		}

		System.out.println("Transpose Matrix : ");
		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++){

				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row value : ");
		int row = sc.nextInt();

		System.out.print("Enter Column value : ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];
		int totalElem = row*col;
		System.out.print("Enter " + totalElem + " value : ");
		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		transposeArray(arr,row,col);
	}
}

/* Output ->
 	
   	Enter Row value : 3
	Enter Column value : 3
	Enter 9 value : 1 2 3 4 5 6 7 8 9
	Transpose Matrix :
	1 4 7
	2 5 8
	3 6 9
*/

