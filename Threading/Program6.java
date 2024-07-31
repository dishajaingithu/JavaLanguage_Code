/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class Demo extends Thread{

	public void run(){	//Overriden run() Method.

		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName());
		Demo d = new Demo();
		d.start();
		d.start();
	}
}
/* Output :

main
Thread-0
Exception in thread "main"java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:789)
        at Demo.main(Program6.java:20)

Note : Output of the code is depend on Thread Priority.
*/
