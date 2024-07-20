/*
	============= Java Language =============
	
	Q18.Rotate the given array 'a' by k-steps,where k is non-negative.
	    Note - k can be greater than 'n' as well.
	Input -> arr[] = {1,2,3,4,5}
	Output -> arr[] = {5,4,3,2,1}
*/

import java.util.Scanner;
class RotateArray{

	static int[] rotateArray(int[] arr, int k){

		int size = arr.length;
		int[] ans = new int[size];
		k = k % size;
		int j = 0;

		for(int i= size - k; i<size; i++){
			ans[j++] = arr[i];
		}

		for(int i=0; i<size-k; i++){
			ans[j++] = arr[i];
		}
		return ans;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter the Array elements : ");
		for(int i=0; i<size; i++){

			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the K value : ");
		int k = sc.nextInt();

		int[] ans1 = rotateArray(arr,k);
		System.out.print("Rotate Array Elements is : ");
		for(int i=0; i<ans1.length; i++){

			System.out.print(ans1[i] + " ");
		}

		System.out.println();
		
	}
}

/* Output ->
	
	Enter the size of Array : 5
	Enter the Array elements : 1 2 3 4 5
	Enter the K value : 3
	Rotate Array Elements is : 3 4 5 1 2
*/

