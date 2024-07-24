/*
	============= Java Language =============

	Exception Handling ->

        UnChecked Exception(RunTime Exception) :-

	Format of RuntimeException :-
	Thread	ExceptionName	:	Description
		StackTrace
	
  	1)ArithmeticException   	     
  	2)NullPointerException   
	3)OutOfBoundsException ->
		I)ArrayIndexOutOfBoundsException
	       II)StringIndexOutOfBoundsException	
*/

//ArithemeticException -:
//This Exception Mostly Happens when any Number is divide by Zero.
class ArithmeticException1{

	public static void main(String[] args){

		int x = 10;
		for(int i=5; i>=0; i--){

			System.out.println(x/i);
		}
	}
}

/* Output ->

2
2
3
5
10
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ArithmeticException1.main(Program4.java:24)
*/

//Handle the ArithmeticException Using Try-Catch.
class ArithmeticException2{

	public static void main(String[] args){

		int x = 10;

		for(int i=5; i>=0; i--){

			try{
				System.out.println(x/i);
			}catch(ArithmeticException ae){

				ae.printStackTrace();
			}
		}
	}
}

/* Output ->

2
2
3
5
10
java.lang.ArithmeticException: / by zero
        at ArithmeticException2.main(Program4.java:49)
*/
