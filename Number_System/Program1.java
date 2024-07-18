/*
	============ Java Language =============

	Number System ->
		
		1)Decimal Number System ->
			* 0 to 9 Digits
			* Base 10
			* ex.(3451) -> 3*10^3 + 4*10^2 + 5*10^1 + 1*10^0
		
		2)Binary Number System ->
			* 0 and 1 only
			* ex.(1001) -> 1*2^3 + 0*2^2 + 0*2^1 + 0*2^0
*/

//Conversion of Binary to Decimal ->
//ex.(1001) -> 1*2^3 + 0*2^2 + 0*2^1 + 0*2^0

import java.util.Scanner;
class BinaryToDecimal{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Number : ");
		int binary_num = sc.nextInt();
		int original_num = binary_num;

		int ans = 0;
		int pw = 1;

		while(binary_num != 0){

			int unit_digit = binary_num % 10;
			ans += (unit_digit * pw);
			binary_num /= 10;
			pw *= 2;
		}

		System.out.println(ans + " is a Decimal of " + original_num);
	}
}
