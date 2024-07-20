/*
	============= Java Language =============
	Prefix Sum :
	Q25.Given an integer array 'a' Return the prefix sum/Running Sum in the same array without creating a new Array.
	Input -> arr[] = {2,1,3,4,5}
	Output -> arr[] = {2,3,6,10,15}
*/

import java.util.Scanner;
class PrefixSum{

	static void prefixSumArrayWithOutCreatingNewArray(int[] arr){

		for(int i=1; i<arr.length; i++){
			arr[i] = arr[i-1] + arr[i];
		}
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

		prefixSumArrayWithOutCreatingNewArray(arr);

		System.out.print("Prefix Sum Array : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}

/* Output ->
	
	Enter the size of Array : 5
	Enter the Array elements : 2 1 3 4 5
	Prefix Sum Array : 2 3 6 10 15   
*/

