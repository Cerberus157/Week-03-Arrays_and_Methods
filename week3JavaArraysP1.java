package com.promineotech;

public class week3JavaArraysP1 {

	public static void main(String[] args) {
		
		/*
		 * 1. Using the given Array of 5 integers named numbers and the given variable sum, print out the sum of all the elements in the Array.
		 * - Write a for loop that will iterate over the numbers Array and add each element of the Array to sum
		 * - Use System.out.println() to print the value of sum to the console
		 */
		int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int number : numbers) {
        	sum += number;
        }
        System.out.println(sum);
	        /*
	         * OpenClass version:
	         * for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	
	        System.out.println(sum);
	         */
        
        /*
         * 3. Given an Array of int called arr and an integer variable x, do the following:
         * Part 1:
         * - Loop through the Array arr to print the values of the Array, using System.out.println();
         * - Then add the value in x to each element in arr (after using System.out.println();)
         * Part 2:
         * - Loop through the Array arr a second time, use System.out.println(); to print out each element to the console
         * Note:
         * - Remember that you added x to each value so now the elements in arr have a different value
         * Do not alter the provided System.out.println(); statements
         */
        int x;
		int[] arr = { 5, 10, 44, -4, 10 };
		x = 10;
		addX(arr, x);
        
		//4. Which full name will print to the console when the code runs?
		String[] firstNames = {"Mike", "Joe", "Brian", "Nick", "Carl"};
        String [] lastNames = {"Jones", "Thompson", "Walton", "Bird", "Jordan"};
        System.out.println(firstNames[1] + " " + lastNames[3]);
        
        /*
         * 5. Given an Array of int named arr5, replace the first and last value stored in the Array.
         * - Use the given integer values a and b provided by the user to replace the first and last elements, respectively
         * - Loop through the Array and print each element in the Array to the console
         */
        int a,b;
		a = 1;
		b = 1;
		int[] arr5 = { 3, 7, 0, 4, -6, 10, 55 };
		changeTwo(a, b, arr5);
		
		//6.What number will print to the console when this code runs?
		int[] arr6 = new int[5];
        arr6[3] = 12;
        System.out.println(arr6.length);
        
        /*
         * 7. Given the variable userWord, create a new Array that is made up of the characters of the word stored in the variable.
         * - Initialize a new Array, name it whatever you want
         * - Make sure to use the correct Java data type for this new Array (data type char)
         * - Add each letter of userWord to the Array as elements
         * - Once you have populated the Array, print to the console each element of the Array
         * Hint: Use the charAt() method
         */
        String word;
		word = "Hello";
		charArray(word);
        

		/*
		 * 9. In the static method wordToArray take the value of userWord and turn it into an Array of char taking each letter 
		 * in userWord and storing it into that Array.
		 * - Name your new Array variable charArray
		 * - return the Array variable in the method body
		 */
		String userWord;;
		userWord = "Hello!";
		System.out.println("Your array is: ");
		//System.out.println(Arrays.toString(wordToArray(userWord)));
		
		//10. What will print to the console when the code below runs?
		String[] passwords = new String[3];

		passwords[0] = "421499!";
		passwords[1] = "cVTT1290?";
		passwords[2] = "11?1!cV32A";

		for ( String str : passwords ){
		    if (str.length() > 7 && str.contains("?")){
		        System.out.println(str);
		    }
		}
		
		
	}// end of main
	
	//Method 3 - 
	static void addX(int[] arr, int x) {
		System.out.println("**Original**");
		// WRITE YOUR CODE HERE  FOR PART 1
		for (int number : arr) {
			System.out.println(number);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] += x;
		}
		System.out.println("**New Array**");
		// WRITE YOUR CODE HERE FOR PART 2 
		for (int number : arr) {
			System.out.println(number);
		}
	}
	/*
	 * OpenClass Version: (notes: Part 1 is simlified to use only 1 for loop.
	 * // WRITE YOUR CODE HERE  FOR PART 1
		for ( int i = 0; i < arr.length; i++ ) {
		    System.out.println(arr[i]);
		    arr[i] += x;
		}
		// WRITE YOUR CODE HERE FOR PART 2 

		for ( int j = 0; j < arr.length; j++ ) {
		    System.out.println(arr[j]);
		}
	 */
	
	//Method 5 - 
	static void changeTwo(int a, int b, int[] arr5) {
		arr5[0] = a;
	    arr5[arr5.length -1] = b;
	    for (int number : arr5) {
	    	System.out.println(number);
	    }
	}
	
	//Method 7 -
	static void charArray(String userWord) {
		char[] allChars = new char[userWord.length()];
		for (int i = 0; i < userWord.length(); i++) {
			allChars[i] = userWord.charAt(i);
			System.out.println(allChars[i]);
		}
	}
		
	//Method 9 - 
	static char[] wordToArray(String userWord) {
		char[] charArray = new char[userWord.length()];
		for (int i = 0; i < userWord.length(); i++) {
			charArray[i] = userWord.charAt(i);
		}
		return charArray;
	}
	
}// end of class
