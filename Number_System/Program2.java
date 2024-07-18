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

//Conversion of Decimal to Binary ->

import java.util.Scanner;
class DecimalToBinary{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Number : ");
		int decimal_num = sc.nextInt();
		int original_num = decimal_num;

		int ans = 0;
		int pw = 1;

		while(decimal_num != 0){

			int parity = decimal_num % 2;
			ans += (parity * pw);
			pw = pw * 10;
			decimal_num /= 2;
		}

		System.out.println(ans + " is a Binary of " + original_num);
	}
}
