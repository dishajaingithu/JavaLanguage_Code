/*
	============= Java Language =============

	Exception Handling ->

	* An Event,which occurs during the exceution of a program,that disrupts the normal flow of the program's instruction.
	* An Error is a Subclass of Throwable that indicate serious problem that resonable application should not try to catch.


					     Object
			   	   		|
		       	     		Throwable Class
		       	 |       	    			    |
		    Exception 	  	      			  Error
		|	      |	               			    |
              Checked      Unchecked        		    1)VirtualMachineError
		 |     		|	                    2)StackOverFlow
  1)IOException   	    1)ArithmeticException    	    3)OutOfMemoryError 
  2)FileNotFoundException   2)NullPointerException
  3)SQLException	    3)OutOfBoundsException
  4)InterruptedException	I)ArrayIndexOutOfBoundsException
  			       II)StringIndexOutOfBoundsException

*/


