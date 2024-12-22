import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Specific_Element_Array {

    public static void remove()
    {
        int[]a={1,2,3,4,5,6,7,8};

        int remove=3;
        int index=0;

        int []b=new int[a.length-1];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=remove)
            {
                b[index++]=a[i];
            }
        }

        System.out.println("Old Array" + Arrays.toString(a));
        System.out.println("new Array" + Arrays.toString(b));
    }
    public static void crtremove()
    {
        int[]a={1,2,3,4,5,6,3,8,7,8,8,};
        int remove=8;
        int r=1;

           for (int i = 0; i < a.length; i++) {
               if (a[i] == remove) {
                   int k = i;
                   r++;
                   for (int j = i; j < a.length - 1; j++) {
                       a[k++] = a[j + 1];
                   }
               }
           }

        for(int i=0;i<a.length-r;i++)
        {
            System.out.print(a[i] +" ");
        }
    }

    public static void UsingArrayList()
    {
        ArrayList<Integer> remo=new ArrayList<>();
        int[]a={1,2,3,4,8,5,6,3,8,7,8,9,8};
        for(int i:a)
        {
            remo.add(i);
        }

        for(int i=0;i<remo.size();i++)
        {
            if(remo.get(i)==8)
            {
                remo.remove(i);
            }
            System.out.println(remo);
        }

    }
}
