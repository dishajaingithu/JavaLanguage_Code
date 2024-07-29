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

			System.out.println("In Method 1 - Inner X : " + x);
		}
	}

	static void m2(){
		System.out.println("In Method 2 - Outer");
		Outer o = new Outer();
		Inner i = o.new Inner();//o.new Inner() represents that compiler gives 'this' when we call
					//Inner class into the Outer class Method.
		i.m1();
	}
	public static void main(String[] args){

		Outer.m2();
	}
}
/* Output :

In Method 2 - Outer
In Method 1 - Inner X : 30
*/
