package textExcel;

public class SpreadsheetLocation implements Location{
   
	@Override
    
    public int getRow()
    {
        return 0;
    }

    @Override
    public int getCol()
    {
        return 0;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    }

}
