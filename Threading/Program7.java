/*
	============= Java Language ==============
	
	Thread :

	Create Thread using Thread Class.
*/
class Demo extends Thread{

	public static void main(String[] args){
		
		Demo d = new Demo();
		d.start();
	}
}
/* No Error.

Because 'run()' method is Thread Class.
We have to override run method because of multithreading.
*/
