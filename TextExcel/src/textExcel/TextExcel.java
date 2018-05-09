//Alex Soloviev

package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;

public class TextExcel{

	public static void main(String[] args) {
  		Scanner scanner = new Scanner(System.in);
  		System.out.println("Welcome to TextExcel! Type \"quit\" to exit");
  		Spreadsheet spreadsheet = new Spreadsheet();
  		boolean done = true;
  		while (done) {
			System.out.println("Enter a command:");
  			String input = scanner.nextLine();
  			if (input.equals("quit")) {
  				done = false;
 			} else {
 				System.out.println(spreadsheet.processCommand(input));
 			}
 		}
 	}
 }
