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

	static void method1(){

	}

	class Inner{

		int a = 30;
		static void method1(){

		}

	}
}

/* Error :

error: Illegal static declaration in inner class Outer.Inner
                static void method1(){
                            ^
modifier 'static' is only allowed in constant variable declarations

*/
