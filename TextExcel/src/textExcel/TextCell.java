package textExcel;

public class TextCell implements Cell {
	
	private String entry;
	public TextCell (String entry){
		this.entry = entry;
	}
	
	public String fullCellText(){
		return "\"" + entry + "\"";
	}
	
	public String abbreviatedCellText(){
		String abbreviated;
		if(entry.length()> 10) {
			abbreviated = entry.substring(0, 10);
		} else{
			abbreviated = entry;
			for (int i = entry.length(); i<= 10-1; i++) {
				abbreviated += " ";
			}
		}
		return abbreviated;
	}

}
