/*
	============= Java Language =============

	Exception Handling ->

        Try-Catch for RuntimeException :-

	syntax :-

		try{
			Exception_Code
		}catch(Exception_Name obj_Name){

			Handling Code
		}

	* Exception is a parent of all Exceptions So we have to write Parent Exception after the Child Exception
*/

import java.util.Scanner;
class FinallyDemo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		sc.close();
		System.out.println(sc.next());
	}
}

/* Output ->

disha
disha
Exception in thread "main" java.lang.IllegalStateException: Scanner closed
        at java.base/java.util.Scanner.ensureOpen(Scanner.java:1150)
        at java.base/java.util.Scanner.next(Scanner.java:1465)
        at FinallyDemo.main(Program15.java:27)
*/
