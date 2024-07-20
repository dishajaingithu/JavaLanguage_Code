/*
	============= Java Language =============
	
	Q17.Reverse an array of consisting of integers Values.
	Input -> arr[] = {1,2,3,4,5}
	Output -> arr[] = {5,4,3,2,1}
*/

import java.util.Scanner;
class ReverseArray{

	static void inplaceReverseArray(int[] arr){

		int n = arr.length;
		int i=0;
		int j = arr.length-1;

		while(i<j){
			swapArray(arr,i,j);
			i++;
			j--;
		}
	}

	static void swapArray(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int[] reverseArray(int[] arr){

		int size = arr.length;
		int[] ans = new int[size];
		int j = 0;
		for(int i= size - 1; i>=0; i--){
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

		int[] ans1 = reverseArray(arr);
		System.out.print("Reverse Array Elements is : ");
		for(int i=0; i<ans1.length; i++){

			System.out.print(ans1[i] + " ");
		}

		System.out.println();

		inplaceReverseArray(arr);
		System.out.print("In Place_Reverse Array Elements is : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
	}
}

/* Output ->
	
	Enter the size of Array : 5
	Enter the Array elements :  1 2 3 4 5
	Reverse Array Elements is : 5 4 3 2 1
	In Place_Reverse Array Elements is : 5 4 3 2 1
*/

