/*
	============= Java Language ==============
	
	Thread :
*/
import java.io.*;
class Demo{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static void method1()throws IOException{

		br.close();
		br.readLine();
	}

	static void method2(){
		System.out.println("In Method-2");
	}

	public static void main(String[] args){

		method1();
		method2();
	}
}
/* Error :

error: non-static variable br cannot be referenced from a static context
                br.close();
error: non-static variable br cannot be referenced from a static context
                br.readLine();
*/
