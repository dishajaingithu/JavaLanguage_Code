/*
	Q1.Write a program to print the value if it is Even and Divisible by 3.
*/
class EvenDivisible{

	public static void main(String[] args){

		int value = 30;

		if(value % 2 == 0 && value % 3 == 0){

			System.out.println(value + " is Even and Divisible by 3 Both.");

		}
	}
}
/* Output 1 ->
	
   	30 is Even and Divisible by 3 Both.
*/



/*
	Q2.Write a program to print the value if it is Divisible by 3 or 5.
*/

class DivisibleOr{

	public static void main(String[] args){

		int value = 20;

		if(value % 3 == 0 || value % 5 ==0){

			System.out.println(value + " is Divisible by 3 or 5.");
		}
	}
}
/* Output 2 ->
 	
   	20 is Divisible by 3 or 5.
*/


