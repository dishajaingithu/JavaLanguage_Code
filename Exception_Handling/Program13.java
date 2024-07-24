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
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try{
			System.out.println("In Try");
			int x = Integer.parseInt(br.readLine());
			br.close();
			str = br.readLine();

		}catch(IOException io){
			System.out.println("In Catch 1");
			System.out.println(io);
		}

		catch(NumberFormatException nf){

			System.out.println("In Catch 2");
			System.out.println(nf);
		}

		System.out.println(str);
		System.out.println("After Try-Catch");
	}
}

/*Output ->
	
     	In Try
	disha
	In Catch 2
	java.lang.NumberFormatException: For input string: "disha"
	null
	After Try-Catch
*/
