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
	class Inner1{

		class Inner2{

			void m3(){
				System.out.println("In M3 - Inner2");
			}

			void m2(){

				Inner2 i2 = new Inner2();
				i2.m3();
				System.out.println("In M2 - Inner2");
			}
		}
	}

		void m1(){

			Outer.Inner1.Inner2 i1 = new Outer().new Inner1().new Inner2();
			i1.m2();
			System.out.println("In M1 - Inner1");
		}
	public static void main(String[] args){

		Outer o = new Outer();
		o.m1();
	}
}
/* Output :

In M3 - Inner2
In M2 - Inner2
In M1 - Inner1
*/
