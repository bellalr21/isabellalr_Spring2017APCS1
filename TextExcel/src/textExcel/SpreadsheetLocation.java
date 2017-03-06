package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private String location = "";
    @Override
    public int getRow()
    {
        int rowValue = Integer.parseInt(location.substring(1)) - 1;
        return rowValue;
    }

    @Override
    public int getCol()
    {
        int colValue = location.charAt(0) - 65;
        return colValue;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        location = cellName;
    }

}
