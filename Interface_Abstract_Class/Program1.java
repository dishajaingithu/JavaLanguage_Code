/*
	============= Java Language =============

	Interface :
	
	* 'interface' keyword is used to define the Interface.
	* Interface is Used to achieve the Multiple Inheritance.
	* Interface is Not a Class.
	* Object class in not a Parent of Interface.
	* We can't create the Object of Interface but we can use the interface as a reference and object of 
	  class i.e., cannot be instantiated.(IndialCulture obj = new UP();)
	* Constructor is not present in Interface.
	* Bydefault All methods are public abstract in Interface.
	* Interface Abstract method may or may not be have the body.
	  ie.1) way 1-> default void method1(){
	  		
	  	       }
	        Note : We can give the Body to the method inInterface using like this and also child override
	               this method.

	      2) Way 2-> static void method1(){

	      	      	}
	        Note : We Can give the Body to the method in Interface using like this but in Child we Can't
	               Override the Method.

	* We can use the 'implements' keyword to implement the methods in interface to another
	  class.

	Syntax:
		interface IndianCulture{

			void festival();
		}
		class UP implements IndianCulture{

			public void festival(){

			}
		}
	
	Types Of Interface :
	1) Marker Interface.
		* A Marker Interface is an interface that doesn't have any method or constants
		  inside it.
		* It Provides Runtime type information about the Objects.
		SYNTAX :
			interface A {
				
			}

		* Marker Interface are :
			I)Serializable Interface.
	       	       II)Clonable Interface.
	              III)Random Access Interface.
*/
