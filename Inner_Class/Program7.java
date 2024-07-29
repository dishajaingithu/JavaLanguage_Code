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

class Mall{

	int noOfshops = 20;
	static int entranceGate = 5;

	void shopping(){

		System.out.println("Shopping the Cloths");
	}

	class Shops{

	}

	static void parking(){

		System.out.println("Park the Cars and Vehicle");
	}
}

class Demo{

	public static void main(String[] args){

		Mall amanora = new Mall();
		Mall.Shops zara = amanora.new Shops();
		amanora.parking();
		amanora.shopping();
	}
}
/* Output :

Park the Cars and Vehicle
Shopping the Cloths
*/
