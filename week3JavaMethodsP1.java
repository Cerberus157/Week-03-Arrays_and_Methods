package com.promineotech;

public class week3JavaMethodsP1 {

	public static void main(String[] args) {
		// Copy of OpenClass code
		
		/*1. returnSumMethod -- 
		 * Create a static method named returnSum that accepts 3 int variables named num1, num2, and num3
		 * - The method should return the sum of the three variables
		 * - Note: Don't forget to include the opening and closing curly braces for the method
		 */
		int num1, num2, num3;
		num1 = 1;
		num2 = 1;
		num3 = 1;
		System.out.println(returnSum(num1, num2, num3));
		
		/*
		 * 2. What is wrong with the code below?
		 * - "Type mismatch: cannot convert from boolean to double" in the method. 
		 * Its written to return a double but the code says to return boolean values.
		 */
		System.out.println(isDivisibleBy2(5));
		
		/*
		 * 3. Complete the method that takes a String named userWord and an integer value named numTimes.
		 * - In that method you will take the value stored in numTimes and create a new String that repeats 
		 * userWord that many times
		 * - Then return the new String value from the method
		 */
		int numTimes;
		String userWord;
		userWord = "Stop";
		numTimes = 3;
		System.out.println(repeatWord(userWord,numTimes));
		
		/*
		 * 4. What will print to the console when the code below runs?
		 * Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * - Cannot divide by zero.
		 * - In Java, dividing an integer by zero will throw an exception. In particular, an ArithmeticException will be thrown.
		 */
		// System.out.println(divideNums(5, 0));
		
		/*
		 * 5. Complete the method called fizzBuzz that accepts the integer value stored in num1.
		 * - If the value is divisible by 3, print "Fizz" to the console
		 * - If the value is divisible by 5 print "Buzz" to the console
		 * - If the value is divisible by both 3 and 5 print "FizzBuzz" to the console
		 * - If the number is not divisible by either 3 or 5, print "Hello world!" to the console
		 * Use System.out.println() in all of your print statements
		 */
		int num11;
		num11 = 35;
		fizzBuzz(num11);
		
		/*
		 * 6. What will print to the console after the code below runs?
		 */
		int a = 10, b = 10, c = 10;
        System.out.println(returnSum1(a,b,c));
        /*
         * Notice that the method returnSum() returns x, not answer. 
         * x is a parameter name, and the variable a is passed into returnSum() as the first argument 
         * so it corresponds to the first parameter, which is x.
         */
        
        /*
         * 7. Fix the error in this method. It is supposed to return the sum of the three integers for 
         * a total of 30 but it only returns 10. Fix this bug with only changing one line of code.
         */
        int a1 = 10, b1 = 10, c1 = 10;
        System.out.println(returnSum2(a1,b1,c1));
        
        /*
         * 9. Complete the method called orderTotal that takes in 4 doubles stored in product1, product2, product3, 
         * and taxRate. The method will sum the values of product1, product2, and product3. 
         * Then it will figure out the applicable sales tax using the variable taxRate. 
         * Finally, the method should return a double that is the total order price with tax.
         */
        double product1, product2, product3, taxRate;
		product1 = 19.99;
		product2 = 22.00;
		product3 = 4.55;
		taxRate = .07;
		System.out.println("Your order total is: $" + String.format("%,.2f", orderTotal(product1, product2, product3, taxRate)));
        
		
	}//End of main
	
	//METHODS
	
	//1. Method -
	static int returnSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	//2. Method (Provided) -
	static boolean isDivisibleBy2(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//3. Method -
	static String repeatWord(String userWord, int numTimes) {
		String repeatedWord = "";
		for (int i = 0; i < numTimes; i++) {
			repeatedWord += userWord;
		}
		return repeatedWord;
	}
	
	//4. Method (Provided) -
	static double divideNums(int a, int b){
        return a/b;
    }
	
	//5. Method -
	/*
	 * The order ensures that the most specific condition (divisible by both 3 and 5) is checked first,
	 * followed by the more general conditions (divisible by 3 or 5),
	 * and finally the default case. This way, each number is correctly categorized and the appropriate message is printed.
	 */
	static void fizzBuzz (int num11) {
		/*/
		 * This condition must come first because if num1 is divisible by both 3 and 5, it would also be divisible by 3 and 5 individually. 
		 * If we checked for divisible by 3 or 5 first, we would never reach this combined condition.
		 */
		if (num11 % 3 == 0 && num11 % 5 == 0) {
			System.out.println("FizzBuzz");
			/*/
			 * This comes after the combined condition to ensure that numbers divisible by both 3 and 5 don't just print "Fizz".
			 */
		} else if (num11 % 3 == 0) {
			System.out.println("Fizz");
			/*
			 * This comes after the combined condition and the divisible by 3 condition to ensure that numbers
			 * divisible by both 3 and 5 don't just print "Buzz".
			 */
		} else if (num11 % 5 == 0) {
			System.out.println("Buzz");
			/*
			 * This handles any number that is not divisible by 3 or 5.
			 */
		} else {
			System.out.println("Hello World!");
		}
	}
	
	//6. Method (Provided) -
	static int returnSum1(int x, int y, int z){
        int answer = x + y + z;
        return x;
    }
	
	//7. Method (Provided to fix) - 
	static int returnSum2(int x, int y, int z){
        int answer = x + y + z;
        return answer;
    }

	//9. Method -
	static double orderTotal(double product1, double product2, double product3, double taxRate) {
		double subTotal = product1 + product2 + product3;
		double salesTax = subTotal * taxRate;
		double totalOrderPrice = subTotal + salesTax;
		return totalOrderPrice; //OpenClass used return subTotal + salesTax; instead allowing elimination of the third variable totalOrderPrice
	} 
	
}//End of class
