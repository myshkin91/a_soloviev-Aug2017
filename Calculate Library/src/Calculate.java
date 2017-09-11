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
	//public static boolean isDivisibleBy (int )
}

