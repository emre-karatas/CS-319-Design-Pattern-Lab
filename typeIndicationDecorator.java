import java.util.Scanner;
//Emre Karatas - 22001641
public class typeIndicationDecorator extends getInfoDecorator
{

    typeIndicationDecorator(getInfo gi) {
        super(gi);
    }

    @Override
    public String getInfo()
    {
        String output = super.getInfo();
        return typeIndication(output);
    }

    public String typeIndication(String message)
    {

        StringBuilder result = new StringBuilder();
        Scanner scan = new Scanner(message);
        int counter = 0;
        String empty = "    ";
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            if (line.contains("-"))
            {
                if (line.contains("DIRECTORY END"))
                {
                    line =  " (!) " + line;
                    line += "\n";
                    result.append(line);
                }
                else
                {
                    line = " (d) " + line;
                    line += "\n";
                    result.append(line);
                }
            }
            else
            {
                if (line.contains("File Size"))
                {
                    line = " (f) " + line;
                    line += "\n";
                    result.append(line);
                }
            }
        }
        return result.toString();

    }
}
