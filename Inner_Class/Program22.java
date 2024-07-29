/*
	============= Java Language =============

	Inner Class :

	* Java inner class is defined inside the body of another class.
	* Java Inner class can be declared private,public,protected or with default access whereas an
	  outer class can have only public or default access.
	* Object Class is a Parent of Outer Class and Inner Class.
	* Inner classes help in localizing important code constructs while still encapsulating them in the 
	  form of a class.
	
	4) Static Inner Class.
	Syntax :-
		class Outer{

			static class Inner{

			}
		}
*/
class Hospital{

	static int h = 3;

	static class Doctor{

		static int d = 1;

		void checkup(){

			System.out.println("In Hospital for checkup");
			System.out.println("D : " + d);
			System.out.println("H : " + h);
		}
	}
	public static void main(String[] args){

		Doctor dChecking = new Doctor();
		dChecking.checkup();
	}
}
/* Output :

In Hospital for checkup
D : 1
H : 3

Note : Inner class doesn't fully depend on the Outer Class.
       Their is No this$0
*/
