/*
	============= Java Language =============
	
	Q32.Given a Square matrix turn it by 90 degree in a clockwise direction without using any extra space.

	1 2 3		7 4 1
	4 5 6	->	8 5 2	
	7 8 9		9 6 3

	ans[i][j] = A[i][j]
*/
import java.util.Scanner;
class Rotate90Degree{

	static void rotateDegree(int[][] matrix,int n){
		
		transposeInPlace(matrix,n,n);
		for(int i=0; i<n; i++){
			reverseArray(matrix[i]);
		}
	}
	static void reverseArray(int[]arr){
		int i =0;
		int j = arr.length - 1;
		while(i<j){
			swapArray(arr,i,j);
			i++;
			j--;
		}
	}
	static void swapArray(int[]arr , int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void transposeInPlace(int[][] arr, int r,int c){

		for(int i=0; i<c; i++){

			for(int j=0; j<r; j++){

				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row value : ");
		int row = sc.nextInt();

		int[][] arr = new int[row][row];
	
		System.out.print("Enter " + row*row + " value : ");
		for(int i=0; i<row; i++){

			for(int j=0; j<row; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		rotateDegree(arr,row);

		System.out.println("Rotate 90 Degree Matrix");
		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length; j++){

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
