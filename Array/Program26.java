/*
	============= Java Language =============
	Two Pointer Approach:	
	Q22.Given an array of Integers 'a',Move all the even integers at the beginning of array followed by
	    all the odd integers.The Relative order of odd or even integers does not matter,Return an array
	    that satisfies the Condition.
	Input -> arr[] = {1,2,3,4,5,6,7}
	Output -> arr[] = {2,4,6,1,3,5,7}
*/

import java.util.Scanner;
class SortEvenOddArray{

	static void swap(int[] arr, int i, int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}	
	static void sortEvenOdd(int[] arr){

		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while(left < right){

			if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
				swap(arr,left,right);
				left++;
				right--;
			}

			if(arr[left] % 2 == 0){
				left++;
			}
			if(arr[right] % 2 == 1){
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

		sortEvenOdd(arr);

		System.out.print("Sort Array : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}

/* Output ->
	
	Enter the size of Array : 7
	Enter the Array elements : 1 2 3 4 5 6 7
	Sort Array : 6 2 4 3 5 1 7
*/

