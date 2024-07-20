/*
	============= Java Language =============

	Q8.Return the small and large value of array in array format.
	Input -> arr[] = {1,5,5,6,7,8}
	Output -> true.
*/

import java.util.Scanner;
import java.util.Arrays;
class SmallLargeEleArray{

	//Using Predefined Function Sort
	static int[] smallLargeElement(int[] arr){

		Arrays.sort(arr);
		int[] ans = {arr[0] , arr[arr.length-1]};
		return ans;
	}

	//Without Using Predefined Function Sort
	static int[] smallLargeElement1(int[] arr){

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				int temp = 0;

				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int[] ans = {arr[0] , arr[arr.length-1]};
		return ans;
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
		
		int[] ans = smallLargeElement1(value);

		System.out.println("Small Value : " + ans[0]);
		System.out.println("Large Value : " + ans[ans.length - 1]);
	}
}

/* Output ->
	
   	Enter the Size of Array : 5
	Enter the Array Elements : 5 4 3 6 7
	Small Value : 3
	Large Value : 7
*/

