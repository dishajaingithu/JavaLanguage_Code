/*
	============= Java Language =============

	Q5.Find the last Occurence of element 'X' index.
	Input -> arr[] = {1,5,5,5,3}, x = 5
	Output -> last occurence element 5 index in array is : 3.
*/

import java.util.Scanner;
class LastOccurenceElement{

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

		int lastIndex = -1;
		for(int i=0; i<size; i++){

			if(value[i] == element){
				lastIndex = i;
			}
		}
		System.out.println("last element " + element + "index in Array is : " + lastIndex);
	}
}

/* Output ->
	
   	Enter the Size of Array : 5
	Enter the Array Elements : 1 3 5 5 6
	Enter the Element : 5
	last element 5index in Array is : 3
*/

