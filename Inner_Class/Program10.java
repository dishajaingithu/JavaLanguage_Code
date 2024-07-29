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
	int x = 10;
	class Inner1{

		int x = 100;

		class Inner2{

			int x = 1000;

			void m1(){

				System.out.println(this.x);
				System.out.println(Inner1.x);
				System.out.println(Outer.x);
			}
		}
	}
}
/* Error :

error: non-static variable x cannot be referenced from a static context
                                System.out.println(Inner1.x);
                                                         ^
error: non-static variable x cannot be referenced from a static context
                                System.out.println(Outer.x);
                                                        ^
*/
