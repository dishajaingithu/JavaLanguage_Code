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
		mt.setName("Disha");
		System.out.println(mt.getName());

		Thread t1 = new Thread();
		t1.start();
		System.out.println(t1.getName());
		t1.setName("Bardiya");
		System.out.println(t1.getName());
	}
}
/* Output : 

Thread-0
Disha
In Run
Thread-1
Bardiya

Note : * Output of the code is depend on Thread Priority.
*/
