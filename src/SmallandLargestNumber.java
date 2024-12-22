import java.util.Arrays;

public class SmallandLargestNumber {
    public static void find()
    {
        int[] a={2,4,1,6,8,90,4,0,7,};

        Arrays.sort(a);

        System.out.println(a[1]);
        System.out.println(a[a.length-2]);

        //Another Way of Handle Manual Sorting

        int[]b={2,4,1,6,8,90,4,0,7,};

        for(int i=0;i<b.length;i++)
        {
            for(int j=1+i;j<b.length;j++)
            {
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }

        System.out.println(b[1]);
        System.out.println(b[b.length-2]);
    }
}
