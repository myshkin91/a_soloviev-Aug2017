package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class TextExcel{

	public static void main(String[] args)
	{
		boolean done = false;
		Scanner userInput = new Scanner(System.in);
		while(!done) {
			if(userInput.nextLine().equals("quit")) {
				done = true;
			}
		}
	}
}
