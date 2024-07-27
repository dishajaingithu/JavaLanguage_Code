/*
	============= Java Language =============

	Inheritance ->

	* In Inheritance,Parent and Child relation is Compulsory.
	* To Make the Parent and Child Relation,'extends' keyword is Necessary.
	ex:
		class Parent{

		}
		class Child extends Parent{

		}

	Types of Inheritance :-

	1) Single Inheritance :-
		* In single inheritance,a sub-class is derived from only one super class.
		* It inherits the properties and behavior of a single-parent class.
		ex : A
		     |
		     B
		    ‘A’ is a parent class and ‘B’ is a child class.
		    The Class 'B' inherits all properties of the class 'A'.

	2) Multilevel Inheritance
		* In Multilevel inheritance,a derived will be inheriting a base class and as well
		  as the derived class also acts as the base class for the other classes
		ex : A -> Base Class
		     |
		     B -> Intermediatory Class
		     |
		     C -> Derived Class

	3) Hierarchical Inheritance
		* In Hierarchical Inheritance, one class serves as a superclass (base class)
		  for more than one subclass.
		* class A serves as a base class for the derived classes B, C, and D.
		ex : 		A -> 		Base Class
			|	|	|
			B	C	D	Derived Class

	4) Multiple Inheritance 
		* In Multiple inheritances, one class can have more than one superclass and inherit
		  feature from all parents class.
		Note:Java does not support multiple inheritances with classes.
	5) Hybrid Inheritance
		* It is a mix of two or more of the above types of Inheritanve.
	Note:Java does not support hybrid inheritance.
	ex :		A
       		B		C
			D
*/	
