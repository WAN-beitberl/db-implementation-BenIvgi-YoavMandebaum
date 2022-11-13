package ObjBen;
import java.util.*;
import ObjBen.Table;
class Main
{
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
       Table table = new Table(5);
        table.InsertColumnNames("name" , "last_name", "age", "id", "adderss");
        table.InsertRow("israel" , "israeli", "56", "323232323", "hasharon 5");
        System.out.println( table.getValue("id", 0));
    }
}


