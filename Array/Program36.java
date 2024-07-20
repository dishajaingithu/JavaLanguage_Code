/*
	============= Java Language =============
	
	Q30.Jagged Array.

	1 2 3 
	4 5 		
	6 7 8		
*/
class JaggedArray{

	public static void main(String[] args){

		int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};

		System.out.println("Reverse Each Row : ");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/* Output ->
 	
	Reverse Each Row :
	1 2 3
	4 5
	6 7 8   
*/

