package textExcel;

public class TextCell implements Cell {
	
	private String cellContents;
	
	//constructor
	public TextCell (String contents){
		cellContents = contents;
	}
	
	public String fullCellText(){
		return cellContents;
	}
	
	public String abbreviatedCellText(){
		String abbreviated = cellContents.substring(1,cellContents.length()-1);
		if(abbreviated.length() >= 10) {
			return abbreviated.substring(0,10);
		} else{
			for (int i = abbreviated.length(); i < 10; i++) {
				abbreviated += " ";
			}
		}
		return abbreviated;
	}
}
