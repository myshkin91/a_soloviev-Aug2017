package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner fractionInput = new Scanner(System.in);
    	System.out.println("Give me an equation");
    	while(true) {
    			String userInput = fractionInput.nextLine();
    			if(userInput.equals("quit")) {
    				break;
    			}
    			System.out.println(produceAnswer(userInput));
    			}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {
    
        // TODO: Implement this function to produce the solution to the input
        String [] inputArray = input.split(" ");
        int [] operand1 = splitOperand(inputArray[0]);
        int [] operand2 = splitOperand(inputArray[2]);
        String result = "";
        String operator = inputArray[1];
        
        if(operator.equals("+") || operator.equals("-")){
        		result = addSubtract(operand1, operand2, operator);
        		}else if(operator.equals("*") || operator.equals("/")){
        		result = multiplyDivide(operand1, operand2, operator);
        		}return result;
    }		
        public static int [] splitOperand(String operand) {
        	int numerator = 0;
            int denominator = 1;
           		int wholeNumber = 0;
                if(operand.contains("/") && operand.contains("_")) {
                	numerator = (Integer.parseInt(operand.split("_")[1].split("/")[0]));
                	denominator = (Integer.parseInt(operand.split("/")[1]));
                	wholeNumber = (Integer.parseInt(operand.split("_")[0]));
                }else if(operand.contains("/") && !(operand.contains("_"))){
                	numerator = (Integer.parseInt(operand.split("/")[0]));
                	denominator = (Integer.parseInt(operand.split("/")[1]));
                }else{
                	wholeNumber = Integer.parseInt(operand);
               }
               
               if(wholeNumber < 0){
               numerator *= -1;
               }
                int[] operandParts = {wholeNumber, numerator, denominator};
          return operandParts;
      }
        public static String addSubtract (int []operand1, int [] operand2, String operator) {
        	int newDenominator = operand1[2] * operand2[2];
        	int numerator1 = operand1[1] * operand2[2];
        	int numerator2 = operand2[1] * operand1[2];
        	int newNumerator = numerator1 + numerator2;
        	int newWholeNumber = operand1[0] + operand2[0];
        	
        	if(operator.equals("-")) {
        		newNumerator = numerator1 - numerator2;
        		newWholeNumber = operand1[0] - operand2[0];
        	}
        	if (newWholeNumber != 0 && newNumerator<0) {
        		newNumerator *= -1;
        	}
        	return newWholeNumber + "_" + newNumerator + "/" + newDenominator;
        	}
        
        public static String multiplyDivide (int [] operand1, int [] operand2, String operator) {
        int numerator1 = operand1[0] * operand1[2] + operand1[1];
        int numerator2 = operand2[0] * operand2[2] + operand2[1];
        		if(operator.equals("/")) {
        			int temp = numerator2;
        			numerator2 = operand2[2];
        			operand2[2] = temp;
        		}
        		int newNumerator = numerator1 * numerator2;
        		int newDenominator = operand1[2] * operand2[2];
        		return newNumerator + "/" + newDenominator;
        		}
        
        }
        
           

     //TODO: Fill in the space below with any helper methods that you think you will need
    

