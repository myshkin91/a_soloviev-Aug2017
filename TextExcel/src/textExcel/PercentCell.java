//Alex Soloviev

package textExcel;

public class PercentCell extends RealCell {
	
	//constructor
	public PercentCell (String input) {
		super(input);
	}
	
	public String fullCellText() {
		return "" + getDoubleValue();
	}
	
	//text that is displayed in spreadsheet
	public String abbreviatedCellText() {
		int decimal = getRealCell().indexOf(".");
		String temp = getRealCell().substring(0, decimal);
		if(temp.length() < 10) {
			temp += "%";
			return super.addSpaces(temp);
		}else {
			return temp.substring(0,8) + "%";
		}
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(input.substring(0,input.length()-1)) / 100.0;
	}

}
