//Emre Karatas - 22001641

public class main
{
    public static void main(String args[])
    {
        // Test Case 1
        System.out.println("Test Case 1");
        getInfoGroup gig = new getInfoGroup();
        gig.addComponent(new File("video","mp4",200));
        System.out.println(gig.getInfo());
        System.out.println("----------------------");
        // Test Case 2
        System.out.println("Test Case 2");
        getInfoGroup gig2 = new getInfoGroup();
        Directory d1 = new Directory("MyDocuments");
        gig2.addComponent(d1);
        System.out.println(gig2.getInfo());
        System.out.println("----------------------");
        // Test Case 3
        System.out.println("Test Case 3");
        Directory d2 = new Directory("FavoriteMusic");
        getInfoGroup gig3 = new getInfoGroup();
        gig3.addComponent(d2);
        d2.addFile("MetallicaTheUnforgiven","mp3",100);
        System.out.println(gig3.getInfo());
        System.out.println("----------------------");
        //Test Case 4
        System.out.println("Test Case 4");
        getInfoGroup gig4 = new getInfoGroup();
        Directory d3 = new Directory("BilkentStuff");
        gig4.addComponent(d3);
        d3.addFile("InternshipReport","pdf",10);
        d3.addFile("setup","exe",5);
        d3.addFile("ToDoList","docx",15);
        d3.addDirectory(d2);
        System.out.println(gig4.getInfo());
        System.out.println("----------------------");
        //Test Case 5
        System.out.println("Test Case 5");
        getInfoGroup gig5 = new getInfoGroup();
        Directory d4 = new Directory("MyPC");
        gig5.addComponent(d4);
        d4.addDirectory(d1);
        d4.addDirectory(d3);
        System.out.println(gig5.getInfo());
        System.out.println("----------------------");
        //Test Case 6
        System.out.println("Test Case 6");
        getInfoDecorator gid1 = new typeIndicationDecorator(gig5);
        System.out.println(gid1.getInfo());
        System.out.println("----------------------");
        //Test Case 7
        System.out.println("Test Case 7");
        getInfoDecorator gid2 = new indentationDecorator(gig5);
        System.out.println(gid2.getInfo());
        System.out.println("----------------------");
        //Test Case 8
        System.out.println("Test Case 8");
        getInfoDecorator gid3 = new typeIndicationDecorator(new indentationDecorator(gig5));
        System.out.println(gid3.getInfo());
        System.out.println("----------------------");
        //Test Case 9
        System.out.println("Test Case 9");
        d4.adjustMemoryRepresentation(new sizeBasedStrategy(d4.DirectoryList));
        d4.applyMemoryRepresentation();
        System.out.println();
        System.out.println("----------------------");
        //Test Case 10
        System.out.println("Test Case 10");
        d4.adjustMemoryRepresentation(new typeBasedStrategy(d4.DirectoryList));
        d4.applyMemoryRepresentation();




    }
}
