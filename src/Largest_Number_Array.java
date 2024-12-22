public class Largest_Number_Array {
    public static void Find_large()
    {
        int []a={1,2,3,2,4,5,64,6,5,4,3};

        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
