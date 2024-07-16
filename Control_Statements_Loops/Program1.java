/*
 	============= Java Language ==============

	Statements ->
		1) if 
			syntax ->
				if(condition){
					//code or body
				}

		2) if-else
			
			syntax ->
				if(condition){
					//code or body
				}else{
					//code or body
				}

		3) if-else-if
			
			syntax ->
				if(condition 1){
					//code or body
				}else if(condition 2){
					// code or body
				}

		4) swich
			
			syntax -> 
				switch(expression){
					case x:
						//code
						break;
					case y:
						//code
						break;
					default:
						//code
						break;
				}

*/


// if Statement
class IfStatement{

	public static void main(String[] args){

		int num = 20;

		if(num % 2 == 0){

			System.out.println("In If-Block");

		}

		System.out.println("Out of If-Block");
	}
}
/* Output ->
 	
   	In If-Block
	Out of If-Block
*/


// if-else Statement
class IfElseStatement{

	public static void main(String[] args){

		int num = 5;
		
		if(num % 2 == 0){

			System.out.println("In If-Block");

		}else{
			System.out.println("In Else-Block");
		}

		System.out.println("Out of If-Else Block");
	}
}
/* Output ->
	
   	In Else-Block
	Out of If-Else Block
*/


// if-else-if Statement
class IfElseIfStatement{

	public static void main(String[] args){

		int age = 30;
		
		if(age <= 12){

			System.out.println("Child");

		}else if(age > 12 && age < 18){

			System.out.println("Teenager");

		}else{
			System.out.println("Adult");
		}
	}
}
/* Output ->

   	Adult
*/






