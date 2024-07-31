/*
	============= Java Language ==============
	
	Thread :

	* Thread as a subprocess with lightweight with the smallest unit of Processes and also has 
	  separate paths of execution.
	* The main advantage of multiple threads is efficiency(allowing multiple things at the same time).
	* In java,at least one thread is always present that is 'main' thread.
	* There are two ways to create the thread in Java
		1) Using Thread Class.
		2) Using Runnable Interface.
	* When we call to the start method then implicitly calls go to the run() method of Runnable Interface
	


	1) Using Thread Class :
		Thread
	    |		|
	start()		run()
 (method of	   (method of Runnable 
  Thread class)		Interface).

  	Thread LifeCycle :

		1)Born/new
		2)Ready to Run
		       |-Thread Schedular(JVM Allocation CPU)
		3)Running
		4)Exit
*/	
