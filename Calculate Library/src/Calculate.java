/*Alex Soloviev
*September 5, 2017
* This is our home grown library that will contain various mathematical methods
*/
public class Calculate {
	/* This method takes an integer and returns its square
	 * 
	 */
	
	public static int square(int operand) {
		return operand * operand;
	}
	//This method takes an integer and returns its cube.
	public static int cube (int operand) {
		return operand * operand * operand;
	}
	//This method takes two doubles and returns their average
	public static double average(double operand1, double operand2) {
		return (operand1 + operand2) / 2;
	}
	//This method takes three doubles and returns their average
	public static double average(double operand1, double operand2, double operand3) {
		return (operand1 + operand2 + operand3) / 3;
	}
	//This method takes a double and returns a double, converting radians to degrees
	public static double toDegrees(double radians) {
		return (radians * 180) / 3.14159;
	}
	//This method takes a double and returns a double, converting degrees to radians
	public static double toRadians(double degrees) {
		return (degrees * 3.14159) / 180;
	}
	//This method provides coefficients of a quadratic equation in standard form and returns the value of the discriminant.
	public static double discriminant(double operand1, double operand2, double operand3) {
		return (operand2 * operand2) - (4 * operand1 * operand3);
	}
	//This method takes the integer parts of a mixed number and returns an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return ((whole * denominator) + numerator) + "/" + denominator;
	}
	//This method takes the integer parts of an improper fraction and returns a mixed number 
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator / denominator) + " " + (numerator % denominator) + "/" + (denominator);
	}
	//This method accepts a four integers and a String and then returns a String. A call to foil converts a binomial multiplication of the form (ax + b)(cx + d) into a quadratic equation of the form ax^2 + bx + c. 
	public static String foil (int a, int b, int c, int d, String variableLetter) {
		return (a * c) + variableLetter + "^2 + " + ((a * d) + (b * c)) + variableLetter + " + " + (b * d);
	}
	//This method accepts two integers and returns a boolean. A call to isDivisibleBy determines whether or not one integer is evenly divisible by another.
	public static boolean isDivisibleBy (int dividend, int divisor) {
		return (dividend % divisor == 0) ;
	}
	//This method accepts a double and returns a double. A call to absValue returns the absolute value of the number passed.
	public static double absValue (double operand) {
		if (operand >= 0) {
			double absValue = operand;
			return absValue;
		} else {
			double absValue = (-1 * operand);
			return absValue;
		}
	}
	//This method accepts two doubles and returns a double. A call to max returns the larger of the values passed.
	public static double max (double operand1, double operand2) {
		if (operand1 > operand2) {
			double max = operand1;
			return max;
		} else {
			double max = operand2;
			return max;
		}
	}
	//This method accepts three doubles and returns a double. A call to max returns the larger of the values passed.
	public static double max (double A, double B, double C) {
		if (A >= B) {
		}
		if (A >= C) {
			double max = A;
			return max;
		} else if (B >= C) {
			double max = B;
			return max;
		} else {
			double max = C;
			return max;
		}
		
	}
	//This method accepts two integers and returns an integer. A call to min returns the smaller of the values passed.
	public static int min ( int A, int B) {
		if (A<=B) {
			int min = A;
			return min;
		} else {
			int min = B;
			return min;
		}
	}
	//A call to round2 rounds a double correctly to 2 decimal places and returns a double.
	public static double round2 (double operand) {
		operand = (operand * 100);
		double x = operand;
		int a = (int) x;
		return (a / 100.00);
	}
	//This method accepts a double and an integer and returns a double. A call to exponent raises a value to a positive integer power.
	public static double exponent (double operand1, int exponent) {
		double answer = 1.00;
		for (int i = 0; i < exponent; i++) {
			answer = answer * operand1;
		}
		return answer;
	}
	//public static int factorial (int operand) {
		//while (operand > 0) {
			//System.out.println
		//}
	//}

	}

