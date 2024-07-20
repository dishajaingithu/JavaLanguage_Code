/*
	============= Java Language =============

	Q3.Search the given element 'X' in the array if present then return the index else return -1
	Input -> arr[] = {1,5,3}, x = 5
	Output -> Index of Element 5 in Array is : 1.
*/

import java.util.Scanner;
class SearchValueIndex{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			value[i] = sc.nextInt();
		}
		System.out.print("Enter the Element which search in Array : ");
		int element = sc.nextInt();

		int index = -1;
		for(int i=0; i<size; i++){

			if(value[i] == element){
				index = i;
			}
		}
		System.out.println("Index of element " + element + " in Array is : " + index);
	}
}

/* Output ->
	
   	Enter the Size of Array : 3
	Enter the Array Elements : 1 5 3
	Max : 5
*/

