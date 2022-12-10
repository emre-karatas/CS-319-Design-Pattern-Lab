import java.util.ArrayList;
//Emre Karatas - 22001641
public class getInfoGroup extends getInfoComponent
{
    public  ArrayList<getInfoComponent> gigList;

    getInfoGroup()
    {
        gigList = new ArrayList<>();
    }

    public String getInfo()
    {
        String output = "";
        for (int i = 0; i < gigList.size(); i++)
        {
            output+=gigList.get(i).getInfo();
        }
        return output;

    }

    public void addComponent(getInfoComponent gic)
    {
        gigList.add(gic);
    }

}
