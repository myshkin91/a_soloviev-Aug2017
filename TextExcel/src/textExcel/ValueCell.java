//Alex Soloviev

package textExcel;

public class ValueCell extends RealCell{
	
	//constructor
	public ValueCell(String input) {
		super(input);
	}
	
	//This method returns the non-truncated cell contents
	public String fullCellText() {
		return input;
	}
	
	//This method returns the cell contents truncated to ten spaces
	public String abbreviatedCellText() {
		String temp = getDoubleValue() + "";
		while(temp.length() < 10) {
			temp += " ";
		}
		return temp.substring(0, 10);
	}
	
	//This method returns the double value 
	public double getDoubleValue() {
		return Double.parseDouble(input);
	}
}
