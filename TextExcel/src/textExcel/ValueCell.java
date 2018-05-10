//Alex Soloviev

package textExcel;

public class ValueCell extends RealCell{
	
	//constructor
	public ValueCell(String input) {
		super(input);
	}
	
	public String fullCellText() {
		return input;
	}
	
	public String abbreviatedCellText() {
		String temp = getDoubleValue() + "";
		while(temp.length() < 10) {
			temp += " ";
		}
		return temp.substring(0, 10);
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(input);
	}
}
