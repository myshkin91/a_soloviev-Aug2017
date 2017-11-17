/*package fracCalc;
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
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String [] inputArray = input.split(" ");
        int [] operand1 = splitOperand(inputArray[0]);
        int [] operand2 = splitOperand(inputArray[2]);
        String operator = inputArray[1];
        //String result;
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
           /*     String numerator2 = "0";
                String denominator2 = "1";
           	 	String wholeNumber2 = "0";*/
              /*  if(inputArray[2].contains("/") && inputArray[2].contains("_")) {
                	numerator2 = (inputArray[2].split("_")[1].split("/")[0]);
                	denominator2 = (inputArray[2].split("/")[1]);
                	wholeNumber2 = (inputArray[2].split("_")[0]);
                }else if(inputArray[2].contains("/") && !(inputArray[2].contains("_"))){
                	numerator2 = (inputArray[2].split("/")[0]);
                	denominator2 = (inputArray[2].split("/")[1]);
                }else{
                	wholeNumber2 = inputArray[2];
                }
        return "whole:" + wholeNumber2 + " numerator:" + numerator2 + " denominator:" + denominator2;
    }*/

    // TODO: Fill in the space below with any helper methods that you think you will need
    
//}
