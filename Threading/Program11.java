/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class MyThread extends Thread{

	public void run(){

		System.out.println("In Run");
	}
	public static void main(String[] args){

		MyThread mt = new MyThread();
		mt.start();
		System.out.println(mt.getName());
		System.out.println("In Main 1: " + Thread.currentThread().getName());

		Thread t1 = new Thread();
		t1.start();
		System.out.println(t1.getName());
		System.out.println("In Main 2 : " + Thread.currentThread().getName());
		
		Thread t2 = new Thread();
		t2.start();
		System.out.println(t2.getName());
		System.out.println("In Main 2 : " + Thread.currentThread().getName());
	}
}
/* Output : 

Thread-0
In Run
In Main 1: main
Thread-1
In Main 2 : main
Thread-2
In Main 2 : main

Note : * Output of the code is depend on Thread Priority.
*/
