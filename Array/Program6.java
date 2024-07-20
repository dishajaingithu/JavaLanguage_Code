/*
	============= Java Language =============

	Q4.Count the Number of Occurence of a Particular element 'X'
	Input -> arr[] = {1,5,5,5,3}, x = 5
	Output -> Occurence of 5 in array is : 3.
*/

import java.util.Scanner;
class OccurenceElement{

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

		int count = 0;
		for(int i=0; i<size; i++){

			if(value[i] == element){
				count++;
			}
		}
		System.out.println("No of " + element + " occurence in Array is : " + count);
	}
}

/* Output ->
	
   	Enter the Size of Array : 5
	Enter the Array Elements : 1 3 5 5 5
	Enter the Element which search in Array : 5
	No of 5 occurence in Array is : 3
*/

