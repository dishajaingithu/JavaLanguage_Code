/*
	============= Java Language =============
	
	Q20.Given 'Q' queries,check if the given number is present in the array or not.
	    Note - Value of all element in array is less than 10 to the power 5.
	
*/

import java.util.Scanner;
class QueriesArray{
	
	static int[] makeFrequencyArray(int[] arr){

		int[] freq = new int[100005];
		for(int i=0; i<arr.length; i++){

			freq[arr[i]]++;
		}
		return freq;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter the Array elements : ");
		for(int i=0; i<size; i++){

			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the q value : ");
		int q = sc.nextInt();

		int freq[] = makeFrequencyArray(arr);

		while(q>0){
			System.out.print("Enter no to search : ");
			int x = sc.nextInt();
			if(freq[x] > 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			q--;
		}	
	}
}

/* Output ->
	
	Enter the size of Array : 7
	Enter the Array elements : 5 6 5 400 560 1000 4000
	Enter the q value : 5
	Enter no to search : 5
	YES
	Enter no to search : 400
	YES
	Enter no to search : 580
	NO
	Enter no to search : 5
	YES
	Enter no to search : 10000
	NO
*/

