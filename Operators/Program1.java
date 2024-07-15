/*
		========= Java Language =========

	
	Operators ->
		
		- Unary Operator -> Pre Increment,Pre Decrement,Post Increment and Post Decrement.
		- Binary Operator -> Arithmetic,Relational,Logical and Bitwise Operator.
		- Ternary Operator -> (x>y) ? x : y.
		
		1) Arithmetic Operator ->
			* Addition (+)
			* Substraction (-)
			* Multiplication (*)
			* Division (/)
			* Modulus (%)

		2) Relational Operator ->
			* is Equal to (==)
			* Not Equal to (!=)
			* Greater than (>)
			* Less than (<)
			* Greater than equal to (>=)
			* Less than equal to (<=)

		3) Logical Operator ->
			* Logical AND (&&)
			* Logical OR (||)
			* Logical NOT (!)

		   Truth Table for Logical AND (&&) ->
		   					false	false -> false
		   					true	false -> false
							false	true  -> false
							true	true  -> true
		   Truth Table for Logical AND (||) ->
		   					false	false -> false
		   					true	false -> true
							false	true  -> true
							true	true  -> true
							
			
		4) Bitwise Operator ->
			* AND (&)
			* OR (|)
			* XOR (^)
			* Left Shift (<<)
			* Right Shift (>>)

		   Truth Table for Bitwise AND (&) ->
		   					false	false -> false
		   					true	false -> false
							false	true  -> false
							true	true  -> true
		   Truth Table for Bitwise OR (|) ->
		   					false	false -> false
		   					true	false -> true
							false	true  -> true
							true	true  -> true
		   Truth Table for Bitwise XOR (^) ->
		   					false	false -> false
		   					true	false -> true
							false	true  -> true
							true	true  -> false

*/

 class ArithmeticOperator{

	public static void main(String[] args){

		int x = 20;
		int y = 10;

		System.out.println(x + y);	// 30
		System.out.println(x - y);	// 10
		System.out.println(x * y);	// 200
		System.out.println(x / y);	// 2
		System.out.println(x % y);	// 0

	}
}

   class RelationalOperator{

	public static void main(String[] args){

		int x = 20;
		int y = 10;

		System.out.println(x > y);	// true
		System.out.println(x < y);	// false
		System.out.println(x >= y);	// true
		System.out.println(x <= y);	// false
		System.out.println(x == y);	// false
		System.out.println(x != y);	// true
	}
}

class LogicalOperator{

	public static void main(String[] args){

		boolean x = true;		// In Logical Operator,boolean value is Required.
		boolean y = false;

		System.out.println(x && y);	// false
		System.out.println(x || y);	// true
	}
}


class BitwiseOperator{

	public static void main(String[] args){

		int x = 5;
		int y = 4;

		System.out.println(x & y);	// 4
		System.out.println(x | y);	// 5
		System.out.println(x << y);	// 80 -> x * y^2
		System.out.println(x >> y);	// 0  -> x/y^2
		System.out.println(x ^ y);	// 1
	}
}



class TernaryOperator{

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		System.out.println((x > y) ? x : y);	// 20
	}
}


