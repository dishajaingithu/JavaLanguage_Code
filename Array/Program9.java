/*
	============= Java Language =============

	Q7.Check if the given array is sorted or not.
	Input -> arr[] = {1,5,5,6,7,8}
	Output -> true.
*/

import java.util.Scanner;
class CheckArrayIsSorted{

	static boolean isSorted(int[] arr){

		boolean check = true;
		for(int i=1; i<arr.length; i++){
			if(arr[i] < arr[i-1]){
				check = false;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			value[i] = sc.nextInt();
		}
		
		boolean sorted = isSorted(value);

		if(sorted == true){

			System.out.println("Array is Sorted");
		}else{
			System.out.println("Array is Not Sorted");
		}
	}
}

/* Output ->
	
   	1)Enter the Size of Array : 5
	  Enter the Array Elements : 1 2 3 4 5
	  Array is Sorted

	2)Enter the Size of Array : 5
	  Enter the Array Elements : 3 2 1 5 4
	  Array is Not Sorted
*/

