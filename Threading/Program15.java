/*
	============= Java Language ==============
	
	Exception :
*/
import java.io.*;
class Demo{

	void fun() throws IOException{
		throw new IOException("Exception : IO");
		System.out.println("In Fun");	//Unreachable statement
	}

	public static void main(String[] args)throws IOException{
		Demo obj = new Demo();
		obj.fun();
	}
}
/* Error : 

error:unreachable statement
          System.out.println("In Fun");   //Unreachable statement
*/
