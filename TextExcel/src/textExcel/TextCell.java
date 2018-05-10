//Alex Soloviev

package textExcel;

public class TextCell implements Cell {
	
	private String text;
	
	//constructor
	public TextCell (String text){
		this.text = text;
	}
	
	//This method returns the non-truncated cell contents
	public String fullCellText(){
		return text;
	}
	
	//This method returns the cell contents truncated to ten spaces
	public String abbreviatedCellText(){
		String abbreviated = text.substring(1,text.length()-1);
		if(abbreviated.length() >= 10) {
			return abbreviated.substring(0,10);
		} else {
			int i = abbreviated.length();
			while(i < 10) {
				abbreviated += " ";
				i++;
			}
		}
		return abbreviated;
	}
}
