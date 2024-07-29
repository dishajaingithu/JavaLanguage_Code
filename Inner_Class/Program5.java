/*
	============= Java Language =============

	Inner Class :

	* Java inner class is defined inside the body of another class.
	* Java Inner class can be declared private,public,protected or with default access whereas an
	  outer class can have only public or default access.
	* Object Class is a Parent of Outer Class and Inner Class.
	* Inner classes help in localizing important code constructs while still encapsulating them in the 
	  form of a class.

	1) Normal Inner Class.
	Syntax :-
		class Outer{

			class Inner{

			}
		}
*/
class Outer{

	int x = 10;

	static int y = 20;

	void method1(){

		System.out.println("In Method-1");
	}
	class Inner{

		void method2(){
			System.out.println("In Method-2");
			method1();
		}
	}
	public static void main(String[] args){

		Outer obj1 = new Outer();
		Outer.Inner obj2 = obj1.new Inner();
		obj2.method2();
	}
}

/* Output

In Method-2
In Method-1
*/
