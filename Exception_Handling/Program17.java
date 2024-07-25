/*
	Exception Handling ->

	Practice Code ->
*/

//Code 1
import java.io.*;
class XYZ{

	public static void main(String[] args) throws IOException{

	}
}
//No Error


//Code 2
/*class Test{

}
class Demo{

	public static void main(String[] args){

		try{
			System.out.println("In Try");
		}catch(IOException io){

		}
	}
}
/*
 error: exception IOException is never thrown in body of corresponding try statement
                }catch(IOException io){
*/


//Code 3
class Test1 extends Exception{

}
class Demo2{

	public static void main(String[] args){

		System.out.println(10/0);

	}
}
/* Runtime Error ->
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo2.main(Program17.java:47)
*/
