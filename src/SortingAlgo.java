public class SortingAlgo {
    public static void SelectionSort()
    {
        int[] a={2,4,3,1,4,5,6,7,8,97,6,5};

        for (int i = 0; i <a.length ; i++) {
            int minindex=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[minindex])
                {
                    minindex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }

        for (int d:a)
        {
            System.out.print(d+" ");
        }
    }
}
