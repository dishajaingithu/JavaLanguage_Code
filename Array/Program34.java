/*
	============= Java Language =============
	
	Q28.Multiplication of Two matrices.

	2 3  		1 2		3 5
		+		= 
	4 5 		3 4		7 9

	[r1 * c1] * [r2 * c2] = r1 * c2
		
	c1 == r2 -> Mandotary Condition
*/
import java.util.Scanner;
class MultiplicationTwoDArray{

	static void add(int[][]A,int r1,int c1,int[][]B,int r2,int c2){

		if(r2 != c1){
			System.out.println("Wrong Input : Addition Not Possible");
		}

		int[][] mul = new int[r1][c2];

		for(int i=0; i<r1; i++){

			for(int j=0; j<c2; j++){

				for(int k=0; k<c1; k++){

			
					mul[i][j] = mul[i][j] + (A[i ][k] * B[k][j]);
				}
			}
		}
		System.out.println("Print the Multiplication of Two Matrices");
		for(int i=0; i<r1; i++){

			for(int j=0; j<c2; j++){

				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}



	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row1 = sc.nextInt();

		System.out.print("Enter the column : ");
		int col1 = sc.nextInt();

		int[][] arr1 = new int[row1][col1];

		System.out.print("Enter Array ELements : ");
		for(int i=0; i<row1; i++){
			for(int j=0; j<col1; j++){

				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter the row : ");
		int row2 = sc.nextInt();

		System.out.print("Enter the column : ");
		int col2 = sc.nextInt();

		int[][] arr2 = new int[row2][col2];

		System.out.print("Enter Array ELements : ");
		for(int i=0; i<row2; i++){
			for(int j=0; j<col2; j++){

				arr2[i][j] = sc.nextInt();
			}
		}
		add(arr1,row1,col1,arr2,row2,col2);	
	}
}

/* Output ->
 	
   	Enter the row : 2
	Enter the column : 3
	Enter Array ELements : 1 2 3 4 5 6
	Enter the row : 3
	Enter the column : 2
	Enter Array ELements : 7 8 9 1 2 3
	Print the Multiplication of Two Matrices
	31 19
	85 55
*/

