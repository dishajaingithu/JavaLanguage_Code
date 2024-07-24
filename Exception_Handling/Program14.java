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

import java.io.*;
class Demo{
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try{
			System.out.println("In Try");
			str = br.readLine();

		}catch(IOException io){
			System.out.println("In Catch 1");
			System.out.println(io);
		}catch(NumberFormatException nf){

			System.out.println("In Catch 2");
			System.out.println(nf);
		}catch(InterruptedException ie){

			System.out.println("In Catch 3");
			System.out.println(ie);
		}
		System.out.println("After Try-Catch");
	}
}

/* Error ->
	
error: exception InterruptedException is never thrown in body of corresponding try statement
                }catch(InterruptedException ie){
*/
