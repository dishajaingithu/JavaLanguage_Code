/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class ThreadDemo extends Thread{

	public void run(){
		if(Thread.currentThread().getName().equals("Disha")){
			fun();
		}
		if(Thread.currentThread().getName().equals("Bardiya")){
			gun();
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
Disha
In Gun
Bardiya
*/
