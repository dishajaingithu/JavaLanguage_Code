/*
	============= Java Language =============

	Inner Class :

	* Java inner class is defined inside the body of another class.
	* Java Inner class can be declared private,public,protected or with default access whereas an
	  outer class can have only public or default access.
	* Object Class is a Parent of Outer Class and Inner Class.
	* Inner classes help in localizing important code constructs while still encapsulating them in the 
	  form of a class.
	
	5) Anonymous Inner Class.
		* Use for One time.
*/
class Time{

	void time(){
		System.out.println("My Time is 10AM");
	}
}
class Vel{

	public static void main(String[] args){

		new Time(){

			void time(){
				System.out.println("When time goes it never comes");
			}
		}.time();
	}
}
/* Output :
When time goes it never comes

Note : Object use only One time.


Internally :
class Vel$1 extends Time{

	Vel$1();
		invokespecial
		return
	void time();
		invokervirtual
		return
*/

