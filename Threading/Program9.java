/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class MyThread extends Thread{

	public void run(){

		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
		fun();
	}

	void fun(){
		System.out.println("In Fun");
	}

	public static void main(String[] args){

		System.out.println(Thread.currentThread().getName());
		MyThread mt1 = new MyThread();
		mt1.start();

		MyThread mt2 = new MyThread();
		mt2.start();
	}
}
/* Output :

main
In Run
Thread-0
In Fun
In Run
Thread-1
In Fun

Note : Output of the code is depend on Thread Priority.
*/
