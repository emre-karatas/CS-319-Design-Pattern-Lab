import java.util.ArrayList;
//Emre Karatas - 22001641
public class typeBasedStrategy implements MemRepStrategy
{
    private ArrayList<Directory> DirectoryList;
    typeBasedStrategy(ArrayList<Directory>DirectoryList)
    {
        this.DirectoryList = DirectoryList;

    }

    @Override
    public void applyMemoryRepresentation()
    {
        System.out.print("{  ");
        System.out.print(" [" + " D" + 0);
        for(int i = 0; i < DirectoryList.size(); i++)
        {
            if(i == 0)
                System.out.print(" ["+ " D" + (i+1) + " ");
            else
                System.out.print(" ["+ " D" + (i) + " ");
            for(int z = 0; z < DirectoryList.get(i).fileList.size(); z++)
            {
                System.out.print(" ( ");
                System.out.print("F");
                System.out.print(" ) ");

            }
            int j;
            for(j = 0; j < DirectoryList.get(i).DirectoryList.size(); j++)
            {
                System.out.print(" [ " + "D" + (i+1));
                int z;
                for(z = 0; z < DirectoryList.get(i).DirectoryList.get(j).fileList.size(); z++)
                {
                    System.out.print(" ( ");
                    System.out.print("F");
                    System.out.print("  ) ");

                }
                System.out.print(" EOD"+ (z+1) + " ]");



            }
            if (i!= 0)
                System.out.print(" EOD"+  (i) + "]" );
            else
                System.out.print(" EOD"+  (i+1) + "]" );
        }
        System.out.print(" EOD " + 0 + "]" );
        System.out.print("}");

    }

    @Override
    public void adjustMemoryRepresentation(MemRepStrategy mrs)
    {
        this.applyMemoryRepresentation();

    }
}
