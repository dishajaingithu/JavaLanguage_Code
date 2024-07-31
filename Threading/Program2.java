/*
	============= Java Language ==============
	
	Thread :
*/
class ThreadClass{

	static void method1()throws ArithmeticException{

		System.out.println(10/0);
	}

	static void method2(){

		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){
			System.out.println("Sleep Condition");
		}
	}

	public static void main(String[] args){

		method1();
		method2();
	}
}
/* Error :

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ThreadClass.method1(Program2.java:18)
        at ThreadClass.main(Program2.java:32)
*/
