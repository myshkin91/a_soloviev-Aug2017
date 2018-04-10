package textExcel;

public class ValueCell extends RealCell{
	
	public ValueCell(String input) {
		super(input);
	}
	public String abbreviatedCellText() {
		String cellText = Double.toString(getDoubleValue());
		if(cellText.length()<10) {
			if(!cellText.contains(".")) {
				cellText += ".0";
			}
			return addSpaces(cellText);
		}else {
			return cellText.substring(0,10);
		}
	}
	public String fullCellText() {
		return getRealCell();
	}
	public double getDoubleValue() {
		return Double.parseDouble(getRealCell());
	}

}
