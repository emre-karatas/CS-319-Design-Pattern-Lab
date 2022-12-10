//Emre Karatas - 22001641
import java.util.ArrayList;


public class Directory extends getInfoComponent
{
    public String directoryName;
    public ArrayList<File> fileList;
    public ArrayList<Directory> DirectoryList;
    

    Directory(String directoryName)
    {
        this.directoryName = directoryName;
        fileList = new ArrayList<>();
        DirectoryList = new ArrayList<>();
    }

    public String getInfo()
    {
        String output = "";
        output += "- ";
        output+= directoryName;
        output+= "\n";
        for(int i = 0; i < fileList.size(); i++)
        {
            output+= (fileList.get(i).getInfo());
        }
        for(int i = 0; i < DirectoryList.size(); i++)
        {
            String output2 = "";
            output2+="- ";
            output2+= DirectoryList.get(i).directoryName;
            output2+= "\n";
            for(int j = 0; j < DirectoryList.get(i).fileList.size(); j++)
            {
                output2+=(DirectoryList.get(i).fileList.get(j).getInfo());
            }
           output +=(output2);
            String output3 = "";
            for(int k = 0; k < DirectoryList.get(i).DirectoryList.size(); k++)
            {
                output3+=(DirectoryList.get(i).DirectoryList.get(k).getInfo());
            }
            output3 += "- DIRECTORY END |  ";
            output3+= (DirectoryList.get(i).directoryName);
            output3+=("\n");
            output+=(output3);

        }
        output+=("- DIRECTORY END | ");
        output+=(directoryName);
        output+=("\n");

       return output;

    }

    public void addFile(String fileName,String extension,int fileSize)
    {
        File insideFile = new File(fileName,extension,fileSize);
        fileList.add(insideFile);
    }

    public void addDirectory(Directory d)
    {
        DirectoryList.add(d);
    }

    public void deleteDirectory(Directory d)
    {
        if(!d.DirectoryList.isEmpty())
        {
            for(int i = 0; i < d.DirectoryList.size(); i++)
            {
                if(!d.DirectoryList.get(i).fileList.isEmpty())
                {
                    for(int j = 0; j < d.DirectoryList.get(i).fileList.size(); j++)
                    {
                        deleteFile(d.DirectoryList.get(i).fileList.get(j));
                    }
                }
                d.deleteDirectory(d.DirectoryList.get(i));
            }
        }
        else
        {
            if(d.fileList.isEmpty())
            {
                DirectoryList.remove(d);
            }
            else
            {
                for(int i = 0; i < d.fileList.size();i++)
                {
                    d.fileList.remove(fileList.get(i));
                }
            }
        }
    }

    public void deleteFile(File f)
    {
        fileList.remove(f);

    }

    public void applyMemoryRepresentation()
    {

    }

    public void adjustMemoryRepresentation(MemRepStrategy mrs)
    {
        mrs.applyMemoryRepresentation();
    }

}


