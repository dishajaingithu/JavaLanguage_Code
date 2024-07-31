/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class ThreadDemo extends Thread{

	void method1(){
		System.out.println("In Method-1");
	}

	void method2(){
		System.out.println("In Method-2");
	}

	void fun(){
		System.out.println("In fun");
		System.out.println("In Fun Thread Name : " + Thread.currentThread().getName());
		ThreadDemo obj = new ThreadDemo();
		obj = null;
		obj.method1();
	}

	void gun(){
		System.out.println("In gun");
		System.out.println("In Gun Thread Name : " + Thread.currentThread().getName());
		ThreadDemo obj = new ThreadDemo();
		obj = null;
		obj.method1();
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
In Gun Thread Name : Bardiya
In Fun Thread Name : Disha
Exception in thread "Disha" Exception in thread "Bardiya" java.lang.NullPointerException
        at ThreadDemo.gun(Program17.java:31)
        at ThreadDemo.run(Program17.java:39)
java.lang.NullPointerException
        at ThreadDemo.fun(Program17.java:23)
        at ThreadDemo.run(Program17.java:36)
*/
