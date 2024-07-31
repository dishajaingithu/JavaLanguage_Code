/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Runnable Interface.
*/
class Demo implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++){
			System.out.println("In Runnable");
		}
	}

	public static void main(String[] args){

		
		System.out.println(Thread.currentThread().getName());
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.start();

		for(int i=0; i<5; i++){
			System.out.println("In Main");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
/* Output :

main
In Main
In Main
In Main
In Main
In Main
main
Thread-0
In Runnable
In Runnable
In Runnable
In Runnable
In Runnable

Note : Output of the code is depend on Thread Priority.
*/
