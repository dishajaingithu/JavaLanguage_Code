/*
	============= Java Language =============

	Inner Class :

	* Java inner class is defined inside the body of another class.
	* Java Inner class can be declared private,public,protected or with default access whereas an
	  outer class can have only public or default access.
	* Object Class is a Parent of Outer Class and Inner Class.
	* Inner classes help in localizing important code constructs while still encapsulating them in the 
	  form of a class.
	
	2) Nested Inner Class.
	Syntax :-
		class Outer{

			class Inner1{

				class Inner2{

				}
			}
		}
*/
class Outer{
	class Inner{

		int x = 30;

		void m1(){

			System.out.println("X : " + x);
		}
	}

	void m2(){

		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args){

		Outer o = new Outer();
		o.m2();
	}
}
/* Output :

X : 30
*/
