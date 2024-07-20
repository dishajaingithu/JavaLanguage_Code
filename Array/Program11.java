/*
	============= Java Language =============

	Q8.Return the kth small and kth large value of array in array format.
	Input -> arr[] = {1,5,5,6,7,8}
	Output -> true.
*/

import java.util.Scanner;
import java.util.Arrays;
class SmallLargeEleArray{

	//Using Predefined Function Sort
	static int[] smallLargeElement(int[] arr, int k){

		Arrays.sort(arr);
		int[] ans = {arr[k-1] , arr[arr.length-k]};
		return ans;
	}

	//Without Using Predefined Function Sort
	static int[] smallLargeElement1(int[] arr, int k){

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

		int[] ans = {arr[k-1] , arr[arr.length-k]};
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
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();

		int[] ans1 = smallLargeElement(value,k);
		int[] ans2 = smallLargeElement1(value,k);

		System.out.println("Small Value : " + ans1[0]);
		System.out.println("Large Value : " + ans1[ans1.length - 1]);
		
		System.out.println();

		System.out.println("Small Value : " + ans2[0]);
		System.out.println("Large Value : " + ans2[ans2.length - 1]);
	}
}

/* Output ->
	
   	Enter the Size of Array : 5
	Enter the Array Elements : 2 3 1 4 5
	Enter the value of k : 1
	Small Value : 1
	Large Value : 5

	Small Value : 1
	Large Value : 5
*/

