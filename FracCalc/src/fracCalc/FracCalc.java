package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner fractionInput = new Scanner(System.in);
    	System.out.println("Give me an equation");
    	do {
    			String userInput = fractionInput.nextLine();
    			System.out.println(produceAnswer(userInput));}
    	while(!(fractionInput.nextLine().equals("quit")));
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
 
        String wholeNumber1 = (inputArray[0].split("_")[0]);
        String wholeNumber2 = (inputArray[2].split("_")[0]);
        String numerator1 = (inputArray[0].split("_")[1].split("/")[0]);
        String numerator2 = (inputArray[2].split("_")[1].split("/")[0]);
        String denominator1 = (inputArray[0].split("/")[1]);
        String denominator2 = (inputArray[2].split("/")[1]);
        return "whole:" + wholeNumber2 + " numerator:" + numerator2 + " denominator:" + denominator2;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
