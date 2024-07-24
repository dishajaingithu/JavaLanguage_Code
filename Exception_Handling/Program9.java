/*
	============= Java Language =============

	Exception Handling ->

        * No effect because it is Runtime Exception.
*/
class Demo{

	void method1(){

		System.out.println("In Method 1");
	}

	public static void main(String[] args) throws NullPointerException{

		Demo obj = new Demo();
		obj = null;
		obj.method1();
	}
}
