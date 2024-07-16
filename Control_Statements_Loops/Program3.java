/*
 	============= Java Language ==============

	Statements ->

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


// switch Statement
class SwitchStatement{

	public static void main(String[] args){

		int dayNo = 5;

		switch(dayNo){

			case 1:
				System.out.println("Monday");
				break;

			case 2:
				System.out.println("Tuesday");
				break;

			case 3:
				System.out.println("Wednesday");
				break;

			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				break;

			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Wrong Day Number");
				break;
		}
	}
}

/* Output ->
	
   	Friday
*/
