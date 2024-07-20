/*
	============= Java Language =============
	
	Q29.Reverse Each Row.

	1 2 3 10		10 3 2 1
	4 5 6 11	-> 	11 6 5 4
	7 8 9 12		12 9 8 7
*/
import java.util.Scanner;
class ReverseEachRow{

	static void reverseEachRow(int[][] arr,int row,int col){

		for(int i=0; i<row; i++){

			int start = 0;
			int end = col-1;
			while(start < end){
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;

				start++;
				end--;
			}
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row : ");
		int row = sc.nextInt();

		System.out.print("Enter the Column : ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.print("Enter Array Elements : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){

				arr[i][j] = sc.nextInt();
			}
		}
		reverseEachRow(arr,row,col);

		System.out.println("Reverse Each Row : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/* Output ->
 	
   	Enter the Row : 3
	Enter the Column : 4
	Enter Array Elements : 1 2 3 10 4 5 6 11 7 8 9 12
	Reverse Each Row :
	10 3 2 1
	11 6 5 4
	12 9 8 7
*/

