/*
	============= Java Language =============

	Polymorphism :

	  2)Run Time Binding(Method Overriding).
	  	* It is a type of runtime polymorphism where the method in the subclass overrides
		  the method in the superclass,which has the same "name,parameters and Return Type"
		* Here the method to be called is based on the instance of the subclass,which is assign
		  to a reference variable of the superclass.
		Note : Compulsory Required the Parent-Child Relation.
*/

class Parent{

	void method1(){

		System.out.println("In Method1-Parent");
	}
}
class Child extends Parent{

	private void method1(){

		System.out.println("In Method1-Child");
	}

	public static void main(String[] args){

		Parent p = new Child();	//Parent reference and Child Object
		p.method1();
	}
}
/* Error :

 error: method1() in Child cannot override method1() in Parent
        private void method1(){
                     ^
  attempting to assign weaker access privileges; was package

  i.e., default to private.
*/
