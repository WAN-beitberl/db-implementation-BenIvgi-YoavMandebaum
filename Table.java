package ObjBen;
class Table
{
    // Declare Properties.
    private String [] headlines;
	private int length;
	private int currentInd;
    private String[][] table;
	
    //Construction
    Table(int length)
    {
        this.length = length;
		this.table = new String[100][this.length];
		this.headlines = new String[length];
		for(int i = 0; i < this.length; i++)
		{
			this.headlines[i] = "unnamed column";
		}
		this.currentInd = 0;
	}
	
    //Set Column names
     public void InsertColumnNames(String... names)
    {
		int index = 0;
		for(String name : names)
		{
			this.headlines[index] = name;
			index++;
		}
    }
	
    // Set Row Data
    public void InsertRow(String... colData)
    {
		int index = 0;
		for(String colRec : colData)
		{
			this.table[this.currentInd][index] = colRec;
			index++;
		}
    }
	
    // Get Cell Value.
    public String getValue(String colName , int index)
    {
		int i;
		for(i = 0; !(this.headlines[i].equals(colName)) && i < this.length; i++);
        if (i == length)
		{
			System.out.println("Error.\n");
			return null;
		}
		return table[index][i];
    }
}