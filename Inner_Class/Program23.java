/*
	============= Java Language =============

	Inner Class :

	Real Time Example included all the inner class.
*/
class India{

	static String captialOfIndia = "Delhi";

	static{
		System.out.println("=== WELCOME TO INDIA ===");
	}

	class WondersOfIndia{

		int noOfWonders = 8;

		void wonders(){
			System.out.println("Wonders of India : " + noOfWonders);
		}
	}

	static void indianCivilization(){

		System.out.println("Capital of India : " + captialOfIndia);
		System.out.println("Delhi is the heart of India");
	}
}

class States extends India{

	int noOfStates = 28;
	States(){

		System.out.println("There are " + noOfStates + " States in India");
	}

	States(String largestSpiceMarket){
		System.out.println("Asia's Largest Spice Market : " + largestSpiceMarket);
	}
}
class MyCountry{

	public static void main(String[] args){

		India proud = new India();
		India.WondersOfIndia wonder = proud.new WondersOfIndia();

		wonder.wonders();

		States st1 = new States();
		States st2 = new States("Delhi");

		India.indianCivilization();
	}
}
/* Output :

=== WELCOME TO INDIA ===
Wonders of India : 8
There are 28 States in India
Asia's Largest Spice Market : Delhi
Capital of India : Delhi
Delhi is the heart of India

*/
		
