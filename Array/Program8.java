/*
	============= Java Language =============

	Q6.Count the Number of elements strictly greater than value 'X'.
	Input -> arr[] = {1,5,5,6,7,8}, x = 5
	Output -> Number of elements greater than 5 is : 3.
*/

import java.util.Scanner;
class CountElementGreaterThanX{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			value[i] = sc.nextInt();
		}
		System.out.print("Enter the Element : ");
		int element = sc.nextInt();

		int countEle = 0;
		for(int i=0; i<size; i++){

			if(value[i] > element){
				countEle++;
			}
		}
		System.out.println("Number of element greater than " + element + " is : " + countEle);
	}
}

/* Output ->
	
   	Enter the Size of Array : 6
	Enter the Array Elements : 1 5 5 6 7 8
	Enter the Element : 5
	Number of element greater than 5 is : 3
*/

