/*
	============= Java Language =============

	Exception Handling ->

        Try-Catch for RuntimeException :-

	syntax :-

		try{
			Exception_Code
		}catch(Exception_Name obj_Name){

			Handling Code
		}finally{

		}

	* For Clean Up Code,finally is Used.
	* In Finally,close only dependent Connection.
*/

import java.io.*;
class FinallyDemo{
	public static void main(String[] args){
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		try{
			br1.close();
			br1.readLine();
		}catch(IOException io){
			System.out.println("Handling Code");
		}finally{

			try{
				br2.close();
				br2.readLine();
			}catch(Exception e){
				System.out.println("Catch Finally");
			}

			System.out.println("In Finally");
		}
	}
}

/* Output ->

Handling Code
Catch Finally
In Finally

*/
