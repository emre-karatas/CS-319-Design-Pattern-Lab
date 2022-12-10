//Emre Karatas - 22001641

public class File extends  getInfoComponent
{
    public  String fileName;
    public String extension;
    public int fileSize;
    File(String fileName,String extension,int fileSize)
    {
        this.fileName = fileName;
        this.extension = extension;
        this.fileSize = fileSize;
    }

    public String getInfo()
    {
        String output = "";
        output += fileName;
        output += ".";
        output +=extension;
        output +="| ";
        output +="File Size: ";
        output +=fileSize;
        output +=" kb";
        output +="\n";

        return output;
    }

}
