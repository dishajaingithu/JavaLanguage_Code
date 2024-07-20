/*
	============= Java Language =============
	Prefix Sum :
	Q26.Given an array of integer of size 'n',Answer 'q' queries where you need to print the sum of values in given 
	    Range of indices from l to r(both included).
	    Note : The Values of l and r inqueries follow 1-base indexing. 
*/

import java.util.Scanner;
class QueriesPrefixSum{

	static int[] prefixSumArray(int[] arr){

		for(int i=1; i<arr.length; i++){
			arr[i] = arr[i-1] + arr[i];
		}

		return arr;
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

		int[] prefixSum = prefixSumArray(arr);

		System.out.print("Enter Number of Queries : ");
		int q = sc.nextInt();

		while(q-- > 0){
			System.out.print("Enter left index : ");
			int l = sc.nextInt();

			System.out.print("Enter right index : ");
			int r = sc.nextInt();

			int ans = prefixSum[r] - prefixSum[l-1];
			System.out.println("Sum : " + ans);
		}

	}
}

/* Output ->
		
	Enter the size of Array : 5
	Enter the Array elements : 2 4 1 3 6
	Enter Number of Queries : 3
	Enter left index : 1
	Enter right index : 3
	Sum : 8
	Enter left index : 1
	Enter right index : 2
	Sum : 5
	Enter left index : 1
	Enter right index : 1
	Sum : 4 
*/

