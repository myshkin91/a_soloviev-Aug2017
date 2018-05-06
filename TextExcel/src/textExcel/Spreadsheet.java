package textExcel;

public class Spreadsheet implements Grid {
	
	private Cell[][] thisSheet;
	
	public Spreadsheet(){
		thisSheet = new Cell[getRows()][getCols()]; 
		clear();
		}
	
	public String processCommand(String command){
		String [] parts = command.split(" ", 3);
		String command1 = command.toLowerCase();
		if(command1.equals("clear")) {
			clear();
		}else if(command1.startsWith("clear")){ 
			SpreadsheetLocation loc = new SpreadsheetLocation(command.split(" ")[1]);
			thisSheet[loc.getRow()][loc.getCol()] = new EmptyCell();
		}else if (command.contains("=")) {
			assignValue(parts[0],parts[2]);
			}
		else {
			SpreadsheetLocation loc = new SpreadsheetLocation(command);
			return thisSheet[loc.getRow()][loc.getCol()].fullCellText();
		}
		return getGridText();
	}

	
	public int getRows(){
		return 20;
	}

	
	public int getCols(){
		return 12;
	}

	
	public Cell getCell(Location loc){
		return thisSheet[loc.getRow()][loc.getCol()];
	}

	
	public String getGridText(){
		String output = "   ";
		
		for(int i = 0; i < thisSheet[0].length; i++) {
			output = output + "|" + ((char)(65 + i)) + "         ";
	}
		output += "|\n";
		for(int r = 0; r <thisSheet.length; r++) {
			String rowNumber = "" + (r + 1);
			while(rowNumber.length()<3) {
				rowNumber += " ";
			}
			output += rowNumber;
			for(int c = 0;c<thisSheet[0].length; c++) {
				output = output + "|" + thisSheet[r][c].abbreviatedCellText();
			}
			output += "|";
			output += "\n";
		}
		return output;
	}	
	private void assignValue(String cell, String input) {
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
		if(input.substring(0,1).equals("\"")) {
			thisSheet[loc.getRow()][loc.getCol()] = new TextCell(input);
		}
		else if(input.substring(input.length()-1).equals("%")){
			thisSheet[loc.getRow()][loc.getCol()] = new PercentCell(input);
		}
		else if(input.charAt(0) == ('(')) {
			thisSheet[loc.getRow()][loc.getCol()] = new FormulaCell(input);
		}
		else {
			thisSheet[loc.getRow()][loc.getCol()] = new ValueCell(input);
		}
	}
	private void clear() {
		for (int r = 0; r< thisSheet[0].length; r++) {
			for (int c = 0; c< thisSheet.length; c++) {
				thisSheet[c][r] = new EmptyCell();
			}
		}
	}}