/*
	============= Java Language =============
	Two Pointer Approach:	
	Q22.Sort an Array consisting of only 0's and 1's.
	Input -> arr[] = {1,0,0,1,0,1,1,0,0}
	Output -> arr[] = {0,0,0,0,0,1,1,1,1}
*/

import java.util.Scanner;
class SortArray{

	static void swap(int[] arr, int i, int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}	
	static void sortZerosOnes(int[] arr){

		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while(left < right){

			if(arr[left] == 1 && arr[right] == 0){
				swap(arr,left,right);
				left++;
				right--;
			}

			if(arr[left] == 0){
				left++;
			}
			if(arr[right] == 1){
				right--;
			}
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

		sortZerosOnes(arr);

		System.out.print("Sort Array : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}

/* Output ->
	
	Enter the size of Array : 9
	Enter the Array elements : 1 0 0 1 0 1 1 0 0
	Sort Array : 0 0 0 0 0 1 1 1 1
*/

