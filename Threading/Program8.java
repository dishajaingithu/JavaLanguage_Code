/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class Demo extends Thread{

	public void run(){	//Overriden run() Method.

		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++){
			System.out.println("Hello");
		}
	}

	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName());
		Demo d = new Demo();
		d.start();
	}
}
/* Output :

main
Thread-0
Hello
Hello
Hello
Hello
Hello

Note : Output of the code is depend on Thread Priority.
*/
