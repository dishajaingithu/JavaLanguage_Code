/*
	============= Java Language =============

	Q10.Count the Number of Triplet whose sum is equal to the given value 'X'.
	Input -> arr[] = {1,4,5,6,3} , target = 12
	Output -> ans = 2.
*/

import java.util.Scanner;
class TargetSumTriplet{

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

				for(int k=j+1;k<size; k++){


					if(value[i] + value[j] + value[k] == targetEle){

						countTargetEle++;
					}
				}
			}
		}

		System.out.println("Target Element Sum count : " + countTargetEle);
	}
}

/* Output ->
	
   	Enter the Size of Array : 5
	Enter the Array Elements : 1 4 5 3 6
	Enter the Target Value : 12
	Target Element Sum count : 2
*/

