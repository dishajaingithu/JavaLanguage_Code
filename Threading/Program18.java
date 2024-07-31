/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class ThreadDemo extends Thread{
	void fun(){
		for(int i=0; i<5; i++){
			System.out.println("In fun");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			
			}
		}
	}
	void gun(){
		for(int i=0; i<5; i++){
			System.out.println("In gun");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			
			}
		}
	}

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
}
/* Output :

In fun
In gun
In fun
In gun
In fun
In gun
In fun
In gun
In fun
In gun

Note : Every line prints after every 1 sec i.e., thread sleep for 1 sec.
*/
