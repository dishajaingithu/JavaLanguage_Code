/*
	============= Java Language =============

	Exception Handling ->

        Checked Exception(Compile Time Exception) :-
  	1)IOException   	     
  	2)FileNotFoundException   
	3)SQLException	    
  	4)InterruptedException
*/

//InterruptedException -  
//This Exception Mostly Happens when the we sleep the Thread.

class InterruptedException1{

	public static void main(String[] args){

		System.out.print(Thread.currentThread().getName());
		for(int i=0; i<10; i++){

			//Thread.sleep(2000);

			System.out.println("Hello");
		}
	}
}

/* Compile Time Error :

 error: unreported exception InterruptedException; must be caught or declared to be thrown
                        Thread.sleep(2000);
*/


//Resolve the Above Exception.

//Way 1: Throws the Exception to the System.
class InterruptedException2{

	public static void main(String[] args)throws InterruptedException{

		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<10; i++){

			Thread.sleep(2000);

			System.out.println("Hello");
		}
	}
}

//Way 2: Handle the InterruptedException Using Try-Catch.
class InterruptedException3{

	public static void main(String[] args){

		System.out.println(Thread.currentThread().getName());

		try{
			for(int i=0; i<10; i++){

				Thread.sleep(2000);

				System.out.println("Hello");
			}
		}catch(InterruptedException ie){

			ie.printStackTrace();
		}
	}
}

