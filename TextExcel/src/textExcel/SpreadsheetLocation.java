//Alex Soloviev

package textExcel;

public class SpreadsheetLocation implements Location{
	
	private String cellName;
	
	//constructor
	 public SpreadsheetLocation(String cellName){
 		this.cellName = cellName.toLowerCase();
	 }
    
    public int getRow(){
        String number = cellName.substring(1,cellName.length());
        int row = 0;
        while(!(number.equals(""+ row))) {
        		row ++;
        }
        return row - 1;
    }

    public int getCol(){
        char letter = cellName.charAt(0);
        letter = Character.toLowerCase(letter);
        return Character.getNumericValue(letter)- Character.getNumericValue('a');
    }
}
