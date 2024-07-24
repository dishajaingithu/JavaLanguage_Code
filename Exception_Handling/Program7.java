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

//StringIndexOutOfBoundsException -:
//This Exception Mostly Happens when we can access the data above from the index.
class StringIndexOutOfBoundsException1{

	public static void main(String[] args){
		
		String str = "Disha";
		for(int i=0; i<6; i++){

			System.out.println(str.charAt(i));
		}
	}
}

/*Output ->

D
i
s
h
a
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
        at java.base/java.lang.String.charAt(String.java:693)
        at StringIndexOutOfBoundsException1.main(Program7.java:23)
*/
