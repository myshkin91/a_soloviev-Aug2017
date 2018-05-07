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
		return 0;
	}
	
	public String getRealCell() {
		return input;
	}
	
	public String addSpaces(String inputText) {
		while(inputText.length() < 10) {
			inputText += " ";
		}
		return inputText;
	}
}
