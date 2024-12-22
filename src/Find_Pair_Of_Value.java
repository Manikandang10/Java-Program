import java.util.HashSet;

public class Find_Pair_Of_Value {

    public static void find_pair()
    {
        int [] a={1,2,3,5,6,8,7,9};
        int target=103;
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int k=i+1;k<a.length;k++)
            {
                if(a[i]+a[k]==target)
                {
                    System.out.println(a[i]+" " +a[k]);
                    c=1;
                }
            }
        }

        System.out.println(c==0?"No Pair Found":"");
    }
}
