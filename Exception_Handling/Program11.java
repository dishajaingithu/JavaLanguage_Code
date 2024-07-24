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
	public static void main(String[] args) throws NullPointerException{
		
		try{
			System.out.println("In Try");
		}catch(Exception e){

			System.out.println("In Catch");
		}
		
		System.out.println("After Try-Catch");	
	}
}

/*Output ->
	
  	In Try
	After Try-Catch
*/
