package com.promineotech;

import java.util.Arrays;

public class week3JavaArraysP2 {

	public static void main(String[] args) {
		
		/*
		 * 11.In the method buildArray you will take the int value stored in the given 
		 * variable num and declare an Array of that size called numArray.
		 * - Write a for loop that starts with a loop variable or index of zero (0) and 
		 * checks to see if the loop variable is less than num.
		 * - To fill the Array, you will insert the value of that loop variable to one of the 
		 * slots in numArray indexed by the loop variable
		 * - return the variable numArray after the for loop finishes
		 * -Hint: Put the return statement outside of your for loop.
		 */
		int num;
		num = 8;
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(buildArray(num)));
		
		/*
		 * 12.What number will print to the console when this code runs?
		 */
		int[] arr = new int[5];
		for ( int i = 1; i <= 5; i++){
		    arr[i - 1] = i;
		}
		System.out.println(arr[2]);
		
		
		/*
		 * 13.In the method createInt create an Array
		 * - Use the 6 variables that are passed in as num1, num2, num3, num4, num5, and num6 to create the Array
		 * - The Array of int should be called arrayInt
		 * - Make sure to return the last item in arrayInt
		 */
		int num1, num2, num3, num4, num5, num6; 
		num1 = 23;
		num2 = 43;
		num3 = 897;
		num4 = 342;
		num5 = -112;
		num6 = 45;
		int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
		System.out.println("The last number of the array is " + returnedInt + ".");
		
		
		/*
		 * 14. What will the new Array be after the following code runs?
		 */
		int[] arr14 = {-11, 43, 901, 43, -5};

		arr14[arr14.length - 2] = 0;

		for (int n : arr14){
		    System.out.print(n + " ");
		}
		
		/*
		 * 15. Given an Array of words named arr and variables word1, word2, and word3 do the following:
		 * - Create a new Array called newArr that has word1, word2, and word3 as it's elements
		 * - Create another Array that is big enough to hold all of the words from the original Array arr, 
		 * as well as the three new words. You can name this Array to your liking.
		 * -Write a loop to get the words from the original Array arr and put them into your new Array
		 * - Add the words from newArr into the new Array also
		 * - Finally, loop through your new Array and print each element to the console
		 * An idea to get more practice with Arrays: 
		 * You could create an Array for the three new words, and then loop through two Arrays to create your new Array.
		 */
		String[] arr15 = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
		String word1, word2, word3;
		word1 = "Yankees";
		word2 = "Orioles";
		word3 = "Mariners";
		newArray(word1, word2, word3, arr15);
		
		/*
		 * 16. What number will print to the console after the following code runs?
		 */
		int[] arr16 = { -11, 43, 901, 72, -5};
		int[] arr162 = arr16.clone(); //creates exact copy of array elements
		System.out.println(arr162[3]);
		
		/*
		 * 17. Using the initialized Array named arr that uses five (5) integers provided by the user as elements.
		 * - Create a new Array called reverseArr that is the reverse of the original Array arr
		 * - Then write a loop that will iterate through each Array and print each element in the console
		 * - Note: You should print the elements of both Arrays
		 * - Hint: Both Array should have the same amounts of elements and therefore have the same lengths
		 */
		int a,b,c,d,e;
		a = 50;
		b = 25;
		c = 0;
		d = 25;
		e = 50;
		reverseArray(a, b, c, d, e);
		
		
		/*
		 * Multidimensional Array Example:
		 */
		// a 2D Array with 3 rows and 4 columns
		int[][] numbersMD = {{11, 12, 13, 14},
                			 {21, 22, 23, 24},
                			 {31, 32, 33, 34}};
		// print out the elements in the Array (Nest for loop to iterate over the rows (i) and columns (j)
        for (int i = 0; i < numbersMD.length; i++) {
           for (int j = 0; j < numbersMD[i].length; j++) {
              // prints the columns of a row
              System.out.print(numbersMD[i][j] + " ");
           }
           // prints each row on a new line
           System.out.println();
        }
		
