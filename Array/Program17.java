/*
	============= Java Language =============
	
	Q14.Find the Second smallest element in the given Array.
	Input -> arr[] = {9,8,9,6,9,5,8}
	Output -> secondMax = 6
*/

import java.util.Scanner;
class SecondSmallEle{
	
	//Find the Min Value
	static int findSmall(int[] arr){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//Fint the Second Min Value
	static int secondSmallEle(int[] arr){

		int min = findSmall(arr);

		for(int i=0; i<arr.length; i++){

			if(arr[i] == min)
				arr[i] = Integer.MAX_VALUE;
		}
		int secondMin = findSmall(arr);
		return secondMin;
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
		
		int secondMinValue = secondSmallEle(value);

		System.out.println("Second Min Element in Array : " + secondMinValue);
	}
}

/* Output ->
	
  	1) Enter the Size of Array : 7
	   Enter the Array Elements : 9 8 9 6 9 5 8
	   Second Min Element in Array : 6

	2) Enter the Size of Array : 6
	   Enter the Array Elements : -2 0 0 0 -3 -4
	   Second Min Element in Array : -3
*/

