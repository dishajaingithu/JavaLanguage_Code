/*
	============= Java Language =============
	Two Pointer Approach:	
	Q23.Given an array of Integers 'a'Sort in non-decreasing orders,return an array of the squares of each
	    number sorted in non-decreasing.
	Input -> arr[] = {2,4,6,7,10}
	Output -> arr[] = {4,16,36,49,100}
*/

import java.util.Scanner;
class SortSquare{

	static int[] sortSquares(int[] arr){

		int n = arr.length;
		int left = 0,right = n-1;
		int[] ans = new int[n];
		int k = 0;
		while(left <= right){
			
			if(Math.abs(arr[left]) > Math.abs(arr[right])){
				ans[k++] = arr[left] * arr[left];
				left++;
			}else{
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}
		return ans;
	}
	
	static void swap(int[] arr,int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void reverse(int[] arr){

		int i = 0;
		int j = arr.length-1;
		while(i<j){
			swap(arr,i,j);
			i++;
			j--;
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

		int[] ans1 = sortSquares(arr);

		reverse(ans1);

		System.out.print("Sort Array : ");
		for(int i=0; i<ans1.length; i++){

			System.out.print(ans1[i] + " ");
		}

		System.out.println();
	}
}

/* Output ->
	
	Enter the size of Array : 6
	Enter the Array elements : -10 -3 -2 1 4 5
	Sort Array : 1 4 9 16 25 100
*/

