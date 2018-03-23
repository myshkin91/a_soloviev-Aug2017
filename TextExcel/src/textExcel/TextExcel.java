package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;

public class TextExcel{

	public static Spreadsheet sheet1 = new Spreadsheet();
	public static void main(String[] args)
	{
		boolean done = false;
		Spreadsheet spreadsheet = new Spreadsheet();
		Scanner userInput = new Scanner(System.in);
		while(!done) {
			String nextCommand = userInput.nextLine();
			if(nextCommand.equals("quit")) {
				done = true;
			}else {
				System.out.println(sheet1.processCommand(nextCommand));
			}
		}
	}
}
