//Alex Soloviev
package textExcel;

public class RealCell implements Cell{
	
	protected String input;
	
	//constructor
	public RealCell(String input) {
		this.input = input;
	}
	@Override
	public String abbreviatedCellText() {
		return input.substring(0,10);
	}
	
	@Override
	public String fullCellText() {
		return input;
	}
	
	public double getDoubleValue() {
		return 0.0;
	}
	
	public String getRealCell() {
		return input;
	}
	
	//adds spaces to fill up the cell
	public String addSpaces(String input) {
		for(int i = input.length(); i < 10; i++) {
			input+= " ";
		}
		return input;
	}
}
