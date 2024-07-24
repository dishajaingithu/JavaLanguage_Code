/*
	============= Java Language =============

	Exception Handling ->

        Checked Exception(Compile Time Exception) :-
  	1)IOException   	     
  	2)FileNotFoundException   
	3)SQLException	    
  	4)InterruptedException
*/

//IOException - Input/Output Exception 
//This Exception Mostly Happens when the Input Stream is close and we try to get the Input From User
import java.io.*;
class InputOutputException1{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Name : ");
		String st = br.readLine();

		System.out.println("Name : " + st);

		br.close();

		System.out.print("Enter the Age : ");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Age : " + age);
	}
}

/* Output ->
	
   	Enter the Name : Disha
	Name : Disha
	Enter the Age : Exception in thread "main" java.io.IOException: Stream closed
        	at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
        	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
        	at InputOutputException.main(Program2.java:31)
*/

//Also Exception Happens when we take the Input from user then we don't throws the Exception or Not Handle in Try-Catch.

class InputOutputException2{

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Name : ");
		String st = br.readLine();

		System.out.println("Name : " + st);

		System.out.print("Enter the Age : ");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Age : " + age);
	}
}

/* Compile Time Error ->
 
Program2.java:55: error: unreported exception IOException; must be caught or declared to be thrown
                String st = br.readLine();
                                       ^
Program2.java:60: error: unreported exception IOException; must be caught or declared to be thrown
                int age = Integer.parseInt(br.readLine());                                                      ^
*/
