/*
	============= Java Language =============
	
	Q15.Given 2 Integers a and b,Swap the 2 given number using tempoary variables.
	Input -> a=10 , b=20
	Output -> a=20 , b=10
*/

import java.util.Scanner;
class SwapEle{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value a : ");
		int a = sc.nextInt();

		System.out.print("Enter the value b : ");
		int b = sc.nextInt();

		System.out.println("Before Swap Value of a is : " + a);
		System.out.println("Before Swap Value of b is : " + b);

		int temp = a; 
		a = b;
		b = temp;

		System.out.println();
		System.out.println("After Swap Value of a is : " + a);
		System.out.println("After Swap Value of b is : " + b);	
		
	}
}

/* Output ->
	
	Enter the value a : 10
	Enter the value b : 20
	Before Swap Value of a is : 10
	Before Swap Value of b is : 20

	After Swap Value of a is : 20
	After Swap Value of b is : 10  	
*/

