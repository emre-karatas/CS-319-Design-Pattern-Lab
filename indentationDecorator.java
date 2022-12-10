import java.util.Scanner;
//Emre Karatas - 22001641

public class indentationDecorator extends getInfoDecorator
{

    indentationDecorator(getInfo gi) {
        super(gi);
    }

    @Override
    public String getInfo() {
        String output = super.getInfo();
       return indentation(output);
    }

    public String indentation(String message)
    {
        StringBuilder result = new StringBuilder();
        Scanner scan = new Scanner(message);
        int counter = 0;
        String empty = "    ";
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            if(line.contains("-"))
            {
                line += "\n";
                line = empty + line;
                result.append(line);
            }
            else if (line.contains("DIRECTORY END"))
            {
                line = line +  "\n" + empty;
                result.append(line);
            }
            else if (line.contains("File Size"))
            {
                line = line + "\n" + empty;
                result.append(line);
            }

        }
        return result.toString();


    }
}
