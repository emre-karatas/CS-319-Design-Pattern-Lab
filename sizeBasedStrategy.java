import java.util.ArrayList;
//Emre Karatas - 22001641
public class sizeBasedStrategy implements MemRepStrategy
{
    private ArrayList<Directory> DirectoryList;
    sizeBasedStrategy(ArrayList<Directory>DirectoryList)
    {
        this.DirectoryList = DirectoryList;

    }

    @Override
    public void applyMemoryRepresentation()
    {
        System.out.print("{  ");
        System.out.print("[  ");
        for(int i = 0; i < DirectoryList.size(); i++)
        {
            System.out.print(" [  ");
            for(int z = 0; z < DirectoryList.get(i).fileList.size(); z++)
            {
                System.out.print(" ( ");
                System.out.print(DirectoryList.get(i).fileList.get(z).fileSize);
                System.out.print(" ) ");

            }
            for(int  j = 0; j < DirectoryList.get(i).DirectoryList.size(); j++)
            {
                System.out.print(" [ ");
                for(int z = 0; z < DirectoryList.get(i).DirectoryList.get(j).fileList.size(); z++)
                {
                    System.out.print(" ( ");
                    System.out.print(DirectoryList.get(i).DirectoryList.get(j).fileList.get(z).fileSize);
                    System.out.print("  ) ");

                }
                System.out.print(" ]");

            }
            System.out.print("  ]");
        }
        System.out.print("  ]");
        System.out.print("  }");

    }

    @Override
    public void adjustMemoryRepresentation(MemRepStrategy mrs)
    {
        this.applyMemoryRepresentation();

    }
}
