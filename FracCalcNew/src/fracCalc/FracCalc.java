//Alex Soloviev
//11-8-17
//This class accepts user input as a fractional equation and returns the result as a simplified fraction.

package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean done = false;
		while (!done == true) {
			System.out.println("Give me an equation.");
			String equation = userInput.nextLine();
			System.out.println("\n" + produceAnswer(equation));
			System.out.println("\n Would you like to enter another equation? (type \"quit\" to end.)");
			String quitting = userInput.nextLine();
			if (quitting.equals("quit")) {
				done = true;
			}
		}
	} 

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program, this
	// will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		String[] parsedInput = input.split(" ");
		if (parsedInput.length % 2 == 0 || parsedInput.length == 1) {
			return "ERROR: Invalid equation. Please try again.";
		}
		String resultString = "";
		for (int i = 2; i < parsedInput.length; i += 2) {
			Fraction operand1 = new Fraction(parsedInput[0]);
			Fraction operand2 = new Fraction(parsedInput[i]);
			String operator = parsedInput[i-1];
			resultString = operand2.toString();
		}
		return resultString;
	}
}
