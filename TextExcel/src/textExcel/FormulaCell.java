package textExcel;

public class FormulaCell extends RealCell {
	
	public FormulaCell(String input) {
		super(input);
	}
	
	public String abbreviatedCellText() {
		return getDoubleValue()+"";
	}
	
	public double getDoubleValue() {
		return 0;
	}
	

}
