import java.util.*;
// Main Class
class Main
{
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
       Table table = new Table(3);
        table.InsertColumnNames("name" , "last_name");
        table.InsertRow("israel" , "israeli");
        System.out.println( table.getValue("last_name", 0));
    }
}

// Table Class
class Table
{
    // Declare Properties.
    private String columnFirst;
    private String columnSec;
    private String[][] table;
    //Construction
    Table(int amountPeople)
    {
        this.table = new String[amountPeople+1][2];
    }
    //Set Column names
     public void InsertColumnNames(String columnFirst, String columnSec)
    {
        this.table[0][0] = columnFirst;
        this.table[0][1] = columnSec;
    }
    // Set Row Data
    public void InsertRow(String columnFirst, String columnSec)
    {
        int FreeIndex = 0;
        while (table[FreeIndex][0] != null)
        {
            FreeIndex++;
        }
        if (FreeIndex != table.length)
        {
            table[FreeIndex][0] = columnFirst;
            table[FreeIndex][1] = columnSec;
        }
        else
        {
            System.out.println("No place left for inserting.");
        }
    }
    // Get Cell Value.
    public String getValue(String colName , int index)
    {
        index++;
         if( !(table[0][0].equals(colName) || table[0][1].equals(colName)) || index >= table.length)
         {
             System.out.println("Error");
             return null;
         }
         if (table[0][0].equals(colName)){return table[index][0];}
         else{return table[index][1];}
    }
}
