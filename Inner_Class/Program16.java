/*
	============= Java Language =============

	Inner Class :

	* Java inner class is defined inside the body of another class.
	* Java Inner class can be declared private,public,protected or with default access whereas an
	  outer class can have only public or default access.
	* Object Class is a Parent of Outer Class and Inner Class.
	* Inner classes help in localizing important code constructs while still encapsulating them in the 
	  form of a class.
	
	3) Method Local Inner Class.
	Syntax :-
		class Outer{

			void method1(){

				class Inner{

				}
			}
		}
		
*/
class Outer{

	void method1(){

		class Inner{

		}
	}

	void method2(){

		class Inner2{

		}
	}
}

//Outer.class
//Outer$1Inner.class
//Outer$1Inner2.class
