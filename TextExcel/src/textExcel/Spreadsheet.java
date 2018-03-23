package textExcel;

public class Spreadsheet implements Grid {
	Cell[][] thisSheet;
	
	public Spreadsheet(){
		thisSheet = new Cell[getRows()][getCols()]; 
		reset();
		}

	public String processCommand(String command){
		
		String[] parsed = command.split(" ",3);
		
		if(parsed.length == 1) {
			if (Character.isAlphabetic(Character.toLowerCase(command.charAt(0))) && Character.isDigit(command.charAt(1))) {
				Location thisCell = new SpreadsheetLocation(command);
				return getCell(thisCell).fullCellText();
			} else if (parsed.length == 2) {
				if(command.toLowerCase().startsWith("clear")) {
					Location thisCell = new SpreadsheetLocation(parsed[1]);
					thisSheet[thisCell.getRow()][thisCell.getCol()] = new EmptyCell();
					return getGridText();
				}
			} else {
				if(Character.isAlphabetic(Character.toLowerCase(command.charAt(0))) && Character.isDigit(command.charAt(1))) {
					if(parsed[1].equals("=")) {
						if(parsed[2].startsWith("" + '"')) {
							Location thisCell = new SpreadsheetLocation(parsed[0].toLowerCase());
							String input = parsed[2].substring(1, (parsed[2].length() - 1));
							thisSheet[thisCell.getRow()][thisCell.getCol()] = new TextCell(input);
							return getGridText();
						}
					}
				}
			}
		}return "";
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
		String output = "  ";
		
		for(int i = 0; i < thisSheet.length; i++) {
			output = output + "|" + ((char)(65 + i)) + "          ";
	}
		output += "|\n";
		for(int r = 0; r<thisSheet[0].length; r++) {
			String rowNumber = "" + (r + 1);
			while(rowNumber.length()<3) {
				rowNumber += " ";
			}
			output += rowNumber;
			for(int c = 0;c<thisSheet[0].length; c++) {
				output = output + "|" + thisSheet[c][r].abbreviatedCellText();
			}
			output += "|";
			output += "\n";
		}
		return output;
	}	
	private void reset() {
		for (int r = 0; r< thisSheet[0].length; r++) {
			for (int c = 0; c< thisSheet.length; c++) {
				thisSheet[c][r] = new EmptyCell();
			}
		}
	}
}