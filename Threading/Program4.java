/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class Demo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++){
			System.out.println("In run");
		}
	}

	public static void main(String[] args){

		
		System.out.println(Thread.currentThread().getName());
		Demo d = new Demo();
		d.start();

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
Thread-0
In Main
In Main
In Main
main
In run
In run
In run
In run
In run


Note : Output of the code is depend on Thread Priority.
*/
