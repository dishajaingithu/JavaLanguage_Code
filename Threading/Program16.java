/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
import java.io.*;
class MyException extends Exception{

	MyException(String msg){
		super(msg);
	}
}

class ThreadDemo extends Thread{

	void fun()throws IOException{
		System.out.println("In fun");
		System.out.println("In Fun Thread Name : " + Thread.currentThread().getName());
		throw new IOException("IOException");
	}

	void gun()throws MyException{
		System.out.println("In gun");
		System.out.println("In Gun Thread Name : " + Thread.currentThread().getName());
		throw new MyException("MyException");
	}

	public void run(){
		if(Thread.currentThread().getName().equals("Disha")){
			try{
				fun();
			}catch(IOException io){
				io.printStackTrace();
			}
		}
		if(Thread.currentThread().getName().equals("Bardiya")){
			try{
				gun();
			}catch(MyException me){
				me.printStackTrace();
			}
		}
	}

	public static void main(String[] args){
		ThreadDemo obj1 = new ThreadDemo();
		obj1.setName("Disha");
		obj1.start();

		ThreadDemo obj2 = new ThreadDemo();
		obj2.setName("Bardiya");
		obj2.start();
	}
}
/* Output :

In fun
In gun
In Fun Thread Name : Disha
In Gun Thread Name : Bardiya
MyException: MyException
        at ThreadDemo.gun(Program16.java:27)
        at ThreadDemo.run(Program16.java:40)
java.io.IOException: IOException
        at ThreadDemo.fun(Program16.java:21)
        at ThreadDemo.run(Program16.java:33)
*/
