//Alex Soloviev

package textExcel;

public class PercentCell extends RealCell {
	
	//constructor
	public PercentCell (String input) {
		super(input);
	}
	
	//This method returns non-truncated cell contents in decimal form
	public String fullCellText() {
		return "" + getDoubleValue();
	}
	
	//This method returns cell contents truncated to ten spaces in percent form
	public String abbreviatedCellText() {
		int decimal = getRealCell().indexOf(".");
		String temp = getRealCell().substring(0, decimal);
		if(temp.length() < 10) {
			temp += "%";
			for(int i = temp.length(); i < 10; i++) {
				temp+= " ";
			}return temp;
		}else {
			return temp.substring(0,8) + "%";
		}
	}
		
	//This method returns the double value of the percent
	public double getDoubleValue() {
		return Double.parseDouble(input.substring(0,input.length()-1)) / 100.0;
	}

}
