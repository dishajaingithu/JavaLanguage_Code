/*
	============= Java Language =============

	Exception Handling ->

	* Own Exception Handling Code
*/

class MyException extends Exception{

	String msg;

	MyException(String str){

		msg = str;
	}

	public String toString(){

		return msg;
	}
}

class Demo{

	void method1() throws MyException{

		for(int i=5; i>0; i--){

			System.out.println(i);
			if(i==2){
				throw new MyException("Hello");
			}
		}
	}

	public static void main(String[] args)throws MyException{

		Demo obj = new Demo();
		obj.method1();
	}
}

/* Output ->
5
4
3
2
Exception in thread "main" Hello
        at Demo.method1(Program18.java:32)
        at Demo.main(Program18.java:40)
*/
