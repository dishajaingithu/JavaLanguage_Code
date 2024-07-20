/*
	============= Java Language =============

	Q2.Calculate the Maximum value out of all the elements
	Input -> arr[] = {1,5,3}
	Output -> Max = 5
*/

import java.util.Scanner;
class MaximumValue{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			value[i] = sc.nextInt();
		}

		int max = 0;
		for(int i=0; i<size; i++){

			if(value[i] > max){
				max = value[i];
			}
		}

		System.out.println("Max : " + max);
	}
}

/* Output ->
	
   	Enter the Size of Array : 3
	Enter the Array Elements : 1 5 3
	Max : 5
*/

