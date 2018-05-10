//Alex Soloviev

package textExcel;

public class RealCell implements Cell{
	
	protected String input;
	
	//constructor
	public RealCell(String input) {
		this.input = input;
	}
	@Override
	//This method returns the cell contents truncated to ten spaces
	public String abbreviatedCellText() {
		return input.substring(0,10);
	}
	
	@Override
	//This method returns the non-truncated cell contents
	public String fullCellText() {
		return input;
	}
	
	public double getDoubleValue() {
		return 0.0;
	}
	
	public String getRealCell() {
		return input;
	}
} 
