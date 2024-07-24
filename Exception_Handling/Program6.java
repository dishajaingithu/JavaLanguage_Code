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

//ArrayIndexOutOfBoundsException -:
//This Exception Mostly Happens when we can access the data above from the index.
class ArrayIndexOutOfBoundsException1{

	public static void main(String[] args){
		
		int arr[] = {10,20,30,40};
		for(int i=0; i<5; i++){

			System.out.println(arr[i]);
		}
	}
}

/*Output ->

10
20
30
40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at ArrayIndexOutOfBoundsException1.main(Program6.java:23)
*/
