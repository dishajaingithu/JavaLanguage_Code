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
import java.util.Scanner;
import java.io.*;
class Demo{
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try{
			System.out.println("In Try");
			int x = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println("In Catch");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
		}

		System.out.println(str);
		System.out.println("After Try-Catch");
	}
}

/*Output ->
	
     1)	In Try
	disha
	In Catch
	disha
	disha
	After Try-Catch

     2)	In Try
	10
	null
	After Try-Catch
*/
