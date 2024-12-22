import java.util.Arrays;

public class Merge_Array {
    public static void merge_Two_Array()
    {
        int[]a={1,2,3,4,5,6};
        int[]b={1,2,3,4,5,6};

        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length)
        {
            c[k++]=a[i++];
            c[k++]=b[j++];
        }

        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }

        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
