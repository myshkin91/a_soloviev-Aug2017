//Alex Soloviev

package textExcel;

import java.util.ArrayList;

public class FormulaCell extends RealCell {

	private Cell[][] thisSheet;

	// constructor
	public FormulaCell(String input, Cell[][] thisSheet) {
		super(input);
		this.thisSheet = thisSheet;
	}

	public String abbreviatedCellText() {
		String temp = getDoubleValue() + "";
		for (int i = temp.length(); i < 10; i++) {
			temp += " ";
		}
		return temp.substring(0, 10);
	}

	public String fullCellText() {
		return input;
	}

	public double getDoubleValue() {
		String formula = input.substring(2, input.length() - 2).toLowerCase();
		String[] arrFormula = formula.split(" ");
	
		if (formula.startsWith("sum")) {//sum
			return sum(arrFormula[1]);
		}else if(formula.startsWith("avg")) {//average
			return sum(arrFormula[1])/(retrieveCellRange(arrFormula[1]).size());
		}else {
			double result = determineDouble(arrFormula[1]);
			for(int i = 2; i < arrFormula.length; i+=2) {
				String operator = arrFormula[i-1];
				double number = determineDouble(arrFormula[i]);
				if(operator.equals("+")) {
					result +=number;
				}else
				if (operator.equals("-")) {
					result -=number;
				}else
				if(operator.equals("*")) {
					result *=number;
				}else
				if(operator.equals("/")) {
					result /=number;
				}
			}
			return result;
		}
		
	}

	public double determineDouble(String result) {
		if(Character.isDigit(result.charAt(0)) || result.charAt(0) == '-') {//Check if the first character of result is a digit or a negative sign
			return Double.parseDouble(result);//Use Double.ParseDouble to get the number, return the number
		}else {
			SpreadsheetLocation loc = new SpreadsheetLocation(result);
			return ((RealCell)thisSheet[loc.getRow()][loc.getCol()]).getDoubleValue();
			//Make new SpreadsheetLoaction object by passing in "result", use spreadsheet location.get row and get col to access the 
			//correct index in the array.
			//return the .getDoubleValue
		}
	}
	public ArrayList<RealCell> retrieveCellRange (String cellRange){
		ArrayList<RealCell> cells = new ArrayList<RealCell>();
		
		String cell1 = cellRange.substring(0, cellRange.indexOf("-"));
		String cell2 = cellRange.substring(cellRange.indexOf("-") +1, cellRange.length());
		SpreadsheetLocation loc1 = new SpreadsheetLocation(cell1);
		SpreadsheetLocation loc2 = new SpreadsheetLocation(cell2);
		
		for(int r = loc1.getRow(); r <= loc2.getRow(); r++) {
			for(int c = loc1.getCol(); c <= loc2.getCol(); c++) {
				cells.add((RealCell) thisSheet[r][c]);
			}
		}
		return cells;
	}

	public double sum (String cells) {
		ArrayList<RealCell> allCells = retrieveCellRange(cells);
		double sum = 0;
		for(RealCell c: allCells) {
			sum += c.getDoubleValue();
		}
		return sum;
	}

}
