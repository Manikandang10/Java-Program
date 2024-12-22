import java.io.FileReader;
import java.io.FileWriter;

public class ExceptionCheck{

    public static void checking()
    {
        int a=1;

        if(a>5)
            System.out.println("Correct");
        else
            throw new RuntimeException("Not correct");


        System.out.println("working");
    }

    public static void FileHandling()
    {
        try {
            FileWriter w=new FileWriter("Ram.txt");
            String s="Good Morning";
            w.write(s);
            w.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void ReadFile() {
        try {
            FileReader r = new FileReader("Ram.txt");
            StringBuffer s=new StringBuffer();
            int i=0;

            while((i=r.read())!=-1)
            {
                s.append((char) i);
            }

            System.out.println(s);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
