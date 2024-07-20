/*
	============= Java Language =============

	Q1.Calculate the Sum of all elements in given Array
	Input -> arr[] = {1,5,3}
	Output -> sum = 9
*/

import java.util.Scanner;
class ArraySum{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			value[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i=0; i<size; i++){

			sum += value[i];
		}

		System.out.println("Sum : " + sum);
	}
}

/* Output ->
	
   	Enter the Size of Array : 3
	Enter the Array Elements : 1 5 3
	Sum : 9
*/

