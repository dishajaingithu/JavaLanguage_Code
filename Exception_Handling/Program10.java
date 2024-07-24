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
*/
import java.io.*;
class Demo{

	void method1(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			br.close();
			br.readLine();
		}catch(IOException io){

			System.out.println("Stream Closed");
			System.out.println(io.toString());
			System.out.println(io.getMessage());
			io.printStackTrace();
		}
		System.out.println("In Method 1");
	}

	void method2(){

		System.out.println("Data Stored in Database");
	}

	public static void main(String[] args) throws NullPointerException{

		Demo obj = new Demo();
		obj.method1();
		obj.method2();
		System.out.println("At Home");
	}
}

/*Output ->

Stream Closed
java.io.IOException: Stream closed
Stream closed
java.io.IOException: Stream closed
        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
        at Demo.method1(Program10.java:25)
        at Demo.main(Program10.java:44)
In Method 1
Data Stored in Database
At Home
*/
