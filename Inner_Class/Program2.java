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

		int a = 30;
		//static int b = 40;

	}
}

/* Error :

error: Illegal static declaration in inner class Outer.Inner
                static int b = 40;
                           ^
modifier 'static' is only allowed in constant variable declarations

Note : We Can't have any static variables in Inner class.
       Static Variable can't initialize in Inner Class.
*/
