public class Asecnding_And_Descenting {
    public static void order()
    {
        int[] bw={4,3,5,3,7,9,3,12,10};
        int[] b={1,2,3,4,5,6,7,8,9,10};
        int[] c={10,9,8,7,6,5,4,3,2,1};
        int count=0;
        //Ascending Order
        for(int i=0;i<b.length;i++)
        {
            for(int j=1+i;j<b.length;j++)
            {
                count++;
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order....."+count);
        for(int i:b)
        {
            System.out.print(i+" ");
        }
        //Descending Order
        for(int i=0;i<b.length;i++)
        {
            for(int j=1+i;j<b.length;j++)
            {
                if(b[i]<b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }

        System.out.println("\nDescending Order.....");
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}
