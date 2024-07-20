/*
	============= Java Language =============

	Q9.Find the total number of pair in the array whose sum is equal to the given value 'X'.
	Input -> arr[] = {4,6,3,5,8,2} , target = 7
	Output -> ans = 2.
*/

import java.util.Scanner;
class TargetSum{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			value[i] = sc.nextInt();
		}
		System.out.print("Enter the Target Value : ");
		int targetEle = sc.nextInt();
		int countTargetEle = 0;

		for(int i=0; i<value.length; i++){

			for(int j=i+1; j<size; j++){

				if(value[i] + value[j] == targetEle){

					countTargetEle++;
				}
			}
		}

		System.out.println("Target Element Sum count : " + countTargetEle);
	}
}

/* Output ->
	
   	Enter the Size of Array : 6
	Enter the Array Elements : 4 6 3 5 8 2
	Enter the Target Value : 7
	Target Element Sum count : 2
*/

