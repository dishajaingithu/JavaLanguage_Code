/*
	============= Java Language =============

	Array ->

		* Array is the collection of similar type of data.
		* It is a data structure which stores a collection of homogenous(similar) items.
		* It is a Indexing based(start from 0 index).
		* Memory allocation is Contigious.
		* Starting Address of first data and name of the array is same.
	
		* Representation of Array -> data_type[] name_of_array;
					     ex. int[] ages;
		
		* Array Declaration -> data_type[] array_name = new data_type[size];
				       ex. int[] ages = new int[5];
				       - 'new' keyword is used for new memory allocation in Heap Area.

		* Array Literal -> With Curly braces we can initialize the array and add value to is during
		                   Initialization without defining the size.

				   ex. int[] ages = {20,21,22,23,24};

		* Memory Allocation in Arrays -> int[] age = new int[3]
					
					| 10 | 20 | 30 |
				       100  104  108  111
			-> In above example, Array is of Integer data type having the size 3.
			-> 12 byte of memory is required for this Array.

		* Accessing Elements in Single Dimensional Array ->
			
			-> 0-based Indexing.
			-> int[] ages = new int[5];
			-> | 10 | 20 | 30 | 40 | 50 |	
			-> ages[0] = 10		ages[3] = 40
			   ages[1] = 20		ages[4] = 50
			   ages[2] = 30

		* Array Types ->
			
			1) Single Dimensional or One Dimensional Array.
			2) Multidimensional Array or Array of Array or more than one Dimension.
				-> 2D Array.
				-> 3D Array.

		* Initializing and Accessing the elements of 1D and 2D Array.

			1D Array ->
				int[] ages = new int[5];
				int[] ages = {1,2,3};

			2D Array -> 
				int[][] multiArray = new int[size_row][size_col]
				ex.int[][] multiArray = new int[3][4];

				| 1 | 2 |	multiArray[0][0] = 1	multiArray[1][1] = 4
				| 3 | 4 |	multiArray[0][1] = 2	multiArray[2][0] = 5
				| 5 | 6 |	multiArray[1][0] = 3	multiArray[2][1] = 6

		* Traversing through the Array :
			- We can use loops to traverse through the Array.
			- There are many ways to iterate over the Array.
			- The most common ways of looping through arrays.
				1) for-loop
				2) for each loop
				3) while loop

			1) for-Loop
				for(int i=0; i<ages.length; i++){
					System.out.println(ages[i]);
				}

			2) for-each loop
				for(int age:ages){
					System.out.println(age);
				}
			3) while-loop
				int i=0;
				while(i<ages.length){
					System.out.println(ages[i]);
					i++
				}
			
*/
