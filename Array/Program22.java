/*
	============= Java Language =============
	
	Q19.Rotate the given array 'a' by k-steps,where k is non-negative without using extra space.
	    Note - k can be greater than 'n' as well.
	Input -> arr[] = {1,2,3,4,5}
	Output -> arr[] = {5,4,3,2,1}
*/

import java.util.Scanner;
class RotateArray{
	
	static void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void reverse(int[] arr, int i, int j){

		while(i<j){

			swap(arr,i,j);
			i++;
			j--;
		}
	}

	static void rotateArray(int[] arr, int k){

		int size = arr.length;
		k = k % size;
		reverse(arr,0,size-k-1);
		reverse(arr,size-k,size-1);
		reverse(arr,0,size-1);
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

		rotateArray(arr,k);
		System.out.print("Rotate Array Elements is : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
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

