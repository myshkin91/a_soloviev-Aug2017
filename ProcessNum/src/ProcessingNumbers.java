//Alex Soloviev
//October 10, 2017
//This project will accept a string of numbers as user input and prints the smallest and largest numbers, along with the sum of all the even numbers and the largest even number typed.


import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
	Scanner console = new Scanner (System.in);
	int sum = 0;
	int max = 0;
	int min = 0;
	int firstTime = 0;
	int largeEven = 0;
	boolean done = false;
	System.out.println("Welcome to ProcessingNumbers!");
	while(!done) {
		System.out.print("Enter a number: ");
		int num = console.nextInt();
		if (firstTime == 0) {
			max = num;
			min = num;
			firstTime ++;
		}
		if(num % 2 == 0) {
			sum += num;
		}
		if(num>max) {
			max = num;
		}
		if (num< min) {
			min = num;
		}
		if(num%2==0 && num>largeEven) {
			largeEven = num;
		}
		System.out.print("Are those all the numbers? (Type yes to end): ");
		String userInput = console.next();
		if(userInput.equals("yes")) {
			done = true;
		}
	}
System.out.println(" ");	
System.out.println("The smallest number is " + min + " and the largest number is " +max);
System.out.println("The sum of all the even numbers is " +sum);
System.out.println("The largest even number is " + largeEven);
	}

}
 

