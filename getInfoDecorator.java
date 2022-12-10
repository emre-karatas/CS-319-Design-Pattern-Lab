//Emre Karatas - 22001641
public class getInfoDecorator implements getInfo
{
    private getInfo gi;
    getInfoDecorator(getInfo gi)
    {
        this.gi = gi;

    }

    @Override
    public String getInfo()
    {
       return gi.getInfo();
    }
}
