//Alex Soloviev
//12-19-17
//This class accepts user input as a fractional expression and prints the simplified fractional form.

package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean done = false;
		while (!done == true) {
			System.out.println("Insert a fractional expression.");
			String equation = userInput.nextLine();
			System.out.println("\n" + produceAnswer(equation));
			System.out.println("\n Would you like to enter another expression? (type \"quit\" to end.)");
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
    	//If the input has an even number of parts, then the input is not in the proper format
    		if(parsedInput.length % 2 == 0 || parsedInput.length == 1) {
    				return "ERROR: Invalid expression. Please try again.";
    	}
    	String resultString = "";
        
    	Fraction operand1 = new Fraction(parsedInput[0]); 
    	Fraction operand2;
    	Fraction result;
    	
    	for(int i = 2; i < parsedInput.length; i += 2) {
    			operand2 = new Fraction(parsedInput[i]);
	        String operator = parsedInput[i-1];
	        
	        if(operand1.isDenominatorZero() || operand2.isDenominatorZero()) {
	        		return "ERROR: Cannot divide by 0.";
	        }
	        if(operator.equals("+")){
	        		result = operand1.add(operand2);
	        }else if(operator.equals("-")) {
	        		operand2.changeSign();
	        		result = operand1.add(operand2);
	        }else if(operator.equals("*")) {
	        		result = operand1.multiply(operand2);
	        }else if(operator.equals("/")){  	
	        		operand2.reciprocate();
	        		if(operand2.isDenominatorZero()) {
	        			return "ERROR: Cannot divide by 0.";
	        		}
	        		result = operand1.multiply(operand2);
	        }else {
	        		return "ERROR: Invalid operator.";
	        }
	        	operand1 = new Fraction(result);
	        result.simplify();
	        resultString = result.toString();
    	}
		return resultString;
    }
}