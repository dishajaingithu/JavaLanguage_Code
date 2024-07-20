/*
	============= Java Language =============
	
	Q13.Given an array 'a' consisting of integers.Return the first value that is repeating in the array
	    If No value is being repeated return -1.
	Input -> arr[] = {1,5,3,4,6,3,4}
	Output -> repeat_value = 3
*/

import java.util.Scanner;
class RepeatEle{
	
	//Find the repeating element in Array
	static int firstRepeatingNumber(int[] arr){
		
		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i] == arr[j]){
					return arr[i];
				}
			}
		}

		return -1;
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
		
		int repeatValue = firstRepeatingNumber(value);
		if(repeatValue != -1){

			System.out.println("First Repeat Element in Array : " + repeatValue);
		}else{
			System.out.println("No Repeat Element is Present in Array");
		}
	}
}

/* Output ->
	
   	1) Enter the Size of Array : 7
	   Enter the Array Elements : 1 5 3 4 6 3 4
	   First Repeat Element in Array : 3

	2) Enter the Size of Array : 3
	   Enter the Array Elements : 1 2 3
	   No Repeat Element is Present in Array
*/

