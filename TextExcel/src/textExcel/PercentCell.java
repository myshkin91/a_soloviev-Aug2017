package textExcel;

public class PercentCell extends RealCell {
	
	//constructor
	public PercentCell (String input) {
		super(input);
	}
	
	public String abbreviatedCellText() {
		int decimalPoint = getRealCell().indexOf(".");
		String wholeNum = getRealCell().substring(0,decimalPoint);
		if(wholeNum.length() < 10) {
			wholeNum += "%";
			return super.addSpaces(wholeNum);
		}else {
			return (wholeNum.substring(0,8) + "%");
		}
	}
	
	public String fullCellText() {
		return getDoubleValue() + "";
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(input.substring(0,input.length()-1)) / 100.0;
	}

}
