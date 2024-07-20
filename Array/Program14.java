/*
	============= Java Language =============
	
	Q11.Find the Unique Number in a given Array Where all the elements are being repeated twice
	    with one value being unique.Note:Only Positive Elements in Array.
	Input -> arr[] = {1,2,3,4,2,1,3}
	Output -> ans = 4.
*/

import java.util.Scanner;
class UniqueEle{

	//Find the Unique Element in Array.
	static int uniqueElement(int[] arr){

		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){

				if(arr[i] == arr[j]){
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for(int i=0; i<arr.length; i++){

			if(arr[i] > 0){
				ans = arr[i];
			}
		}

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
		
		int uniqueValue = uniqueElement(value);

		System.out.println("Unique Value in Array : " + uniqueValue);
	}
}

/* Output ->
	
   	Enter the Size of Array : 7
	Enter the Array Elements : 1 2 3 4 2 1 3
	Unique Value in Array : 4
*/

