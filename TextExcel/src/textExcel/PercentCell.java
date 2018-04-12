package textExcel;

public class PercentCell extends RealCell {
	
	public PercentCell (String input) {
		super(input);
	}
	
	public String abbreviatedCellText() {
		int decimalPoint = getRealCell().indexOf(".");
		return (getRealCell().substring(0,decimalPoint) + "%");
	}
	public String fullCellText() {
		String text = getDoubleValue() + "";
		return text;
	}
	public double getDoubleValue() {
		String num = getRealCell().substring(0,getRealCell().length()-1);
		return Double.parseDouble(num) / 100.0;
	}

}
