/*
	============= Java Language =============
	
	2D Array ->
		
		- int[][] arr = new int[row_size][column_size];
		- int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
*/
class TwoDArray{

	public static void main(String[] args){
		
		int[][] arr1 = new int[2][];
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<arr2.length; i++){
			for(int j=0; j<arr2[i].length; j++){
			
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}		
	}
}

/* Output ->
 	
   	1 2 3
	4 5 6
	7 8 9
*/

