package com.promineotech;

public class week3JavaLabs {

	public static void main(String[] args) {
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("\nQuestion 1:");
		int[] arrayQ1 = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2:");
		System.out.println(arrayQ1[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3:");
		System.out.println(arrayQ1[arrayQ1.length -1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4:");
		//System.out.println(arrayQ1[6]);
			/*
			 * Error Message:
			 * java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
			 * at Week3/com.promineotech.week3Application.main(week3Application.java:24)
			 */
		
		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("\nQuestion 5:");
		//System.out.println(arrayQ1[-1]);
			/*
			 * Error Message:
			 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
			 * at Week3/com.promineotech.week3Application.main(week3Application.java:34)
			 */

		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6:");
		for (int i = 0; i < arrayQ1.length; i++) {
			System.out.println(arrayQ1[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7:");
		for (int arrayQ1E : arrayQ1) {
			System.out.println(arrayQ1E);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("\nQuestion 8:");
		double sum = 0;
		for (int arrayQ1E : arrayQ1) {
			sum += arrayQ1E;
		}
		System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("\nQuestion 9:");
		double average = sum / arrayQ1.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("\nQuestion 10:");
		for (int arrayQ1E : arrayQ1) {
			if (arrayQ1E % 2 == 1) {
				System.out.println(arrayQ1E);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		System.out.println("\nQuestion 11:");
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		for (String name : names) {
			System.out.println(name);
		}
		
		// 12. Calculate the sum of all the letters in the new array
		System.out.println("\nQuestion 12:");
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.println("\nQuestion 13:");
		
		greeting("John");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println("\nQuestion 14:");
		String result = greeting2("Bob");
		System.out.println(result);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		- 13 is more simplified. 14 is more complex. deliver same results.
		//		c. How are they different?
		//		- 14 requires to declare another variable to print the name vs. in 13 just listing the print command in the method accomplish the same result.
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("\nQuestion 15:");
		System.out.println(isStringLongerThanNumber("World", 4));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("\nQuestion 16:");
		System.out.println(doesArrayContainString(names, "Sam"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("\nQuestion 17:");
		System.out.println(smallestNumberInArray(arrayQ1));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("\nQuestion 18:");
		double[] doubles = {15.3, 9.15, 64.8};
		System.out.println(calculateAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("\nQuestion 19:");
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("\nQuestion 20:");
		System.out.println(areThereMoreEvenWordCharacters(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("\nQuestion 21:");
		System.out.println(isPalindrome("madam"));
			// method doesn't have work around for spaces and other characters. Used this example A man, a plan, a canal - Panama
	} //end of main
	
	// Method 13:
	public static void greeting(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greeting2(String name) {
		return "Hey, " + name + "!";
	}
		
	// Method 15:
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}
		
	// Method 16:
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
		
	// Method 17:
	public static int smallestNumberInArray(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
		
	// Method 18:
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum+= number;
		}
		return sum / array.length;
	}
		
	// Method 19:
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
		
	// Method 20:
	public static boolean areThereMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if(string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
		
	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() /2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

} //end of class