/*

   	========== Java Language =========

	
	Variable -> 
		
		Syntax ->
			Date_Type  variable_name  =  Value;
			
			ex. String name = "Disha";
			    int age = 23;
		
		* The names used to refer to data stored in the memory.
		* One Java variable can hold only a single type of data.
		* It means to assign data to a particular memory and use a name for that memory.

	Rules for Name of Variable -> Name of the Variable write in CamelCase i.e.,(dishaBardiya)
		
		Rule 1 -> Variable Name should not begin with the Number.
			  ex. int 1st_Num; -> Wrong Way.
			      int Num_1st; -> Correct Way.

		Rule 2 -> Whitespace is not permitted in Variable Name.
		     	  ex. int money borrowed -> Wrong Way.
			      int money_borrowed -> Correct Way.

		Rule 3 -> A Java Keyword(reserved Word) Cannot be used as a Variable Name.
			  ex. int public = 10000; 	-> Wrong Way.
			      int population = 10000;	-> Correct Way.

		Rule 4 -> It is Preffered to use Variable names with more than one word with all lowerCase letters for the first
			  word and Capitalization of the first letter of each subsequent word.
			  ex. camelCase.

		Rule 5 -> When creating Variable,it is preffered to give meaningful names.
			  ex. int a;	-> Wrong Way.
			      int age;	-> Correct Way.

		Rule 6 -> All lowercase letters should be used when creating one word variable name.
			  ex. int Age;	-> Wrong Way.
			      int age; 	-> Correct Way.

*/

class Variables{

	public static void main(String[] args){

		String name = "Disha";		// 'name' is the Name of Variable to store the String Data type.
		int age = 23;			// 'age' is the Name of Variable to store the Integer(int) Data Type.

		System.out.println("Name : " + name);	
		System.out.println("Age : " + age);

	}
}

/* Output :
 
   	Name : Disha
	Age : 23
*/


