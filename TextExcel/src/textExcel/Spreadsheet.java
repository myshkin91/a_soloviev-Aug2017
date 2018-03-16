package textExcel;

public class Spreadsheet implements Grid {
	private Cell[][] grid = new Cell[12][20];
	public Spreadsheet(){
		for(int row = 0; row < 12; row++) {
			for(int col = 0;col <20;col++) {
				grid[row][col] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String command)
	{
		return "";
	}

	@Override
	public int getRows()
	{
		return 20;
	}

	@Override
	public int getCols()
	{
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
