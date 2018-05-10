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
			String [] parts = command.split(" ", 3);  //splits on spaces and creates an array with a max of 3 elements
			assignment(parts[0],parts[2]);           //calls assignment method and passes in the cell location and the input 
			return getGridText();
		}
		String command1 = command.toLowerCase();  
		if(command1.equals("clear")) {                //clears entire spreadsheet
			clear();
			return getGridText();
		}else
		if(command1.startsWith("clear")){       //clears specific cell
			SpreadsheetLocation loc = new SpreadsheetLocation(command.split(" ")[1]);
			thisSheet[loc.getRow()][loc.getCol()] = new EmptyCell();
			return getGridText();
		}else 
		if(command.length() == 2 || command.length() == 3){       //inspects cell, such as a1 or a10. Returns the value in the cell
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

	public Cell getCell(Location loc) {
		return thisSheet[loc.getRow()][loc.getCol()];
	}

	public String getGridText() {
		String output = "   ";

		int i = 0;
		while(i < thisSheet[0].length) {
			output = output + "|" + ((char) (65 + i)) + "         ";
			i++;
		}
		output += "|\n";
		
		int r = 0;
		while(r < thisSheet.length) {
			String rowNumber = "" + (r + 1);
			while (rowNumber.length() < 3) {
				rowNumber += " ";
			}
			output += rowNumber;
			
			int c = 0;
			while(c < thisSheet[0].length) {
				output = output + "|" + thisSheet[r][c].abbreviatedCellText();
				c++;
			}
			output += "|\n";
			r++;
		}
		return output;
	}

	//cell is the cell location, such as a1, and input is the assignment to the cell. This method assigns the input to a particular cell type. 
	private void assignment(String cell, String input) {
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
		if (input.substring(0, 1).equals("\"")) {
			thisSheet[loc.getRow()][loc.getCol()] = new TextCell(input); //assignment to TextCell
		} else 
		if (input.charAt(0) == ('(')) {
			thisSheet[loc.getRow()][loc.getCol()] = new FormulaCell(input, thisSheet); //assignment to FormulaCell
		} else 
		if (input.substring(input.length() - 1).equals("%")) {
			thisSheet[loc.getRow()][loc.getCol()] = new PercentCell(input); //assignment to PercentCell
		} else {
			thisSheet[loc.getRow()][loc.getCol()] = new ValueCell(input); //assignment to ValueCell
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