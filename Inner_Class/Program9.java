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

	class Inner{

		void m1(){
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args){

		Outer.Inner i1 = new Outer().new Inner();
		i1.m1();
	}
}

/* Output :

10
20
*/
