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

	int x = 10;
	static int y = 20;

	static void method1(){

		int z = 30;

		class Inner{

			void method2(){
				//System.out.println("X : " + x); Error:non-static variable x cannot be referenced from a static context
				System.out.println("Y : " + y);
				System.out.println("Z : " + z);
			}
		}
		Inner i = new Inner();//Internally new Inner(this,this$0 = null)
		i.method2();
		System.out.println("In Method 1");
	}

	public static void main(String[] args){

		Outer o = new Outer();
		o.method1();		// Way 1

		Outer.method1();	//Way 2
	}
}

/* Output :

Y : 20
Z : 30
In Method 1
Y : 20
Z : 30
In Method 1
*/
