//Alex Soloviev

package textExcel;

public class Spreadsheet implements Grid {

	private Cell[][] thisSheet;

	//constructor
	public Spreadsheet() {
		thisSheet = new Cell[getRows()][getCols()];
		clear();
	}

	public String processCommand(String command){
		
		if (command.contains("=")) {
			String [] parts = command.split(" ", 3); //splits on spaces and creates an array with a max of 3 elements
			assignValue(parts[0],parts[2]);
			return getGridText();
		}
		String command1 = command.toLowerCase();  //sets to lower case
		if(command1.equals("clear")) {       //clears entire spreadsheet
			clear();
			return getGridText();
		}else if(command1.startsWith("clear")){     //clears specific cell
			SpreadsheetLocation loc = new SpreadsheetLocation(command.split(" ")[1]);
			thisSheet[loc.getRow()][loc.getCol()] = new EmptyCell();
			return getGridText();
		}else if(command.length() == 2 || command.length() == 3){
			SpreadsheetLocation loc = new SpreadsheetLocation(command);
			return thisSheet[loc.getRow()][loc.getCol()].fullCellText();
		}
		return "";
	}

	public int getRows() {
		return 20;
	}

	public int getCols() {
		return 12;
	}

	//returns cell location
	public Cell getCell(Location loc) {
		return thisSheet[loc.getRow()][loc.getCol()];
	}

	public String getGridText() {
		String output = "   ";

		for (int i = 0; i < thisSheet[0].length; i++) {
			output = output + "|" + ((char) (65 + i)) + "         ";
		}
		output += "|\n";
		for (int r = 0; r < thisSheet.length; r++) {
			String rowNumber = "" + (r + 1);
			while (rowNumber.length() < 3) {
				rowNumber += " ";
			}
			output += rowNumber;
			for (int c = 0; c < thisSheet[0].length; c++) {
				output = output + "|" + thisSheet[r][c].abbreviatedCellText();
			}
			output += "|";
			output += "\n";
		}
		return output;
	}

	//cell is the cell location and input is the assignment to the cell
	private void assignValue(String cell, String input) {
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
		if (input.substring(0, 1).equals("\"")) {
			thisSheet[loc.getRow()][loc.getCol()] = new TextCell(input); //TextCell
		} else if (input.substring(input.length() - 1).equals("%")) {
			thisSheet[loc.getRow()][loc.getCol()] = new PercentCell(input); //PercentCell
		} else if (input.charAt(0) == ('(')) {
			thisSheet[loc.getRow()][loc.getCol()] = new FormulaCell(input, thisSheet); //FormulaCell
		} else {
			thisSheet[loc.getRow()][loc.getCol()] = new ValueCell(input); //ValueCell
		}
	}

	//clears the entire spreadsheet
	private void clear() {
		for (int r = 0; r < thisSheet[0].length; r++) {
			for (int c = 0; c < thisSheet.length; c++) {
				thisSheet[c][r] = new EmptyCell();
			}
		}
	}
}