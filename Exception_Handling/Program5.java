/*
	============= Java Language =============

	Exception Handling ->

        UnChecked Exception(RunTime Exception) :-
	Format of RuntimeException :-
        Thread  ExceptionName   :       Description
                StackTrace

  	1)ArithmeticException   	     
  	2)NullPointerException   
	3)OutOfBoundsException ->
		I)ArrayIndexOutOfBoundsException
	       II)StringIndexOutOfBoundsException	
*/

//NullPointerException -:
//This Exception Mostly Happens when object is Null and we try to get value using Object.
class NullPointerException1{

	void method1(){

		System.out.println("In Method 1");
	}
	public static void main(String[] args){

		NullPointerException1 obj = new NullPointerException1();

		obj.method1();
		obj = null;
		obj.method1();

		System.out.println("I am Here");
	}
}

/*Output ->

In Method 1
Exception in thread "main" java.lang.NullPointerException
        at NullPointerException1.main(Program5.java:28)
*/
