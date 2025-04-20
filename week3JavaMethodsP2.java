package com.promineotech;

public class week3JavaMethodsP2 {

	public static void main(String[] args) {
		/*
		 * 11. Complete the method that accepts five integer values stored in the variables a, b, c, d, e.
		 * - In the method, you will create an Array of int that stores the value of the five parameters
		 * - The method should return the Array
		 */
		int a,b,c,d,e;
		a = 5;
		b = 4;
		c = 3;
		d = 2;
		e = 1;
		int[] mainArray = createArray(a, b, c, d, e);
		System.out.println("The third number in your array is: " + mainArray[2]);
		
		/*
		 * 13. Complete the method called sumOfDigits that takes an integer variable called digits. 
		 * Then return the sum of all the digits in digits. For example, 245 would be 2 + 4 + 5 = 11.
		 */
		int digits = 12;
		int sumAll = sumOfDigits(digits);
		System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
		
		//14. What will be the value of the variable addItUp after the following code runs?
		int addItUp = followTheMath(10, 5, 8, 11);
		System.out.println(addItUp);
		
		/*
		 * 15. Complete the method called passwordChecker that accepts the String stored in variable password.
		 * - The method should check to make sure that password is at least 8 characters in length and contains 
		 * one of 4 special symbols, !, $, %, or &
		 * - The method should return true or false.
		 */
		String password = "password%";
        boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
		    System.out.println(password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}
		
		//16. What will the value be for the variable iCanRetire after the code runs?
		String iCanRetire = readyForTheBeach(64);
	    System.out.println(iCanRetire);
	    
	    /*
	     * 17. Given a method call avgNameLength that takes in an Array of String stored in names, write a program that will traverse the Array.
	     * - The names Array will hold 5 names that are entered by the user
	     * - The method avgNameLength will traverse the Array and find the average length of all the names that are part of names
	     * - Return the average length of all the names
	     */
	    String[] names;
		names = new String[5];
		names[0] = "Jose";
		names[1] = "James";
		names[2] = "Roberto";
		names[3] = "Theodore";
		names[4] = "Fred";
		
		int avgLength = avgNameLength(names);
		System.out.println("The average name length is " + avgLength + ".");
		
		/*
		 * 19. Inside of the public class, write a static method called rectanglePerimeter :
		 * - The method should accept two int variables named length and width
		 * - In the body of the method write a program that will calculate the perimeter of the rectangle
		 * - The method should return an integer value representing the perimeter of the rectangle
		 * - Note: Don't forget to include the opening and closing curly braces for the method
		 */
		int length = 4;
		int width = 4;
		int perimeter = rectanglePerimeter(length, width);
		System.out.println("The rectangle has a perimeter of " + perimeter + ".");
		
		//20. Which variable should be returned for the method to be correct?
		System.out.println(whatsReturned(9, "Hi, There", false, 4.99, 'T'));

	}//End of Main
	
	// Method 11 - 
	static int[] createArray(int a, int b, int c, int d, int e) {
		int [] array = {a, b, c, d, e};
		return array;
	}
	
	//Method 13 -
	static int sumOfDigits(int digits) {
		int totalSum = 0;
		while (digits != 0) {
			totalSum += digits % 10;
			digits /= 10;
		}
		return totalSum;
		/*
		 * OpenClass version:
		 * while(digits > 0) {
		 *	 result += digits % 10;
		 * 	digits /= 10;
		 * }
		 * return result;
		 */
	}
	
	//Method 14 (Provided) - 
	static int followTheMath(int num1, int num2, int num3, int num4){
        int total = 0;
        if (num1 < num4){
            total += num2;
        }
        if (num2 == num3){
            total += num4;
        } else {
            total += num1;
        }
        total += num3;
        return num3;
    }
	
	//Method 15 -
	static boolean passwordChecker(String password) {
		if (password.length() < 8) {
			return false;
		}
		
		char[] specialSymbols = {'!', '$', '%', '&'};
		for (int i = 0; i < password.length(); i++) {
			char currentSymbol = password.charAt(i);
			for (char symbol : specialSymbols) {
				if (currentSymbol == symbol) {
					return true;
				}
			}
		}
		return false;
	}
	/*
	 * OpenClass version:
	 * if (password.length() >= 8 && 
		    (password.contains("!") ||
		     password.contains("$") ||
		     password.contains("%") || 
		     password.contains("&"))) {
		         return true;
		     }
		return false;
	 */
	
	//Method 16 (Provided) -
	static String readyForTheBeach(int age){
	    if (age < 30){
	        return "Only if you built Facebook or Google";
	    }
	    if (age < 50){
	        return "Perhaps if you lived a frugal life and worked a couple of jobs at a time.";
	    }
	    if (age < 65){
	        return "You are getting closer...";
	    } else {
	        return "You can call it quits!";
	    }
	}
	
	//Method 17 - 
	static int avgNameLength(String[] names) {
		int totalLength = 0;
		for (String name : names) {
			totalLength += name.length();
		}
		return totalLength/ names.length;
	}
	
	//Method 19 -
	static int rectanglePerimeter(int length, int width) {
		int result = (length * 2) + (width *2);
		return result;
	}
	/*
	 * OpenClass Version:
	 * return 2 * (length + width);
	 */
	
	//Method 20 (Provided) - 
	static boolean whatsReturned(int num1, String words, boolean TF, double price, char letter){
        return TF;
    }
	
	
}//End of Class
