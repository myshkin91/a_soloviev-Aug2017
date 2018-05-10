//Alex Soloviev

package textExcel;

public class TextCell implements Cell {
	
	private String text;
	
	//constructor
	public TextCell (String text){
		this.text = text;
	}
	
	public String fullCellText(){
		return text;
	}
	
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
