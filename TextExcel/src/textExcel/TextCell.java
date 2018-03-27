package textExcel;

public class TextCell implements Cell {
	
	private String cellContents;
	public TextCell (String contents){
		cellContents = contents;
	}
	
	public String fullCellText(){
		return "\"" + cellContents + "\"";
	}
	
	public String abbreviatedCellText(){
		String abbreviated;
		if(cellContents.length() > 10) {
			abbreviated = cellContents.substring(0, 10);
		} else{
			abbreviated = cellContents;
			for (int i = cellContents.length(); i <= 10-1; i++) {
				abbreviated += " ";
			}
		}
		return abbreviated;
	}

}
