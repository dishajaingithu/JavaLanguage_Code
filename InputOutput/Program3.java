/*
	============ Java Language ===========

	Input/Output ->
		* In Java,their are two ways to take the Input.
			1) BufferedReader and InputStreamReader Class -> Present in 'io'package.
			2) Scanner Class. -> Present in 'util'package.
*/

//Take input Using Scanner Class 
import java.util.Scanner;
// or import java.util.*;
class ScannerInput{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		byte by;
		short s;
		int num;
		float f;
		char ch;
		long l;
		double d;
		boolean b;

		System.out.println("Enter the Byte Value : ");
		by = sc.nextByte();
		System.out.println("Byte Value : " + by);

		System.out.println("Enter the Short Value : ");
		s = sc.nextShort();
		System.out.println("Short Value : " + s);

		System.out.println("Enter the Integer Value : ");
		num = sc.nextInt();;
		System.out.println("Integer Value : " + num);

		System.out.println("Enter the Float Value : ");
		f = sc.nextFloat();
		System.out.println("Float Value : " + f);

		System.out.println("Enter the Character Value : ");
		ch = sc.next().charAt(0);
		System.out.println("Character Value : " + ch);

		System.out.println("Enter the Long Value : ");
		l = sc.nextLong();
		System.out.println("Long Value : " + l);

		System.out.println("Enter the Double Value : ");
		d = sc.nextDouble();
		System.out.println("Double Value : " + d);

		System.out.println("Enter the Boolean Value : ");
		b = sc.nextBoolean();
		System.out.println("Boolean Value : " + by);

	}
}



