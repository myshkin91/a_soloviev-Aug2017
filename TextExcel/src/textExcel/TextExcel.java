package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class TextExcel{

	public static void main(String[] args)
	{
	    // Add your command loop here
		boolean done = false;
		Scanner userInput = new Scanner(System.in);
		while(!done) {
			if(userInput.nextLine().equals("quit")) {
				done = true;
			}
		}
	}
}
