/*
	============ Java Language ===========

	Input/Output ->

		* In Java,their are two ways to take the Input.
			1) BufferedReader and InputStreamReader Class -> Present in 'io'package.
			2) Scanner Class. -> Present in 'util'package.

*/

//Take input Using BufferedReader and InputStreamReader 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// or import java.io.*;
class BufferedReaderInput{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Age : ");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Enter Salary : ");
		float salary = Float.parseFloat(br.readLine());

	
		System.out.println("Enter Character : ");
		char ch = (char)br.read();
		br.skip(1);

		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
		System.out.println("Character : " + ch);
	}
}



