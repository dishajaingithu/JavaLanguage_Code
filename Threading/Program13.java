/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class ThreadDemo extends Thread{

	public void run(){
		if(Thread.currentThread().getName().equals("Thread-0")){
			fun();
		}
		if(Thread.currentThread().getName().equals("Thread-1")){
			gun();
		}
	}

	public static void main(String[] args){
		ThreadDemo obj1 = new ThreadDemo();
		obj1.start();

		ThreadDemo obj2 = new ThreadDemo();
		obj2.start();
	}

	void fun(){
		System.out.println("In Fun");
		System.out.println(Thread.currentThread().getName());
	}

	void gun(){
		System.out.println("In Gun");
		System.out.println(Thread.currentThread().getName());
	}
}
	
/* Output : 

In Fun
Thread-0
In Gun
Thread-1
*/
