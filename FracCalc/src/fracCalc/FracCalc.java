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
		String result = "";
		for (int i = 2; i < parsedInput.length; i += 2) {
			int[] operand1 = splitOperand(parsedInput[0]);
			int[] operand2 = splitOperand(parsedInput[i]);
			String operator = parsedInput[i - 1];
			int[] unsimplifiedArray = new int[2];
			if (operand1[1] == 0) {
				return "ERROR: Cannot divide by 0.";
			}
			if (operator.equals("+") || operator.equals("-")) {
				unsimplifiedArray = addSubtract(operand1, operand2, operator);
			} else if (operator.equals("*")) {
				unsimplifiedArray = multiplyDivide(operand1, operand2, operator);
			} else if (operator.equals("/")) {
				if (operand2[1] == 0 || operand2[0] == 0) {
					return "ERROR: Cannot divide by zero.";
				}
				unsimplifiedArray = multiplyDivide(operand1, operand2, operator);
			} else {
				return "ERROR: Invalid operator.";
			}
			result = simplify(unsimplifiedArray);
			parsedInput[0] = result;
		}
		return result;
	}

	// This method accepts an operand and returns the whole number, numerator, and
	// denominator.
	public static int[] splitOperand(String operand) {
		int numerator = 0;
		int denominator = 1;
		int wholeNum = 0;
		if (operand.contains("/") && operand.contains("_")) {
			numerator = (Integer.parseInt(operand.split("_")[1].split("/")[0]));
			denominator = (Integer.parseInt(operand.split("/")[1]));
			wholeNum = (Integer.parseInt(operand.split("_")[0]));
		} else if (operand.contains("/") && !(operand.contains("_"))) {
			numerator = (Integer.parseInt(operand.split("/")[0]));
			denominator = (Integer.parseInt(operand.split("/")[1]));
		} else {
			wholeNum = Integer.parseInt(operand);
		}
		if (wholeNum < 0) {
			numerator *= -1;
		}
		numerator = wholeNum * denominator + numerator;
		int[] operandParts = { numerator, denominator };
		return operandParts;
	}

	// This method returns the sum or difference of the operands.
	public static int[] addSubtract(int[] operand1, int[] operand2, String operator) {
		int newDenominator = operand1[1] * operand2[1];
		int numerator1 = operand1[0] * operand2[1];
		int numerator2 = operand2[0] * operand1[1];
		int newNumerator = numerator1 + numerator2;
		if (operator.equals("-")) {
			newNumerator = numerator1 - numerator2;
		}
		int[] result = { newNumerator, newDenominator };
		return result;
	}

	// This method returns the product or quotient of the operands.
	public static int[] multiplyDivide(int[] operand1, int[] operand2, String operator) {
		if (operator.equals("/")) {
			if (operand2[0] < 0) {
				operand2[1] *= -1;
				operand2[0] *= -1;
			}
			int temp = operand2[0];
			operand2[0] = operand2[1];
			operand2[1] = temp;
		}
		int newNumerator = operand1[0] * operand2[0];
		int newDenominator = operand1[1] * operand2[1];
		int[] result = { newNumerator, newDenominator };
		return result;
	}

	// This method simplifies the result.
	public static String simplify(int[] operand) {
		int wholeNum = operand[0] / operand[1];
		int numerator = operand[0] % operand[1];
		int denominator = operand[1];
		if (wholeNum != 0) {
			numerator = Math.abs(numerator);
		}
		int gcf = GCF(numerator, denominator);
		numerator /= gcf;
		denominator /= gcf;
		if (wholeNum == 0) {
			if (numerator == 0) {
				return "0";
			}
			return numerator + "/" + denominator;
		}
		if (numerator == 0) {
			return "" + wholeNum;
		}
		return wholeNum + "_" + numerator + "/" + denominator;
	}

	// This method accepts two integers and returns the greatest common factor.
	public static int GCF(int num1, int num2) {
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		for (int i = num1; i > 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
