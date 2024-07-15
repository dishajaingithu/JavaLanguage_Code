/*

   	========== Java Language =========
	
	Data Type -> 
		
		Syntax ->
			Date_Type  variable_name  =  Value;
			
			ex. String name = "Disha";
			    int age = 23;
		
		Two Types ->
			1) Primitive Data Type / Built in Data Type
				* Hold Single Value.
				* Cannot be Divided.
			   
			    1 Byte 	= 	8 Bits.
			    - boolean	-> 	1 Byte.(true/false).
			    - char	-> 	2 Byte. (Supports the Unicode).
			    - byte 	-> 	8 bits.
			    - short 	-> 	2 Byte.
			    - int 	-> 	4 Byte.
			    - long 	-> 	8 Byte.
			    - float 	-> 	4 Byte.
			    - double 	-> 	8 Byte.
			
			2) Non-Primitive Data Type / User Defined Data Type
				* Memory Address of Variable.
				* Complicated
				
			    - String
			    - Array 
			    - Classes
			    - Interface
*/

class DataType{

	public static void main(String[] args){

		boolean flag	= 	true;
		byte age 	= 	60;
		short rollNo 	= 	23;
		int No		=	40;
		long phoneNo	=	85301938;
		float salary	=	74984.89f;
		double average	=	6.890;
		char wing	=	'A';

		System.out.println("Boolean : " + flag);	
		System.out.println("Byte : " + age);
		System.out.println("Short : " + rollNo);
		System.out.println("Integer : " + No);
		System.out.println("Long : " + phoneNo);
		System.out.println("Float : " + salary);
		System.out.println("Double : " + average);
		System.out.println("Character : " + wing);
	}
}

/* Output :
 
   	Boolean : true
	Byte : 60
	Short : 23
	Integer : 40
	Long : 85301938
	Float : 74984.89
	Double : 6.89
	Character : A
*/


