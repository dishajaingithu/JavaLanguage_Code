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
class Parent{

	void m1(){
		System.out.println("In M1");
	}
}
class Demo{

	public static void main(String[] args){

		Parent p = new Parent(){

			void m2(){
				System.out.println("In M2");
			}
		};
		p.m1();
	}
}
/* Output :

In M1
*/

