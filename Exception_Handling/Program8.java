/*
	============= Java Language =============

	Exception Handling ->

        gun()
	 |
	fun()
         |
 	main()	-> JVM -> DefaultExceptionHandler	 

*/
import java.io.*;
class ExceptioDemo{

	static void gun() throws IOException{

		System.out.println("In Gun");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.close();
		br.readLine();
		System.out.println("In Gun aftre fun");
	}

	static void fun() throws IOException{

		System.out.println("In Fun");
		gun();
		System.out.println("In Fun After gun");
	}

	public static void main(String[] args) throws IOException{

		System.out.println("In Main");
		fun();
		System.out.println("In Main After Fun");
	}
}

/*Output ->

In Main
In Fun
In Gun
Exception in thread "main" java.io.IOException: Stream closed
        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
        at ExceptioDemo.gun(Program8.java:21)
        at ExceptioDemo.fun(Program8.java:28)
        at ExceptioDemo.main(Program8.java:35)
*/
