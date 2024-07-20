/*
	============= Java Language =============
	
	Q12.Find the Second Largest element in the given Array.
	Input -> arr[] = {9,8,9,6,9,5,8}
	Output -> secondMax = 8
*/

import java.util.Scanner;
class SecondMaxEle{
	
	//Find the Max Value
	static int findMax(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//Fint the Second Max Value
	static int secondMaxEle(int[] arr){

		int max = findMax(arr);

		for(int i=0; i<arr.length; i++){

			if(arr[i] == max)
				arr[i] = Integer.MIN_VALUE;
		}
		int secondMax = findMax(arr);
		return secondMax;
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
		
		int secondMaxValue = secondMaxEle(value);

		System.out.println("Second Max Element in Array : " + secondMaxValue);
	}
}

/* Output ->
	
   	1) Enter the Size of Array : 7
	   Enter the Array Elements : 9 8 9 6 9 5 8
	   Second Max Element in Array : 8

	2) Enter the Size of Array : 6
	   Enter the Array Elements : -2 0 0 0 -3 -4
	   Second Max Element in Array : -2 
*/

