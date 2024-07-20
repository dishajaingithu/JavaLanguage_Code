/*
	============= Java Language =============

	Array Reference ->
		
		int[] arr = new int[5];

		int[] arr2 = arr -> copied address of arr to the arr2.
*/

class ArrayReference{

	static void change_array(int[] arr){

		for(int i=0; i<arr.length; i++){

			arr[i] = 0;
		}
	}

	public static void main(String[] args){

		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;

		System.out.print("Before the Change in Array : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		change_array(arr);
		
		System.out.print("After the Change in Array : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}

/* Output ->
	
   	Before the Change in Array : 5 6 7
	After the Change in Array : 0 0 0
*/