		/*
		 * 19. Multidimensional Arrays !!This is an advanced problem!!
		 * In this problem you will create a multidimensional Array of int named arr.
		 * - You are given two integer variables, a and b that are user inputs
		 * - Use these integer values to initially declare your new Array arr, where these integers 
		 * determine the size of both dimensions of the Array
		 * - Then, use these int values to create both an inner and outer Array using some type of loop 
		 * (maybe a for loop) that starts at zero and goes to whatever number values are stored in a and b
		 * - To complete this problem, when you've populated the Arrays (after the nested loops have completed), 
		 * print the last element of the first Array to the console.
		 * Here are a few tips:
		 * - Error Checking: Make sure both numbers entered by the user are greater than two (2). 
		 * If not, print the following message to the console: "Both numbers need to be greater than 2."
		 * - You will need to create two loops to populate the multidimensional Array, storing the index 
		 * of the second loop in the Array positions.
		 * - Extra comments are provided to help you along the way.
		 * Hint: With firstPosition meaning the first position in an Array, and lastPosition meaning the 
		 * last position in an Array, print to the console the value stored in the following position 
		 * in the Array: arr[firstPosition][lastPosition]. For example: arr[0][arr[0].length - 1]
		 */
        int input1, input2;
		input1 = 10;
		input2 = 15;
		multidimensional(input1, input2);
        
		
		/*
		 * 20. How many possible elements can the following Array hold?
		 */
		int[][] arrX2 = new int[10][10];

	}//end of main
	
	//Method 11 -
	static int[] buildArray(int num) {
		int [] numArray = new int[num];
		for (int i = 0; i < num; i++) {
			numArray[i] += i;
		}
		return numArray;
	}
		/*
		 *OpenClass version: numArray[i] = i; instead}\
		 * My Version: If the array had been initialized with non-zero values, += would add i to those values. 
		 * However, since the array is initialized with zeros, the result is the same as Method 2.
		 * OpenClass Version: Directly sets each element to its index value, which is more straightforward and clear.
		 */
	
	//Method 13 -
	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
		int[] arrayInt = {num1, num2, num3, num4, num5, num6};
		return arrayInt[5];
	}
		//OpenClass version: return arrayInt[arrayInt.length - 1];
		//if arrays have a set size, and the method is max size of 6 elements, just listing the last index seems simpler than the math.
	
	//Method 15 -
	static void newArray(String word1, String word2, String word3, String[] arr15) {
		String[] newArr = {word1, word2, word3};
		String[] longArr = new String[(arr15.length + newArr.length)];
		
		for(int i = 0; i < arr15.length; i++) {
			longArr[i] = arr15[i];
		}
		
		for (int j = 0; j < newArr.length; j++) {
			longArr[arr15.length + j] = newArr[j];
		}
		
		for (String word : longArr) {
			System.out.println(word);
		}
		
	}
		/*
		 * OpenClass Version:
		 * 	String[] newArr = { word1, word2, word3 };
			String[] combinedArr = new String[arr.length + newArr.length];
			int counter = 0;
		
			for ( String str : arr ) {
			    combinedArr[counter] = str;
			    counter++;
			}
			
			for ( String str2 : newArr ) {
			    combinedArr[counter] = str2;
			    counter++;
			}
			
			for ( int i = 0; i < combinedArr.length; i++ ) {
			    System.out.println(combinedArr[i]);
			}
		 */
	
	//Method 17 -
	static void reverseArray(int a, int b, int c, int d, int e) {
		int[] arr17 = {a, b, c, d, e};
		int[] reverseArr = new int[arr17.length];
		for (int i = 0; i < arr17.length; i++) {
			reverseArr[i] = arr17[arr17.length -1 -i];
		}
		System.out.println("Original Array");
		for (int number : arr17) {
			System.out.println(number);
		}
		System.out.println("Reverse Array");
		for (int number : reverseArr) {
			System.out.println(number);
		}
	}
		/*
		 * OpenClass version:
		 * 	int j = arr.length;
			int[] reverseArr = new int[j];
			
			for ( int i = 0; i < arr.length; i++ ) { //Simplified way and more logic when thinking of counting down numbers.
			    reverseArr[j-1] = arr[i];
			    j--;
			}
			
			for ( int x : arr ) {
			    System.out.println(x);
			}
			
			for ( int y : reverseArr ) {
			    System.out.println(y);
			}
		 */
	
	
	//Method 19 -
	static void multidimensional(int a, int b) {
		// Check for error -- invalid parameters with an if/else
		if (a <= 2 || b <= 2) {
			System.out.println("Both numbers need to be greater than 2.");
			return;
		} //OpenClass Version: instead of the return above, that have all the below code in an else {} for the if statement.
		
		
	    // If both parameters are > 2
	    // Declare a multidimensional array something like this:
	    //          int[][] arr = new int[param1][param2];
	    int[][] arr19 = new int[a][b];
	    
	    
	
	    // Create two loops to populate your new multidimensional array
	    // Note:  you will need a new index in each for-loop. 
	    //          one index will be used for the first for-loop's index (0 to param1 - 1)
	    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
	    for (int i = 0; i < a; i++) {
	    	for (int j = 0; j < b; j++) {
	    		arr19[i][j] = j;
	    		System.out.print(arr19[i][j] + " "); //added for this view only to show full table
	    	}
	    	System.out.println();
	    }
	    System.out.println("The last element of the first array is: " + arr19[0][arr19[0].length-1]);
	  
	  
	
	    // After you have populated your multidimensional array, 
	    // Print out the value of arr[firstPosition][lastPosition]
	    
	    
	}
	
	
}//end of class
